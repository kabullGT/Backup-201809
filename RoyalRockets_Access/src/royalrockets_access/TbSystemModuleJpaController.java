/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalrockets_access;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import royalrockets_access.exceptions.IllegalOrphanException;
import royalrockets_access.exceptions.NonexistentEntityException;
import royalrockets_access.exceptions.PreexistingEntityException;

/**
 *
 * @author Kabull
 */
public class TbSystemModuleJpaController implements Serializable {

    public TbSystemModuleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TbSystemModule tbSystemModule) throws PreexistingEntityException, Exception {
        if (tbSystemModule.getTbAccessLevelCollection() == null) {
            tbSystemModule.setTbAccessLevelCollection(new ArrayList<TbAccessLevel>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<TbAccessLevel> attachedTbAccessLevelCollection = new ArrayList<TbAccessLevel>();
            for (TbAccessLevel tbAccessLevelCollectionTbAccessLevelToAttach : tbSystemModule.getTbAccessLevelCollection()) {
                tbAccessLevelCollectionTbAccessLevelToAttach = em.getReference(tbAccessLevelCollectionTbAccessLevelToAttach.getClass(), tbAccessLevelCollectionTbAccessLevelToAttach.getTbAccessLevelPK());
                attachedTbAccessLevelCollection.add(tbAccessLevelCollectionTbAccessLevelToAttach);
            }
            tbSystemModule.setTbAccessLevelCollection(attachedTbAccessLevelCollection);
            em.persist(tbSystemModule);
            for (TbAccessLevel tbAccessLevelCollectionTbAccessLevel : tbSystemModule.getTbAccessLevelCollection()) {
                TbSystemModule oldTbSystemModuleOfTbAccessLevelCollectionTbAccessLevel = tbAccessLevelCollectionTbAccessLevel.getTbSystemModule();
                tbAccessLevelCollectionTbAccessLevel.setTbSystemModule(tbSystemModule);
                tbAccessLevelCollectionTbAccessLevel = em.merge(tbAccessLevelCollectionTbAccessLevel);
                if (oldTbSystemModuleOfTbAccessLevelCollectionTbAccessLevel != null) {
                    oldTbSystemModuleOfTbAccessLevelCollectionTbAccessLevel.getTbAccessLevelCollection().remove(tbAccessLevelCollectionTbAccessLevel);
                    oldTbSystemModuleOfTbAccessLevelCollectionTbAccessLevel = em.merge(oldTbSystemModuleOfTbAccessLevelCollectionTbAccessLevel);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTbSystemModule(tbSystemModule.getModuleId()) != null) {
                throw new PreexistingEntityException("TbSystemModule " + tbSystemModule + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TbSystemModule tbSystemModule) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TbSystemModule persistentTbSystemModule = em.find(TbSystemModule.class, tbSystemModule.getModuleId());
            Collection<TbAccessLevel> tbAccessLevelCollectionOld = persistentTbSystemModule.getTbAccessLevelCollection();
            Collection<TbAccessLevel> tbAccessLevelCollectionNew = tbSystemModule.getTbAccessLevelCollection();
            List<String> illegalOrphanMessages = null;
            for (TbAccessLevel tbAccessLevelCollectionOldTbAccessLevel : tbAccessLevelCollectionOld) {
                if (!tbAccessLevelCollectionNew.contains(tbAccessLevelCollectionOldTbAccessLevel)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain TbAccessLevel " + tbAccessLevelCollectionOldTbAccessLevel + " since its tbSystemModule field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<TbAccessLevel> attachedTbAccessLevelCollectionNew = new ArrayList<TbAccessLevel>();
            for (TbAccessLevel tbAccessLevelCollectionNewTbAccessLevelToAttach : tbAccessLevelCollectionNew) {
                tbAccessLevelCollectionNewTbAccessLevelToAttach = em.getReference(tbAccessLevelCollectionNewTbAccessLevelToAttach.getClass(), tbAccessLevelCollectionNewTbAccessLevelToAttach.getTbAccessLevelPK());
                attachedTbAccessLevelCollectionNew.add(tbAccessLevelCollectionNewTbAccessLevelToAttach);
            }
            tbAccessLevelCollectionNew = attachedTbAccessLevelCollectionNew;
            tbSystemModule.setTbAccessLevelCollection(tbAccessLevelCollectionNew);
            tbSystemModule = em.merge(tbSystemModule);
            for (TbAccessLevel tbAccessLevelCollectionNewTbAccessLevel : tbAccessLevelCollectionNew) {
                if (!tbAccessLevelCollectionOld.contains(tbAccessLevelCollectionNewTbAccessLevel)) {
                    TbSystemModule oldTbSystemModuleOfTbAccessLevelCollectionNewTbAccessLevel = tbAccessLevelCollectionNewTbAccessLevel.getTbSystemModule();
                    tbAccessLevelCollectionNewTbAccessLevel.setTbSystemModule(tbSystemModule);
                    tbAccessLevelCollectionNewTbAccessLevel = em.merge(tbAccessLevelCollectionNewTbAccessLevel);
                    if (oldTbSystemModuleOfTbAccessLevelCollectionNewTbAccessLevel != null && !oldTbSystemModuleOfTbAccessLevelCollectionNewTbAccessLevel.equals(tbSystemModule)) {
                        oldTbSystemModuleOfTbAccessLevelCollectionNewTbAccessLevel.getTbAccessLevelCollection().remove(tbAccessLevelCollectionNewTbAccessLevel);
                        oldTbSystemModuleOfTbAccessLevelCollectionNewTbAccessLevel = em.merge(oldTbSystemModuleOfTbAccessLevelCollectionNewTbAccessLevel);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tbSystemModule.getModuleId();
                if (findTbSystemModule(id) == null) {
                    throw new NonexistentEntityException("The tbSystemModule with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TbSystemModule tbSystemModule;
            try {
                tbSystemModule = em.getReference(TbSystemModule.class, id);
                tbSystemModule.getModuleId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tbSystemModule with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<TbAccessLevel> tbAccessLevelCollectionOrphanCheck = tbSystemModule.getTbAccessLevelCollection();
            for (TbAccessLevel tbAccessLevelCollectionOrphanCheckTbAccessLevel : tbAccessLevelCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This TbSystemModule (" + tbSystemModule + ") cannot be destroyed since the TbAccessLevel " + tbAccessLevelCollectionOrphanCheckTbAccessLevel + " in its tbAccessLevelCollection field has a non-nullable tbSystemModule field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(tbSystemModule);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TbSystemModule> findTbSystemModuleEntities() {
        return findTbSystemModuleEntities(true, -1, -1);
    }

    public List<TbSystemModule> findTbSystemModuleEntities(int maxResults, int firstResult) {
        return findTbSystemModuleEntities(false, maxResults, firstResult);
    }

    private List<TbSystemModule> findTbSystemModuleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TbSystemModule.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TbSystemModule findTbSystemModule(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TbSystemModule.class, id);
        } finally {
            em.close();
        }
    }

    public int getTbSystemModuleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TbSystemModule> rt = cq.from(TbSystemModule.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
