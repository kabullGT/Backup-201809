/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalrockets_access;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_access_level", catalog = "RR_DB", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAccessLevel.findAll", query = "SELECT t FROM TbAccessLevel t")
    , @NamedQuery(name = "TbAccessLevel.findByAccessLevelId", query = "SELECT t FROM TbAccessLevel t WHERE t.tbAccessLevelPK.accessLevelId = :accessLevelId")
    , @NamedQuery(name = "TbAccessLevel.findByModuleId", query = "SELECT t FROM TbAccessLevel t WHERE t.tbAccessLevelPK.moduleId = :moduleId")
    , @NamedQuery(name = "TbAccessLevel.findByName", query = "SELECT t FROM TbAccessLevel t WHERE t.name = :name")
    , @NamedQuery(name = "TbAccessLevel.findByDsc", query = "SELECT t FROM TbAccessLevel t WHERE t.dsc = :dsc")})
public class TbAccessLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbAccessLevelPK tbAccessLevelPK;
    @Column(name = "name")
    private String name;
    @Column(name = "dsc")
    private String dsc;
    @JoinColumn(name = "module_id", referencedColumnName = "module_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbSystemModule tbSystemModule;

    public TbAccessLevel() {
    }

    public TbAccessLevel(TbAccessLevelPK tbAccessLevelPK) {
        this.tbAccessLevelPK = tbAccessLevelPK;
    }

    public TbAccessLevel(String accessLevelId, String moduleId) {
        this.tbAccessLevelPK = new TbAccessLevelPK(accessLevelId, moduleId);
    }

    public TbAccessLevelPK getTbAccessLevelPK() {
        return tbAccessLevelPK;
    }

    public void setTbAccessLevelPK(TbAccessLevelPK tbAccessLevelPK) {
        this.tbAccessLevelPK = tbAccessLevelPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public TbSystemModule getTbSystemModule() {
        return tbSystemModule;
    }

    public void setTbSystemModule(TbSystemModule tbSystemModule) {
        this.tbSystemModule = tbSystemModule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbAccessLevelPK != null ? tbAccessLevelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccessLevel)) {
            return false;
        }
        TbAccessLevel other = (TbAccessLevel) object;
        if ((this.tbAccessLevelPK == null && other.tbAccessLevelPK != null) || (this.tbAccessLevelPK != null && !this.tbAccessLevelPK.equals(other.tbAccessLevelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "royalrockets_access.TbAccessLevel[ tbAccessLevelPK=" + tbAccessLevelPK + " ]";
    }
    
}
