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
@Table(name = "tb_event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEvent.findAll", query = "SELECT t FROM TbEvent t")
    , @NamedQuery(name = "TbEvent.findByEventId", query = "SELECT t FROM TbEvent t WHERE t.eventId = :eventId")
    , @NamedQuery(name = "TbEvent.findByName", query = "SELECT t FROM TbEvent t WHERE t.name = :name")
    , @NamedQuery(name = "TbEvent.findByAddress", query = "SELECT t FROM TbEvent t WHERE t.address = :address")
    , @NamedQuery(name = "TbEvent.findByZipcode", query = "SELECT t FROM TbEvent t WHERE t.zipcode = :zipcode")
    , @NamedQuery(name = "TbEvent.findByCountry", query = "SELECT t FROM TbEvent t WHERE t.country = :country")
    , @NamedQuery(name = "TbEvent.findByCapacity", query = "SELECT t FROM TbEvent t WHERE t.capacity = :capacity")
    , @NamedQuery(name = "TbEvent.findByDatetimeOpen", query = "SELECT t FROM TbEvent t WHERE t.datetimeOpen = :datetimeOpen")
    , @NamedQuery(name = "TbEvent.findByDatetimeClose", query = "SELECT t FROM TbEvent t WHERE t.datetimeClose = :datetimeClose")
    , @NamedQuery(name = "TbEvent.findByImagePatch", query = "SELECT t FROM TbEvent t WHERE t.imagePatch = :imagePatch")})
public class TbEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "event_id")
    private String eventId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "country")
    private String country;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "datetime_open")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeOpen;
    @Column(name = "datetime_close")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeClose;
    @Column(name = "image_patch")
    private String imagePatch;
    @JoinColumn(name = "event_owner_id", referencedColumnName = "event_owner_id")
    @ManyToOne(optional = false)
    private TbEventOwner eventOwnerId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbEvent")
    private Collection<TbBlacklist> tbBlacklistCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventId")
    private Collection<TbEventDay> tbEventDayCollection;

    public TbEvent() {
    }

    public TbEvent(String eventId) {
        this.eventId = eventId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
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

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    public TbEventOwner getEventOwnerId() {
        return eventOwnerId;
    }

    public void setEventOwnerId(TbEventOwner eventOwnerId) {
        this.eventOwnerId = eventOwnerId;
    }

    @XmlTransient
    public Collection<TbBlacklist> getTbBlacklistCollection() {
        return tbBlacklistCollection;
    }

    public void setTbBlacklistCollection(Collection<TbBlacklist> tbBlacklistCollection) {
        this.tbBlacklistCollection = tbBlacklistCollection;
    }

    @XmlTransient
    public Collection<TbEventDay> getTbEventDayCollection() {
        return tbEventDayCollection;
    }

    public void setTbEventDayCollection(Collection<TbEventDay> tbEventDayCollection) {
        this.tbEventDayCollection = tbEventDayCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEvent)) {
            return false;
        }
        TbEvent other = (TbEvent) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbEvent[ eventId=" + eventId + " ]";
    }
    
}
