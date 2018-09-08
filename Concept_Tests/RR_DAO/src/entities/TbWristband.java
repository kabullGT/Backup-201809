/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_wristband")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWristband.findAll", query = "SELECT t FROM TbWristband t")
    , @NamedQuery(name = "TbWristband.findByWrtUid", query = "SELECT t FROM TbWristband t WHERE t.wrtUid = :wrtUid")
    , @NamedQuery(name = "TbWristband.findByEventId", query = "SELECT t FROM TbWristband t WHERE t.eventId = :eventId")
    , @NamedQuery(name = "TbWristband.findByWrtCode", query = "SELECT t FROM TbWristband t WHERE t.wrtCode = :wrtCode")})
public class TbWristband implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wrt_uid")
    private String wrtUid;
    @Basic(optional = false)
    @Column(name = "event_id")
    private String eventId;
    @Column(name = "wrt_code")
    private String wrtCode;
    @ManyToMany(mappedBy = "tbWristbandCollection")
    private Collection<TbSubEvent> tbSubEventCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbWristband")
    private Collection<TbAccountWristband> tbAccountWristbandCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tbWristband")
    private TbAtendeeWristband tbAtendeeWristband;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbWristband")
    private Collection<TbAttendance> tbAttendanceCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbWristband")
    private Collection<TbOrder> tbOrderCollection;
    @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id")
    @ManyToOne(optional = false)
    private TbEventDay eventDayId;
    @JoinColumn(name = "wristband_status_id", referencedColumnName = "wristband_status_id")
    @ManyToOne(optional = false)
    private TbWristbandStatus wristbandStatusId;
    @JoinColumn(name = "wrt_type_id", referencedColumnName = "wrt_type_id")
    @ManyToOne(optional = false)
    private TbWrtType wrtTypeId;

    public TbWristband() {
    }

    public TbWristband(String wrtUid) {
        this.wrtUid = wrtUid;
    }

    public TbWristband(String wrtUid, String eventId) {
        this.wrtUid = wrtUid;
        this.eventId = eventId;
    }

    public String getWrtUid() {
        return wrtUid;
    }

    public void setWrtUid(String wrtUid) {
        this.wrtUid = wrtUid;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getWrtCode() {
        return wrtCode;
    }

    public void setWrtCode(String wrtCode) {
        this.wrtCode = wrtCode;
    }

    @XmlTransient
    public Collection<TbSubEvent> getTbSubEventCollection() {
        return tbSubEventCollection;
    }

    public void setTbSubEventCollection(Collection<TbSubEvent> tbSubEventCollection) {
        this.tbSubEventCollection = tbSubEventCollection;
    }

    @XmlTransient
    public Collection<TbAccountWristband> getTbAccountWristbandCollection() {
        return tbAccountWristbandCollection;
    }

    public void setTbAccountWristbandCollection(Collection<TbAccountWristband> tbAccountWristbandCollection) {
        this.tbAccountWristbandCollection = tbAccountWristbandCollection;
    }

    public TbAtendeeWristband getTbAtendeeWristband() {
        return tbAtendeeWristband;
    }

    public void setTbAtendeeWristband(TbAtendeeWristband tbAtendeeWristband) {
        this.tbAtendeeWristband = tbAtendeeWristband;
    }

    @XmlTransient
    public Collection<TbAttendance> getTbAttendanceCollection() {
        return tbAttendanceCollection;
    }

    public void setTbAttendanceCollection(Collection<TbAttendance> tbAttendanceCollection) {
        this.tbAttendanceCollection = tbAttendanceCollection;
    }

    @XmlTransient
    public Collection<TbOrder> getTbOrderCollection() {
        return tbOrderCollection;
    }

    public void setTbOrderCollection(Collection<TbOrder> tbOrderCollection) {
        this.tbOrderCollection = tbOrderCollection;
    }

    public TbEventDay getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(TbEventDay eventDayId) {
        this.eventDayId = eventDayId;
    }

    public TbWristbandStatus getWristbandStatusId() {
        return wristbandStatusId;
    }

    public void setWristbandStatusId(TbWristbandStatus wristbandStatusId) {
        this.wristbandStatusId = wristbandStatusId;
    }

    public TbWrtType getWrtTypeId() {
        return wrtTypeId;
    }

    public void setWrtTypeId(TbWrtType wrtTypeId) {
        this.wrtTypeId = wrtTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wrtUid != null ? wrtUid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbWristband)) {
            return false;
        }
        TbWristband other = (TbWristband) object;
        if ((this.wrtUid == null && other.wrtUid != null) || (this.wrtUid != null && !this.wrtUid.equals(other.wrtUid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWristband[ wrtUid=" + wrtUid + " ]";
    }
    
}
