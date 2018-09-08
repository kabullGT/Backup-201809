/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_user_access_level")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUserAccessLevel.findAll", query = "SELECT t FROM TbUserAccessLevel t")
    , @NamedQuery(name = "TbUserAccessLevel.findByUserId", query = "SELECT t FROM TbUserAccessLevel t WHERE t.userId = :userId")})
public class TbUserAccessLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private String userId;
    @JoinColumns({
        @JoinColumn(name = "access_level_id", referencedColumnName = "access_level_id")
        , @JoinColumn(name = "module_id", referencedColumnName = "module_id")})
    @ManyToOne(optional = false)
    private TbAccessLevel tbAccessLevel;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TbUser tbUser;

    public TbUserAccessLevel() {
    }

    public TbUserAccessLevel(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TbAccessLevel getTbAccessLevel() {
        return tbAccessLevel;
    }

    public void setTbAccessLevel(TbAccessLevel tbAccessLevel) {
        this.tbAccessLevel = tbAccessLevel;
    }

    public TbUser getTbUser() {
        return tbUser;
    }

    public void setTbUser(TbUser tbUser) {
        this.tbUser = tbUser;
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
        if (!(object instanceof TbUserAccessLevel)) {
            return false;
        }
        TbUserAccessLevel other = (TbUserAccessLevel) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbUserAccessLevel[ userId=" + userId + " ]";
    }
    
}
