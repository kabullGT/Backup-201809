/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "tb_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOrder.findAll", query = "SELECT t FROM TbOrder t")
    , @NamedQuery(name = "TbOrder.findByOrderId", query = "SELECT t FROM TbOrder t WHERE t.tbOrderPK.orderId = :orderId")
    , @NamedQuery(name = "TbOrder.findByWrtUid", query = "SELECT t FROM TbOrder t WHERE t.tbOrderPK.wrtUid = :wrtUid")
    , @NamedQuery(name = "TbOrder.findByOrderDatetime", query = "SELECT t FROM TbOrder t WHERE t.tbOrderPK.orderDatetime = :orderDatetime")
    , @NamedQuery(name = "TbOrder.findByTotal", query = "SELECT t FROM TbOrder t WHERE t.total = :total")
    , @NamedQuery(name = "TbOrder.findByEventDayId", query = "SELECT t FROM TbOrder t WHERE t.tbOrderPK.eventDayId = :eventDayId")})
public class TbOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbOrderPK tbOrderPK;
    @Column(name = "total")
    private BigInteger total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbOrder")
    private Collection<TbOrderProduct> tbOrderProductCollection;
    @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEventDay tbEventDay;
    @JoinColumns({
        @JoinColumn(name = "device_id", referencedColumnName = "device_id")
        , @JoinColumn(name = "user_id", referencedColumnName = "user_id")})
    @ManyToOne(optional = false)
    private TbUserDevice tbUserDevice;
    @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbWristband tbWristband;

    public TbOrder() {
    }

    public TbOrder(TbOrderPK tbOrderPK) {
        this.tbOrderPK = tbOrderPK;
    }

    public TbOrder(String orderId, String wrtUid, Date orderDatetime, String eventDayId) {
        this.tbOrderPK = new TbOrderPK(orderId, wrtUid, orderDatetime, eventDayId);
    }

    public TbOrderPK getTbOrderPK() {
        return tbOrderPK;
    }

    public void setTbOrderPK(TbOrderPK tbOrderPK) {
        this.tbOrderPK = tbOrderPK;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    @XmlTransient
    public Collection<TbOrderProduct> getTbOrderProductCollection() {
        return tbOrderProductCollection;
    }

    public void setTbOrderProductCollection(Collection<TbOrderProduct> tbOrderProductCollection) {
        this.tbOrderProductCollection = tbOrderProductCollection;
    }

    public TbEventDay getTbEventDay() {
        return tbEventDay;
    }

    public void setTbEventDay(TbEventDay tbEventDay) {
        this.tbEventDay = tbEventDay;
    }

    public TbUserDevice getTbUserDevice() {
        return tbUserDevice;
    }

    public void setTbUserDevice(TbUserDevice tbUserDevice) {
        this.tbUserDevice = tbUserDevice;
    }

    public TbWristband getTbWristband() {
        return tbWristband;
    }

    public void setTbWristband(TbWristband tbWristband) {
        this.tbWristband = tbWristband;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbOrderPK != null ? tbOrderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrder)) {
            return false;
        }
        TbOrder other = (TbOrder) object;
        if ((this.tbOrderPK == null && other.tbOrderPK != null) || (this.tbOrderPK != null && !this.tbOrderPK.equals(other.tbOrderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbOrder[ tbOrderPK=" + tbOrderPK + " ]";
    }
    
}
