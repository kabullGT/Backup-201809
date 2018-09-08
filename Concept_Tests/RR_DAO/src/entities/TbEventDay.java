/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_event_day")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEventDay.findAll", query = "SELECT t FROM TbEventDay t")
    , @NamedQuery(name = "TbEventDay.findByEventDayId", query = "SELECT t FROM TbEventDay t WHERE t.eventDayId = :eventDayId")
    , @NamedQuery(name = "TbEventDay.findByDatetimeOpen", query = "SELECT t FROM TbEventDay t WHERE t.datetimeOpen = :datetimeOpen")
    , @NamedQuery(name = "TbEventDay.findByDatetimeClose", query = "SELECT t FROM TbEventDay t WHERE t.datetimeClose = :datetimeClose")})
public class TbEventDay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "event_day_id")
    private String eventDayId;
    @Column(name = "datetime_open")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeOpen;
    @Column(name = "datetime_close")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeClose;
    @JoinTable(name = "tb_wristband_day", joinColumns = {
        @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id")}, inverseJoinColumns = {
        @JoinColumn(name = "wrt_type_id", referencedColumnName = "wrt_type_id")})
    @ManyToMany
    private Collection<TbWrtType> tbWrtTypeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEventDay")
    private Collection<TbAttendance> tbAttendanceCollection;
    @JoinColumn(name = "event_id", referencedColumnName = "event_id")
    @ManyToOne(optional = false)
    private TbEvent eventId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventDayId")
    private Collection<TbEventArea> tbEventAreaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEventDay")
    private Collection<TbOrder> tbOrderCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventDayId")
    private Collection<TbWristband> tbWristbandCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEventDay")
    private Collection<TbAtendeeEvent> tbAtendeeEventCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventDayId")
    private Collection<TbDayCopartner> tbDayCopartnerCollection;

    public TbEventDay() {
    }

    public TbEventDay(String eventDayId) {
        this.eventDayId = eventDayId;
    }

    public String getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(String eventDayId) {
        this.eventDayId = eventDayId;
    }

    public Date getDatetimeOpen() {
        return datetimeOpen;
    }

    public void setDatetimeOpen(Date datetimeOpen) {
        this.datetimeOpen = datetimeOpen;
    }

    public Date getDatetimeClose() {
        return datetimeClose;
    }

    public void setDatetimeClose(Date datetimeClose) {
        this.datetimeClose = datetimeClose;
    }

    @XmlTransient
    public Collection<TbWrtType> getTbWrtTypeCollection() {
        return tbWrtTypeCollection;
    }

    public void setTbWrtTypeCollection(Collection<TbWrtType> tbWrtTypeCollection) {
        this.tbWrtTypeCollection = tbWrtTypeCollection;
    }

    @XmlTransient
    public Collection<TbAttendance> getTbAttendanceCollection() {
        return tbAttendanceCollection;
    }

    public void setTbAttendanceCollection(Collection<TbAttendance> tbAttendanceCollection) {
        this.tbAttendanceCollection = tbAttendanceCollection;
    }

    public TbEvent getEventId() {
        return eventId;
    }

    public void setEventId(TbEvent eventId) {
        this.eventId = eventId;
    }

    @XmlTransient
    public Collection<TbEventArea> getTbEventAreaCollection() {
        return tbEventAreaCollection;
    }

    public void setTbEventAreaCollection(Collection<TbEventArea> tbEventAreaCollection) {
        this.tbEventAreaCollection = tbEventAreaCollection;
    }

    @XmlTransient
    public Collection<TbOrder> getTbOrderCollection() {
        return tbOrderCollection;
    }

    public void setTbOrderCollection(Collection<TbOrder> tbOrderCollection) {
        this.tbOrderCollection = tbOrderCollection;
    }

    @XmlTransient
    public Collection<TbWristband> getTbWristbandCollection() {
        return tbWristbandCollection;
    }

    public void setTbWristbandCollection(Collection<TbWristband> tbWristbandCollection) {
        this.tbWristbandCollection = tbWristbandCollection;
    }

    @XmlTransient
    public Collection<TbAtendeeEvent> getTbAtendeeEventCollection() {
        return tbAtendeeEventCollection;
    }

    public void setTbAtendeeEventCollection(Collection<TbAtendeeEvent> tbAtendeeEventCollection) {
        this.tbAtendeeEventCollection = tbAtendeeEventCollection;
    }

    @XmlTransient
    public Collection<TbDayCopartner> getTbDayCopartnerCollection() {
        return tbDayCopartnerCollection;
    }

    public void setTbDayCopartnerCollection(Collection<TbDayCopartner> tbDayCopartnerCollection) {
        this.tbDayCopartnerCollection = tbDayCopartnerCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventDayId != null ? eventDayId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEventDay)) {
            return false;
        }
        TbEventDay other = (TbEventDay) object;
        if ((this.eventDayId == null && other.eventDayId != null) || (this.eventDayId != null && !this.eventDayId.equals(other.eventDayId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbEventDay[ eventDayId=" + eventDayId + " ]";
    }
    
}
