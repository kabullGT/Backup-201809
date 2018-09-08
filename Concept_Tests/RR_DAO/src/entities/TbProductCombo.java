/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_product_combo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProductCombo.findAll", query = "SELECT t FROM TbProductCombo t")
    , @NamedQuery(name = "TbProductCombo.findByProductId", query = "SELECT t FROM TbProductCombo t WHERE t.tbProductComboPK.productId = :productId")
    , @NamedQuery(name = "TbProductCombo.findByComboId", query = "SELECT t FROM TbProductCombo t WHERE t.tbProductComboPK.comboId = :comboId")
    , @NamedQuery(name = "TbProductCombo.findByQtty", query = "SELECT t FROM TbProductCombo t WHERE t.qtty = :qtty")
    , @NamedQuery(name = "TbProductCombo.findByCost", query = "SELECT t FROM TbProductCombo t WHERE t.cost = :cost")
    , @NamedQuery(name = "TbProductCombo.findBySaleprice", query = "SELECT t FROM TbProductCombo t WHERE t.saleprice = :saleprice")
    , @NamedQuery(name = "TbProductCombo.findByImagePath", query = "SELECT t FROM TbProductCombo t WHERE t.imagePath = :imagePath")})
public class TbProductCombo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbProductComboPK tbProductComboPK;
    @Column(name = "qtty")
    private Integer qtty;
    @Column(name = "cost")
    private BigInteger cost;
    @Column(name = "saleprice")
    private BigInteger saleprice;
    @Column(name = "image_path")
    private String imagePath;
    @JoinColumn(name = "combo_id", referencedColumnName = "combo_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbCombo tbCombo;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbProduct tbProduct;

    public TbProductCombo() {
    }

    public TbProductCombo(TbProductComboPK tbProductComboPK) {
        this.tbProductComboPK = tbProductComboPK;
    }

    public TbProductCombo(String productId, String comboId) {
        this.tbProductComboPK = new TbProductComboPK(productId, comboId);
    }

    public TbProductComboPK getTbProductComboPK() {
        return tbProductComboPK;
    }

    public void setTbProductComboPK(TbProductComboPK tbProductComboPK) {
        this.tbProductComboPK = tbProductComboPK;
    }

    public Integer getQtty() {
        return qtty;
    }

    public void setQtty(Integer qtty) {
        this.qtty = qtty;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public TbCombo getTbCombo() {
        return tbCombo;
    }

    public void setTbCombo(TbCombo tbCombo) {
        this.tbCombo = tbCombo;
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
        hash += (tbProductComboPK != null ? tbProductComboPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProductCombo)) {
            return false;
        }
        TbProductCombo other = (TbProductCombo) object;
        if ((this.tbProductComboPK == null && other.tbProductComboPK != null) || (this.tbProductComboPK != null && !this.tbProductComboPK.equals(other.tbProductComboPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbProductCombo[ tbProductComboPK=" + tbProductComboPK + " ]";
    }
    
}
