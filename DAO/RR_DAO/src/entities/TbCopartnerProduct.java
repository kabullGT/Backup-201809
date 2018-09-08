/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
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
@Table(name = "tb_copartner_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCopartnerProduct.findAll", query = "SELECT t FROM TbCopartnerProduct t")
    , @NamedQuery(name = "TbCopartnerProduct.findByCopartnerId", query = "SELECT t FROM TbCopartnerProduct t WHERE t.tbCopartnerProductPK.copartnerId = :copartnerId")
    , @NamedQuery(name = "TbCopartnerProduct.findByProductId", query = "SELECT t FROM TbCopartnerProduct t WHERE t.tbCopartnerProductPK.productId = :productId")})
public class TbCopartnerProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbCopartnerProductPK tbCopartnerProductPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbCopartnerProduct")
    private Collection<TbOrderProduct> tbOrderProductCollection;
    @JoinColumn(name = "copartner_id", referencedColumnName = "copartner_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbCopartner tbCopartner;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbProduct tbProduct;

    public TbCopartnerProduct() {
    }

    public TbCopartnerProduct(TbCopartnerProductPK tbCopartnerProductPK) {
        this.tbCopartnerProductPK = tbCopartnerProductPK;
    }

    public TbCopartnerProduct(String copartnerId, String productId) {
        this.tbCopartnerProductPK = new TbCopartnerProductPK(copartnerId, productId);
    }

    public TbCopartnerProductPK getTbCopartnerProductPK() {
        return tbCopartnerProductPK;
    }

    public void setTbCopartnerProductPK(TbCopartnerProductPK tbCopartnerProductPK) {
        this.tbCopartnerProductPK = tbCopartnerProductPK;
    }

    @XmlTransient
    public Collection<TbOrderProduct> getTbOrderProductCollection() {
        return tbOrderProductCollection;
    }

    public void setTbOrderProductCollection(Collection<TbOrderProduct> tbOrderProductCollection) {
        this.tbOrderProductCollection = tbOrderProductCollection;
    }

    public TbCopartner getTbCopartner() {
        return tbCopartner;
    }

    public void setTbCopartner(TbCopartner tbCopartner) {
        this.tbCopartner = tbCopartner;
    }

    public TbProduct getTbProduct() {
        return tbProduct;
    }

    public void setTbProduct(TbProduct tbProduct) {
        this.tbProduct = tbProduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbCopartnerProductPK != null ? tbCopartnerProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCopartnerProduct)) {
            return false;
        }
        TbCopartnerProduct other = (TbCopartnerProduct) object;
        if ((this.tbCopartnerProductPK == null && other.tbCopartnerProductPK != null) || (this.tbCopartnerProductPK != null && !this.tbCopartnerProductPK.equals(other.tbCopartnerProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbCopartnerProduct[ tbCopartnerProductPK=" + tbCopartnerProductPK + " ]";
    }
    
}
