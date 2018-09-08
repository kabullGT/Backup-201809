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
public class TbAttendancePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "event_day_id")
    private String eventDayId;
    @Basic(optional = false)
    @Column(name = "wrt_uid")
    private String wrtUid;
    @Basic(optional = false)
    @Column(name = "sub_event_id")
    private String subEventId;

    public TbAttendancePK() {
    }

    public TbAttendancePK(String eventDayId, String wrtUid, String subEventId) {
        this.eventDayId = eventDayId;
        this.wrtUid = wrtUid;
        this.subEventId = subEventId;
    }

    public String getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(String eventDayId) {
        this.eventDayId = eventDayId;
    }

    public String getWrtUid() {
        return wrtUid;
    }

    public void setWrtUid(String wrtUid) {
        this.wrtUid = wrtUid;
    }

    public String getSubEventId() {
        return subEventId;
    }

    public void setSubEventId(String subEventId) {
        this.subEventId = subEventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventDayId != null ? eventDayId.hashCode() : 0);
        hash += (wrtUid != null ? wrtUid.hashCode() : 0);
        hash += (subEventId != null ? subEventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAttendancePK)) {
            return false;
        }
        TbAttendancePK other = (TbAttendancePK) object;
        if ((this.eventDayId == null && other.eventDayId != null) || (this.eventDayId != null && !this.eventDayId.equals(other.eventDayId))) {
            return false;
        }
        if ((this.wrtUid == null && other.wrtUid != null) || (this.wrtUid != null && !this.wrtUid.equals(other.wrtUid))) {
            return false;
        }
        if ((this.subEventId == null && other.subEventId != null) || (this.subEventId != null && !this.subEventId.equals(other.subEventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAttendancePK[ eventDayId=" + eventDayId + ", wrtUid=" + wrtUid + ", subEventId=" + subEventId + " ]";
    }
    
}
