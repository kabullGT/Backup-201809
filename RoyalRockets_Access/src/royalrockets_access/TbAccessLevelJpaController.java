/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalrockets_access;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import royalrockets_access.exceptions.NonexistentEntityException;
import royalrockets_access.exceptions.PreexistingEntityException;

/**
 *
 * @author Kabull
 */
public class TbAccessLevelJpaController implements Serializable {

    public TbAccessLevelJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TbAccessLevel tbAccessLevel) throws PreexistingEntityException, Exception {
        if (tbAccessLevel.getTbAccessLevelPK() == null) {
            tbAccessLevel.setTbAccessLevelPK(new TbAccessLevelPK());
        }
        tbAccessLevel.getTbAccessLevelPK().setModuleId(tbAccessLevel.getTbSystemModule().getModuleId());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TbSystemModule tbSystemModule = tbAccessLevel.getTbSystemModule();
            if (tbSystemModule != null) {
                tbSystemModule = em.getReference(tbSystemModule.getClass(), tbSystemModule.getModuleId());
                tbAccessLevel.setTbSystemModule(tbSystemModule);
            }
            em.persist(tbAccessLevel);
            if (tbSystemModule != null) {
                tbSystemModule.getTbAccessLevelCollection().add(tbAccessLevel);
                tbSystemModule = em.merge(tbSystemModule);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTbAccessLevel(tbAccessLevel.getTbAccessLevelPK()) != null) {
                throw new PreexistingEntityException("TbAccessLevel " + tbAccessLevel + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TbAccessLevel tbAccessLevel) throws NonexistentEntityException, Exception {
        tbAccessLevel.getTbAccessLevelPK().setModuleId(tbAccessLevel.getTbSystemModule().getModuleId());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TbAccessLevel persistentTbAccessLevel = em.find(TbAccessLevel.class, tbAccessLevel.getTbAccessLevelPK());
            TbSystemModule tbSystemModuleOld = persistentTbAccessLevel.getTbSystemModule();
            TbSystemModule tbSystemModuleNew = tbAccessLevel.getTbSystemModule();
            if (tbSystemModuleNew != null) {
                tbSystemModuleNew = em.getReference(tbSystemModuleNew.getClass(), tbSystemModuleNew.getModuleId());
                tbAccessLevel.setTbSystemModule(tbSystemModuleNew);
            }
            tbAccessLevel = em.merge(tbAccessLevel);
            if (tbSystemModuleOld != null && !tbSystemModuleOld.equals(tbSystemModuleNew)) {
                tbSystemModuleOld.getTbAccessLevelCollection().remove(tbAccessLevel);
                tbSystemModuleOld = em.merge(tbSystemModuleOld);
            }
            if (tbSystemModuleNew != null && !tbSystemModuleNew.equals(tbSystemModuleOld)) {
                tbSystemModuleNew.getTbAccessLevelCollection().add(tbAccessLevel);
                tbSystemModuleNew = em.merge(tbSystemModuleNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                TbAccessLevelPK id = tbAccessLevel.getTbAccessLevelPK();
                if (findTbAccessLevel(id) == null) {
                    throw new NonexistentEntityException("The tbAccessLevel with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(TbAccessLevelPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TbAccessLevel tbAccessLevel;
            try {
                tbAccessLevel = em.getReference(TbAccessLevel.class, id);
                tbAccessLevel.getTbAccessLevelPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tbAccessLevel with id " + id + " no longer exists.", enfe);
            }
            TbSystemModule tbSystemModule = tbAccessLevel.getTbSystemModule();
            if (tbSystemModule != null) {
                tbSystemModule.getTbAccessLevelCollection().remove(tbAccessLevel);
                tbSystemModule = em.merge(tbSystemModule);
            }
            em.remove(tbAccessLevel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TbAccessLevel> findTbAccessLevelEntities() {
        return findTbAccessLevelEntities(true, -1, -1);
    }

    public List<TbAccessLevel> findTbAccessLevelEntities(int maxResults, int firstResult) {
        return findTbAccessLevelEntities(false, maxResults, firstResult);
    }

    private List<TbAccessLevel> findTbAccessLevelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TbAccessLevel.class));
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

    public TbAccessLevel findTbAccessLevel(TbAccessLevelPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TbAccessLevel.class, id);
        } finally {
            em.close();
        }
    }

    public int getTbAccessLevelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TbAccessLevel> rt = cq.from(TbAccessLevel.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
