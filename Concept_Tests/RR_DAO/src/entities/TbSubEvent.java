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
@Table(name = "tb_sub_event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSubEvent.findAll", query = "SELECT t FROM TbSubEvent t")
    , @NamedQuery(name = "TbSubEvent.findBySubEventId", query = "SELECT t FROM TbSubEvent t WHERE t.subEventId = :subEventId")
    , @NamedQuery(name = "TbSubEvent.findByName", query = "SELECT t FROM TbSubEvent t WHERE t.name = :name")
    , @NamedQuery(name = "TbSubEvent.findByDatetimeStart", query = "SELECT t FROM TbSubEvent t WHERE t.datetimeStart = :datetimeStart")
    , @NamedQuery(name = "TbSubEvent.findByDatetimeEnd", query = "SELECT t FROM TbSubEvent t WHERE t.datetimeEnd = :datetimeEnd")
    , @NamedQuery(name = "TbSubEvent.findByImagePatch", query = "SELECT t FROM TbSubEvent t WHERE t.imagePatch = :imagePatch")})
public class TbSubEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sub_event_id")
    private String subEventId;
    @Column(name = "name")
    private String name;
    @Column(name = "datetime_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeStart;
    @Column(name = "datetime_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeEnd;
    @Column(name = "image_patch")
    private String imagePatch;
    @JoinTable(name = "tb_wristband_sub_event", joinColumns = {
        @JoinColumn(name = "sub_event_id", referencedColumnName = "sub_event_id")}, inverseJoinColumns = {
        @JoinColumn(name = "wrt_type_id", referencedColumnName = "wrt_type_id")})
    @ManyToMany
    private Collection<TbWrtType> tbWrtTypeCollection;
    @JoinTable(name = "tb_calendar", joinColumns = {
        @JoinColumn(name = "sub_event_id", referencedColumnName = "sub_event_id")}, inverseJoinColumns = {
        @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid")})
    @ManyToMany
    private Collection<TbWristband> tbWristbandCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbSubEvent")
    private Collection<TbAttendance> tbAttendanceCollection;
    @JoinColumn(name = "area_id", referencedColumnName = "area_id")
    @ManyToOne(optional = false)
    private TbEventArea areaId;

    public TbSubEvent() {
    }

    public TbSubEvent(String subEventId) {
        this.subEventId = subEventId;
    }

    public String getSubEventId() {
        return subEventId;
    }

    public void setSubEventId(String subEventId) {
        this.subEventId = subEventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatetimeStart() {
        return datetimeStart;
    }

    public void setDatetimeStart(Date datetimeStart) {
        this.datetimeStart = datetimeStart;
    }

    public Date getDatetimeEnd() {
        return datetimeEnd;
    }

    public void setDatetimeEnd(Date datetimeEnd) {
        this.datetimeEnd = datetimeEnd;
    }

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    @XmlTransient
    public Collection<TbWrtType> getTbWrtTypeCollection() {
        return tbWrtTypeCollection;
    }

    public void setTbWrtTypeCollection(Collection<TbWrtType> tbWrtTypeCollection) {
        this.tbWrtTypeCollection = tbWrtTypeCollection;
    }

    @XmlTransient
    public Collection<TbWristband> getTbWristbandCollection() {
        return tbWristbandCollection;
    }

    public void setTbWristbandCollection(Collection<TbWristband> tbWristbandCollection) {
        this.tbWristbandCollection = tbWristbandCollection;
    }

    @XmlTransient
    public Collection<TbAttendance> getTbAttendanceCollection() {
        return tbAttendanceCollection;
    }

    public void setTbAttendanceCollection(Collection<TbAttendance> tbAttendanceCollection) {
        this.tbAttendanceCollection = tbAttendanceCollection;
    }

    public TbEventArea getAreaId() {
        return areaId;
    }

    public void setAreaId(TbEventArea areaId) {
        this.areaId = areaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subEventId != null ? subEventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSubEvent)) {
            return false;
        }
        TbSubEvent other = (TbSubEvent) object;
        if ((this.subEventId == null && other.subEventId != null) || (this.subEventId != null && !this.subEventId.equals(other.subEventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbSubEvent[ subEventId=" + subEventId + " ]";
    }
    
}
