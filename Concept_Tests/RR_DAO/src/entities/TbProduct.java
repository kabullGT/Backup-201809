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
@Table(name = "tb_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduct.findAll", query = "SELECT t FROM TbProduct t")
    , @NamedQuery(name = "TbProduct.findByProductId", query = "SELECT t FROM TbProduct t WHERE t.productId = :productId")
    , @NamedQuery(name = "TbProduct.findByName", query = "SELECT t FROM TbProduct t WHERE t.name = :name")
    , @NamedQuery(name = "TbProduct.findByDsc", query = "SELECT t FROM TbProduct t WHERE t.dsc = :dsc")
    , @NamedQuery(name = "TbProduct.findByCost", query = "SELECT t FROM TbProduct t WHERE t.cost = :cost")
    , @NamedQuery(name = "TbProduct.findBySaleprice", query = "SELECT t FROM TbProduct t WHERE t.saleprice = :saleprice")
    , @NamedQuery(name = "TbProduct.findByQtty", query = "SELECT t FROM TbProduct t WHERE t.qtty = :qtty")
    , @NamedQuery(name = "TbProduct.findByImagePatch", query = "SELECT t FROM TbProduct t WHERE t.imagePatch = :imagePatch")})
public class TbProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "product_id")
    private String productId;
    @Column(name = "name")
    private String name;
    @Column(name = "dsc")
    private String dsc;
    @Column(name = "cost")
    private BigInteger cost;
    @Column(name = "saleprice")
    private BigInteger saleprice;
    @Column(name = "qtty")
    private BigInteger qtty;
    @Column(name = "image_patch")
    private String imagePatch;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbProduct")
    private Collection<TbCopartnerProduct> tbCopartnerProductCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbProduct")
    private Collection<TbProductCombo> tbProductComboCollection;

    public TbProduct() {
    }

    public TbProduct(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public BigInteger getCost() {
        return cost;
    }

    public void setCost(BigInteger cost) {
        this.cost = cost;
    }

    public BigInteger getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigInteger saleprice) {
        this.saleprice = saleprice;
    }

    public BigInteger getQtty() {
        return qtty;
    }

    public void setQtty(BigInteger qtty) {
        this.qtty = qtty;
    }

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    @XmlTransient
    public Collection<TbCopartnerProduct> getTbCopartnerProductCollection() {
        return tbCopartnerProductCollection;
    }

    public void setTbCopartnerProductCollection(Collection<TbCopartnerProduct> tbCopartnerProductCollection) {
        this.tbCopartnerProductCollection = tbCopartnerProductCollection;
    }

    @XmlTransient
    public Collection<TbProductCombo> getTbProductComboCollection() {
        return tbProductComboCollection;
    }

    public void setTbProductComboCollection(Collection<TbProductCombo> tbProductComboCollection) {
        this.tbProductComboCollection = tbProductComboCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduct)) {
            return false;
        }
        TbProduct other = (TbProduct) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbProduct[ productId=" + productId + " ]";
    }
    
}
