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
@Table(name = "tb_account_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAccountType.findAll", query = "SELECT t FROM TbAccountType t")
    , @NamedQuery(name = "TbAccountType.findByAccountTypeId", query = "SELECT t FROM TbAccountType t WHERE t.accountTypeId = :accountTypeId")
    , @NamedQuery(name = "TbAccountType.findByDsc", query = "SELECT t FROM TbAccountType t WHERE t.dsc = :dsc")})
public class TbAccountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "account_type_id")
    private String accountTypeId;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountTypeId")
    private Collection<TbAccount> tbAccountCollection;

    public TbAccountType() {
    }

    public TbAccountType(String accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(String accountTypeId) {
        this.accountTypeId = accountTypeId;
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
        hash += (accountTypeId != null ? accountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccountType)) {
            return false;
        }
        TbAccountType other = (TbAccountType) object;
        if ((this.accountTypeId == null && other.accountTypeId != null) || (this.accountTypeId != null && !this.accountTypeId.equals(other.accountTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAccountType[ accountTypeId=" + accountTypeId + " ]";
    }
    
}
