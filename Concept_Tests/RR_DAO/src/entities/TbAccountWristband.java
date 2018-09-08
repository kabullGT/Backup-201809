/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "tb_account_wristband")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAccountWristband.findAll", query = "SELECT t FROM TbAccountWristband t")
    , @NamedQuery(name = "TbAccountWristband.findByAcccountId", query = "SELECT t FROM TbAccountWristband t WHERE t.tbAccountWristbandPK.acccountId = :acccountId")
    , @NamedQuery(name = "TbAccountWristband.findByLimit", query = "SELECT t FROM TbAccountWristband t WHERE t.limit = :limit")
    , @NamedQuery(name = "TbAccountWristband.findByWrtUid", query = "SELECT t FROM TbAccountWristband t WHERE t.tbAccountWristbandPK.wrtUid = :wrtUid")})
public class TbAccountWristband implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbAccountWristbandPK tbAccountWristbandPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "limit")
    private Double limit;
    @JoinColumn(name = "acccount_id", referencedColumnName = "acccount_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbAccount tbAccount;
    @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbWristband tbWristband;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbAccountWristband")
    private Collection<TbTransaction> tbTransactionCollection;

    public TbAccountWristband() {
    }

    public TbAccountWristband(TbAccountWristbandPK tbAccountWristbandPK) {
        this.tbAccountWristbandPK = tbAccountWristbandPK;
    }

    public TbAccountWristband(String acccountId, String wrtUid) {
        this.tbAccountWristbandPK = new TbAccountWristbandPK(acccountId, wrtUid);
    }

    public TbAccountWristbandPK getTbAccountWristbandPK() {
        return tbAccountWristbandPK;
    }

    public void setTbAccountWristbandPK(TbAccountWristbandPK tbAccountWristbandPK) {
        this.tbAccountWristbandPK = tbAccountWristbandPK;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public TbAccount getTbAccount() {
        return tbAccount;
    }

    public void setTbAccount(TbAccount tbAccount) {
        this.tbAccount = tbAccount;
    }

    public TbWristband getTbWristband() {
        return tbWristband;
    }

    public void setTbWristband(TbWristband tbWristband) {
        this.tbWristband = tbWristband;
    }

    @XmlTransient
    public Collection<TbTransaction> getTbTransactionCollection() {
        return tbTransactionCollection;
    }

    public void setTbTransactionCollection(Collection<TbTransaction> tbTransactionCollection) {
        this.tbTransactionCollection = tbTransactionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbAccountWristbandPK != null ? tbAccountWristbandPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccountWristband)) {
            return false;
        }
        TbAccountWristband other = (TbAccountWristband) object;
        if ((this.tbAccountWristbandPK == null && other.tbAccountWristbandPK != null) || (this.tbAccountWristbandPK != null && !this.tbAccountWristbandPK.equals(other.tbAccountWristbandPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAccountWristband[ tbAccountWristbandPK=" + tbAccountWristbandPK + " ]";
    }
    
}
