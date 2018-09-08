/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "tb_order_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOrderProduct.findAll", query = "SELECT t FROM TbOrderProduct t")
    , @NamedQuery(name = "TbOrderProduct.findByOrderId", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.orderId = :orderId")
    , @NamedQuery(name = "TbOrderProduct.findByWrtUid", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.wrtUid = :wrtUid")
    , @NamedQuery(name = "TbOrderProduct.findByCopartnerId", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.copartnerId = :copartnerId")
    , @NamedQuery(name = "TbOrderProduct.findByProductId", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.productId = :productId")
    , @NamedQuery(name = "TbOrderProduct.findByIdSalepoint", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.idSalepoint = :idSalepoint")
    , @NamedQuery(name = "TbOrderProduct.findByOrderDatetime", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.orderDatetime = :orderDatetime")
    , @NamedQuery(name = "TbOrderProduct.findByQtty", query = "SELECT t FROM TbOrderProduct t WHERE t.qtty = :qtty")
    , @NamedQuery(name = "TbOrderProduct.findByEventDayId", query = "SELECT t FROM TbOrderProduct t WHERE t.tbOrderProductPK.eventDayId = :eventDayId")})
public class TbOrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbOrderProductPK tbOrderProductPK;
    @Column(name = "qtty")
    private Integer qtty;
    @JoinColumns({
        @JoinColumn(name = "copartner_id", referencedColumnName = "copartner_id", insertable = false, updatable = false)
        , @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private TbCopartnerProduct tbCopartnerProduct;
    @JoinColumns({
        @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
        , @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid", insertable = false, updatable = false)
        , @JoinColumn(name = "order_datetime", referencedColumnName = "order_datetime", insertable = false, updatable = false)
        , @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private TbOrder tbOrder;
    @JoinColumn(name = "id_salepoint", referencedColumnName = "id_salepoint", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbSalepoint tbSalepoint;

    public TbOrderProduct() {
    }

    public TbOrderProduct(TbOrderProductPK tbOrderProductPK) {
        this.tbOrderProductPK = tbOrderProductPK;
    }

    public TbOrderProduct(String orderId, String wrtUid, String copartnerId, String productId, String idSalepoint, Date orderDatetime, String eventDayId) {
        this.tbOrderProductPK = new TbOrderProductPK(orderId, wrtUid, copartnerId, productId, idSalepoint, orderDatetime, eventDayId);
    }

    public TbOrderProductPK getTbOrderProductPK() {
        return tbOrderProductPK;
    }

    public void setTbOrderProductPK(TbOrderProductPK tbOrderProductPK) {
        this.tbOrderProductPK = tbOrderProductPK;
    }

    public Integer getQtty() {
        return qtty;
    }

    public void setQtty(Integer qtty) {
        this.qtty = qtty;
    }

    public TbCopartnerProduct getTbCopartnerProduct() {
        return tbCopartnerProduct;
    }

    public void setTbCopartnerProduct(TbCopartnerProduct tbCopartnerProduct) {
        this.tbCopartnerProduct = tbCopartnerProduct;
    }

    public TbOrder getTbOrder() {
        return tbOrder;
    }

    public void setTbOrder(TbOrder tbOrder) {
        this.tbOrder = tbOrder;
    }

    public TbSalepoint getTbSalepoint() {
        return tbSalepoint;
    }

    public void setTbSalepoint(TbSalepoint tbSalepoint) {
        this.tbSalepoint = tbSalepoint;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbOrderProductPK != null ? tbOrderProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrderProduct)) {
            return false;
        }
        TbOrderProduct other = (TbOrderProduct) object;
        if ((this.tbOrderProductPK == null && other.tbOrderProductPK != null) || (this.tbOrderProductPK != null && !this.tbOrderProductPK.equals(other.tbOrderProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbOrderProduct[ tbOrderProductPK=" + tbOrderProductPK + " ]";
    }
    
}
