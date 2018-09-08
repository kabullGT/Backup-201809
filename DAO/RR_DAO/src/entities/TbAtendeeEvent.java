/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "tb_atendee_event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAtendeeEvent.findAll", query = "SELECT t FROM TbAtendeeEvent t")
    , @NamedQuery(name = "TbAtendeeEvent.findByAtendeeRuid", query = "SELECT t FROM TbAtendeeEvent t WHERE t.tbAtendeeEventPK.atendeeRuid = :atendeeRuid")
    , @NamedQuery(name = "TbAtendeeEvent.findByEventId", query = "SELECT t FROM TbAtendeeEvent t WHERE t.eventId = :eventId")
    , @NamedQuery(name = "TbAtendeeEvent.findByEventDayId", query = "SELECT t FROM TbAtendeeEvent t WHERE t.tbAtendeeEventPK.eventDayId = :eventDayId")})
public class TbAtendeeEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbAtendeeEventPK tbAtendeeEventPK;
    @Basic(optional = false)
    @Column(name = "event_id")
    private String eventId;
    @JoinColumn(name = "atendee_ruid", referencedColumnName = "atendee_ruid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbAtendee tbAtendee;
    @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEventDay tbEventDay;

    public TbAtendeeEvent() {
    }

    public TbAtendeeEvent(TbAtendeeEventPK tbAtendeeEventPK) {
        this.tbAtendeeEventPK = tbAtendeeEventPK;
    }

    public TbAtendeeEvent(TbAtendeeEventPK tbAtendeeEventPK, String eventId) {
        this.tbAtendeeEventPK = tbAtendeeEventPK;
        this.eventId = eventId;
    }

    public TbAtendeeEvent(String atendeeRuid, String eventDayId) {
        this.tbAtendeeEventPK = new TbAtendeeEventPK(atendeeRuid, eventDayId);
    }

    public TbAtendeeEventPK getTbAtendeeEventPK() {
        return tbAtendeeEventPK;
    }

    public void setTbAtendeeEventPK(TbAtendeeEventPK tbAtendeeEventPK) {
        this.tbAtendeeEventPK = tbAtendeeEventPK;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public TbAtendee getTbAtendee() {
        return tbAtendee;
    }

    public void setTbAtendee(TbAtendee tbAtendee) {
        this.tbAtendee = tbAtendee;
    }

    public TbEventDay getTbEventDay() {
        return tbEventDay;
    }

    public void setTbEventDay(TbEventDay tbEventDay) {
        this.tbEventDay = tbEventDay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbAtendeeEventPK != null ? tbAtendeeEventPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtendeeEvent)) {
            return false;
        }
        TbAtendeeEvent other = (TbAtendeeEvent) object;
        if ((this.tbAtendeeEventPK == null && other.tbAtendeeEventPK != null) || (this.tbAtendeeEventPK != null && !this.tbAtendeeEventPK.equals(other.tbAtendeeEventPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAtendeeEvent[ tbAtendeeEventPK=" + tbAtendeeEventPK + " ]";
    }
    
}
