/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Kabull
 */
@Embeddable
public class TbProductComboPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "product_id")
    private String productId;
    @Basic(optional = false)
    @Column(name = "combo_id")
    private String comboId;

    public TbProductComboPK() {
    }

    public TbProductComboPK(String productId, String comboId) {
        this.productId = productId;
        this.comboId = comboId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getComboId() {
        return comboId;
    }

    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (comboId != null ? comboId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProductComboPK)) {
            return false;
        }
        TbProductComboPK other = (TbProductComboPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.comboId == null && other.comboId != null) || (this.comboId != null && !this.comboId.equals(other.comboId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbProductComboPK[ productId=" + productId + ", comboId=" + comboId + " ]";
    }
    
}
