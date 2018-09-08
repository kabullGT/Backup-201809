/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "tb_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbList.findAll", query = "SELECT t FROM TbList t")
    , @NamedQuery(name = "TbList.findByListId", query = "SELECT t FROM TbList t WHERE t.listId = :listId")
    , @NamedQuery(name = "TbList.findByDsc", query = "SELECT t FROM TbList t WHERE t.dsc = :dsc")
    , @NamedQuery(name = "TbList.findByChargeAmount", query = "SELECT t FROM TbList t WHERE t.chargeAmount = :chargeAmount")
    , @NamedQuery(name = "TbList.findByTopupAmount", query = "SELECT t FROM TbList t WHERE t.topupAmount = :topupAmount")})
public class TbList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "list_id")
    private String listId;
    @Column(name = "dsc")
    private String dsc;
    @Column(name = "charge_amount")
    private BigInteger chargeAmount;
    @Column(name = "topup_amount")
    private BigInteger topupAmount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listId")
    private Collection<TbListNames> tbListNamesCollection;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private TbUser userId;

    public TbList() {
    }

    public TbList(String listId) {
        this.listId = listId;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public BigInteger getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigInteger chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public BigInteger getTopupAmount() {
        return topupAmount;
    }

    public void setTopupAmount(BigInteger topupAmount) {
        this.topupAmount = topupAmount;
    }

    @XmlTransient
    public Collection<TbListNames> getTbListNamesCollection() {
        return tbListNamesCollection;
    }

    public void setTbListNamesCollection(Collection<TbListNames> tbListNamesCollection) {
        this.tbListNamesCollection = tbListNamesCollection;
    }

    public TbUser getUserId() {
        return userId;
    }

    public void setUserId(TbUser userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listId != null ? listId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbList)) {
            return false;
        }
        TbList other = (TbList) object;
        if ((this.listId == null && other.listId != null) || (this.listId != null && !this.listId.equals(other.listId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbList[ listId=" + listId + " ]";
    }
    
}
