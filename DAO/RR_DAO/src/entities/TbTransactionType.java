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
@Table(name = "tb_transaction_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTransactionType.findAll", query = "SELECT t FROM TbTransactionType t")
    , @NamedQuery(name = "TbTransactionType.findByTrnTypeId", query = "SELECT t FROM TbTransactionType t WHERE t.trnTypeId = :trnTypeId")
    , @NamedQuery(name = "TbTransactionType.findByDsc", query = "SELECT t FROM TbTransactionType t WHERE t.dsc = :dsc")})
public class TbTransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "trn_type_id")
    private String trnTypeId;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trnTypeId")
    private Collection<TbTransaction> tbTransactionCollection;

    public TbTransactionType() {
    }

    public TbTransactionType(String trnTypeId) {
        this.trnTypeId = trnTypeId;
    }

    public String getTrnTypeId() {
        return trnTypeId;
    }

    public void setTrnTypeId(String trnTypeId) {
        this.trnTypeId = trnTypeId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
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
        hash += (trnTypeId != null ? trnTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTransactionType)) {
            return false;
        }
        TbTransactionType other = (TbTransactionType) object;
        if ((this.trnTypeId == null && other.trnTypeId != null) || (this.trnTypeId != null && !this.trnTypeId.equals(other.trnTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbTransactionType[ trnTypeId=" + trnTypeId + " ]";
    }
    
}
