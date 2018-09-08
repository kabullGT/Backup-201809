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
public class TbCopartnerProductPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "copartner_id")
    private String copartnerId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private String productId;

    public TbCopartnerProductPK() {
    }

    public TbCopartnerProductPK(String copartnerId, String productId) {
        this.copartnerId = copartnerId;
        this.productId = productId;
    }

    public String getCopartnerId() {
        return copartnerId;
    }

    public void setCopartnerId(String copartnerId) {
        this.copartnerId = copartnerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (copartnerId != null ? copartnerId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCopartnerProductPK)) {
            return false;
        }
        TbCopartnerProductPK other = (TbCopartnerProductPK) object;
        if ((this.copartnerId == null && other.copartnerId != null) || (this.copartnerId != null && !this.copartnerId.equals(other.copartnerId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbCopartnerProductPK[ copartnerId=" + copartnerId + ", productId=" + productId + " ]";
    }
    
}
