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
public class TbBlacklistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "atendee_ruid")
    private String atendeeRuid;
    @Basic(optional = false)
    @Column(name = "event_id")
    private String eventId;

    public TbBlacklistPK() {
    }

    public TbBlacklistPK(String atendeeRuid, String eventId) {
        this.atendeeRuid = atendeeRuid;
        this.eventId = eventId;
    }

    public String getAtendeeRuid() {
        return atendeeRuid;
    }

    public void setAtendeeRuid(String atendeeRuid) {
        this.atendeeRuid = atendeeRuid;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atendeeRuid != null ? atendeeRuid.hashCode() : 0);
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBlacklistPK)) {
            return false;
        }
        TbBlacklistPK other = (TbBlacklistPK) object;
        if ((this.atendeeRuid == null && other.atendeeRuid != null) || (this.atendeeRuid != null && !this.atendeeRuid.equals(other.atendeeRuid))) {
            return false;
        }
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbBlacklistPK[ atendeeRuid=" + atendeeRuid + ", eventId=" + eventId + " ]";
    }
    
}
