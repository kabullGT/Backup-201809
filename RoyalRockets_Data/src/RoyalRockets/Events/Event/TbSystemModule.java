/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_system_module")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSystemModule.findAll", query = "SELECT t FROM TbSystemModule t")
    , @NamedQuery(name = "TbSystemModule.findByModuleId", query = "SELECT t FROM TbSystemModule t WHERE t.moduleId = :moduleId")
    , @NamedQuery(name = "TbSystemModule.findByModuleName", query = "SELECT t FROM TbSystemModule t WHERE t.moduleName = :moduleName")
    , @NamedQuery(name = "TbSystemModule.findByDsc", query = "SELECT t FROM TbSystemModule t WHERE t.dsc = :dsc")
    , @NamedQuery(name = "TbSystemModule.findByConfig", query = "SELECT t FROM TbSystemModule t WHERE t.config = :config")})
public class TbSystemModule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "module_id", nullable = false, length = 36)
    private String moduleId;
    @Column(name = "module_name", length = 20)
    private String moduleName;
    @Column(name = "dsc", length = 50)
    private String dsc;
    @Column(name = "config", length = 2147483647)
    private String config;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbSystemModule")
    private Collection<TbAccessLevel> tbAccessLevelCollection;

    public TbSystemModule() {
    }

    public TbSystemModule(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @XmlTransient
    public Collection<TbAccessLevel> getTbAccessLevelCollection() {
        return tbAccessLevelCollection;
    }

    public void setTbAccessLevelCollection(Collection<TbAccessLevel> tbAccessLevelCollection) {
        this.tbAccessLevelCollection = tbAccessLevelCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moduleId != null ? moduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSystemModule)) {
            return false;
        }
        TbSystemModule other = (TbSystemModule) object;
        if ((this.moduleId == null && other.moduleId != null) || (this.moduleId != null && !this.moduleId.equals(other.moduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RoyalRockets.Events.Event.TbSystemModule[ moduleId=" + moduleId + " ]";
    }
    
}
