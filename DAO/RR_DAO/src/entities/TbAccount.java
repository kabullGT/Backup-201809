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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAccount.findAll", query = "SELECT t FROM TbAccount t")
    , @NamedQuery(name = "TbAccount.findByAcccountId", query = "SELECT t FROM TbAccount t WHERE t.acccountId = :acccountId")
    , @NamedQuery(name = "TbAccount.findByBalance", query = "SELECT t FROM TbAccount t WHERE t.balance = :balance")})
public class TbAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "acccount_id")
    private String acccountId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "balance")
    private Double balance;
    @JoinColumn(name = "account_status_id", referencedColumnName = "account_status_id")
    @ManyToOne(optional = false)
    private TbAccountStatus accountStatusId;
    @JoinColumn(name = "account_type_id", referencedColumnName = "account_type_id")
    @ManyToOne(optional = false)
    private TbAccountType accountTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbAccount")
    private Collection<TbAccountWristband> tbAccountWristbandCollection;

    public TbAccount() {
    }

    public TbAccount(String acccountId) {
        this.acccountId = acccountId;
    }

    public String getAcccountId() {
        return acccountId;
    }

    public void setAcccountId(String acccountId) {
        this.acccountId = acccountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public TbAccountStatus getAccountStatusId() {
        return accountStatusId;
    }

    public void setAccountStatusId(TbAccountStatus accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    public TbAccountType getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(TbAccountType accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @XmlTransient
    public Collection<TbAccountWristband> getTbAccountWristbandCollection() {
        return tbAccountWristbandCollection;
    }

    public void setTbAccountWristbandCollection(Collection<TbAccountWristband> tbAccountWristbandCollection) {
        this.tbAccountWristbandCollection = tbAccountWristbandCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acccountId != null ? acccountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccount)) {
            return false;
        }
        TbAccount other = (TbAccount) object;
        if ((this.acccountId == null && other.acccountId != null) || (this.acccountId != null && !this.acccountId.equals(other.acccountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAccount[ acccountId=" + acccountId + " ]";
    }
    
}
