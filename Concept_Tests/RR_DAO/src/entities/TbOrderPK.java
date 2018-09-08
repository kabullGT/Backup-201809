/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Kabull
 */
@Embeddable
public class TbOrderPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "order_id")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "wrt_uid")
    private String wrtUid;
    @Basic(optional = false)
    @Column(name = "order_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDatetime;
    @Basic(optional = false)
    @Column(name = "event_day_id")
    private String eventDayId;

    public TbOrderPK() {
    }

    public TbOrderPK(String orderId, String wrtUid, Date orderDatetime, String eventDayId) {
        this.orderId = orderId;
        this.wrtUid = wrtUid;
        this.orderDatetime = orderDatetime;
        this.eventDayId = eventDayId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getWrtUid() {
        return wrtUid;
    }

    public void setWrtUid(String wrtUid) {
        this.wrtUid = wrtUid;
    }

    public Date getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(String eventDayId) {
        this.eventDayId = eventDayId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (wrtUid != null ? wrtUid.hashCode() : 0);
        hash += (orderDatetime != null ? orderDatetime.hashCode() : 0);
        hash += (eventDayId != null ? eventDayId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrderPK)) {
            return false;
        }
        TbOrderPK other = (TbOrderPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.wrtUid == null && other.wrtUid != null) || (this.wrtUid != null && !this.wrtUid.equals(other.wrtUid))) {
            return false;
        }
        if ((this.orderDatetime == null && other.orderDatetime != null) || (this.orderDatetime != null && !this.orderDatetime.equals(other.orderDatetime))) {
            return false;
        }
        if ((this.eventDayId == null && other.eventDayId != null) || (this.eventDayId != null && !this.eventDayId.equals(other.eventDayId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbOrderPK[ orderId=" + orderId + ", wrtUid=" + wrtUid + ", orderDatetime=" + orderDatetime + ", eventDayId=" + eventDayId + " ]";
    }
    
}
