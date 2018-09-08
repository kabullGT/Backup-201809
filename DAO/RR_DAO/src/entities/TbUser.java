/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUser.findAll", query = "SELECT t FROM TbUser t")
    , @NamedQuery(name = "TbUser.findByUserId", query = "SELECT t FROM TbUser t WHERE t.userId = :userId")
    , @NamedQuery(name = "TbUser.findByName", query = "SELECT t FROM TbUser t WHERE t.name = :name")
    , @NamedQuery(name = "TbUser.findByPwd", query = "SELECT t FROM TbUser t WHERE t.pwd = :pwd")
    , @NamedQuery(name = "TbUser.findByAccessLevelId", query = "SELECT t FROM TbUser t WHERE t.accessLevelId = :accessLevelId")
    , @NamedQuery(name = "TbUser.findByModuleId", query = "SELECT t FROM TbUser t WHERE t.moduleId = :moduleId")
    , @NamedQuery(name = "TbUser.findByImagePatch", query = "SELECT t FROM TbUser t WHERE t.imagePatch = :imagePatch")})
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private String userId;
    @Column(name = "name")
    private String name;
    @Column(name = "pwd")
    private String pwd;
    @Basic(optional = false)
    @Column(name = "access_level_id")
    private String accessLevelId;
    @Basic(optional = false)
    @Column(name = "module_id")
    private String moduleId;
    @Column(name = "image_patch")
    private String imagePatch;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUser")
    private Collection<TbUserDevice> tbUserDeviceCollection;
    @JoinColumn(name = "user_type_id", referencedColumnName = "user_type_id")
    @ManyToOne(optional = false)
    private TbUserType userTypeId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tbUser")
    private TbUserAccessLevel tbUserAccessLevel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<TbList> tbListCollection;

    public TbUser() {
    }

    public TbUser(String userId) {
        this.userId = userId;
    }

    public TbUser(String userId, String accessLevelId, String moduleId) {
        this.userId = userId;
        this.accessLevelId = accessLevelId;
        this.moduleId = moduleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    @XmlTransient
    public Collection<TbUserDevice> getTbUserDeviceCollection() {
        return tbUserDeviceCollection;
    }

    public void setTbUserDeviceCollection(Collection<TbUserDevice> tbUserDeviceCollection) {
        this.tbUserDeviceCollection = tbUserDeviceCollection;
    }

    public TbUserType getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(TbUserType userTypeId) {
        this.userTypeId = userTypeId;
    }

    public TbUserAccessLevel getTbUserAccessLevel() {
        return tbUserAccessLevel;
    }

    public void setTbUserAccessLevel(TbUserAccessLevel tbUserAccessLevel) {
        this.tbUserAccessLevel = tbUserAccessLevel;
    }

    @XmlTransient
    public Collection<TbList> getTbListCollection() {
        return tbListCollection;
    }

    public void setTbListCollection(Collection<TbList> tbListCollection) {
        this.tbListCollection = tbListCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUser)) {
            return false;
        }
        TbUser other = (TbUser) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbUser[ userId=" + userId + " ]";
    }
    
}
