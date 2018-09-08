/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalrockets_access;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Kabull
 */
@Embeddable
public class TbAccessLevelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "access_level_id")
    private String accessLevelId;
    @Basic(optional = false)
    @Column(name = "module_id")
    private String moduleId;

    public TbAccessLevelPK() {
    }

    public TbAccessLevelPK(String accessLevelId, String moduleId) {
        this.accessLevelId = accessLevelId;
        this.moduleId = moduleId;
    }

    public String getAccessLevelId() {
        return accessLevelId;
    }

    public void setAccessLevelId(String accessLevelId) {
        this.accessLevelId = accessLevelId;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessLevelId != null ? accessLevelId.hashCode() : 0);
        hash += (moduleId != null ? moduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccessLevelPK)) {
            return false;
        }
        TbAccessLevelPK other = (TbAccessLevelPK) object;
        if ((this.accessLevelId == null && other.accessLevelId != null) || (this.accessLevelId != null && !this.accessLevelId.equals(other.accessLevelId))) {
            return false;
        }
        if ((this.moduleId == null && other.moduleId != null) || (this.moduleId != null && !this.moduleId.equals(other.moduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "royalrockets_access.TbAccessLevelPK[ accessLevelId=" + accessLevelId + ", moduleId=" + moduleId + " ]";
    }
    
}
