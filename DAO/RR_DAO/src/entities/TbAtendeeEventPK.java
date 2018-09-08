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
public class TbAtendeeEventPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "atendee_ruid")
    private String atendeeRuid;
    @Basic(optional = false)
    @Column(name = "event_day_id")
    private String eventDayId;

    public TbAtendeeEventPK() {
    }

    public TbAtendeeEventPK(String atendeeRuid, String eventDayId) {
        this.atendeeRuid = atendeeRuid;
        this.eventDayId = eventDayId;
    }

    public String getAtendeeRuid() {
        return atendeeRuid;
    }

    public void setAtendeeRuid(String atendeeRuid) {
        this.atendeeRuid = atendeeRuid;
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
        hash += (atendeeRuid != null ? atendeeRuid.hashCode() : 0);
        hash += (eventDayId != null ? eventDayId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtendeeEventPK)) {
            return false;
        }
        TbAtendeeEventPK other = (TbAtendeeEventPK) object;
        if ((this.atendeeRuid == null && other.atendeeRuid != null) || (this.atendeeRuid != null && !this.atendeeRuid.equals(other.atendeeRuid))) {
            return false;
        }
        if ((this.eventDayId == null && other.eventDayId != null) || (this.eventDayId != null && !this.eventDayId.equals(other.eventDayId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAtendeeEventPK[ atendeeRuid=" + atendeeRuid + ", eventDayId=" + eventDayId + " ]";
    }
    
}
