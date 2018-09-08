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
@Table(name = "tb_account_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAccountStatus.findAll", query = "SELECT t FROM TbAccountStatus t")
    , @NamedQuery(name = "TbAccountStatus.findByAccountStatusId", query = "SELECT t FROM TbAccountStatus t WHERE t.accountStatusId = :accountStatusId")
    , @NamedQuery(name = "TbAccountStatus.findByDsc", query = "SELECT t FROM TbAccountStatus t WHERE t.dsc = :dsc")})
public class TbAccountStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "account_status_id")
    private String accountStatusId;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountStatusId")
    private Collection<TbAccount> tbAccountCollection;

    public TbAccountStatus() {
    }

    public TbAccountStatus(String accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    public String getAccountStatusId() {
        return accountStatusId;
    }

    public void setAccountStatusId(String accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbAccount> getTbAccountCollection() {
        return tbAccountCollection;
    }

    public void setTbAccountCollection(Collection<TbAccount> tbAccountCollection) {
        this.tbAccountCollection = tbAccountCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountStatusId != null ? accountStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccountStatus)) {
            return false;
        }
        TbAccountStatus other = (TbAccountStatus) object;
        if ((this.accountStatusId == null && other.accountStatusId != null) || (this.accountStatusId != null && !this.accountStatusId.equals(other.accountStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAccountStatus[ accountStatusId=" + accountStatusId + " ]";
    }
    
}
