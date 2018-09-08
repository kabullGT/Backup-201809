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
@Table(name = "tb_user_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUserType.findAll", query = "SELECT t FROM TbUserType t")
    , @NamedQuery(name = "TbUserType.findByUserTypeId", query = "SELECT t FROM TbUserType t WHERE t.userTypeId = :userTypeId")
    , @NamedQuery(name = "TbUserType.findByDsc", query = "SELECT t FROM TbUserType t WHERE t.dsc = :dsc")})
public class TbUserType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_type_id")
    private String userTypeId;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userTypeId")
    private Collection<TbUser> tbUserCollection;

    public TbUserType() {
    }

    public TbUserType(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbUser> getTbUserCollection() {
        return tbUserCollection;
    }

    public void setTbUserCollection(Collection<TbUser> tbUserCollection) {
        this.tbUserCollection = tbUserCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userTypeId != null ? userTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUserType)) {
            return false;
        }
        TbUserType other = (TbUserType) object;
        if ((this.userTypeId == null && other.userTypeId != null) || (this.userTypeId != null && !this.userTypeId.equals(other.userTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbUserType[ userTypeId=" + userTypeId + " ]";
    }
    
}
