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
@Table(name = "tb_event_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEventArea.findAll", query = "SELECT t FROM TbEventArea t")
    , @NamedQuery(name = "TbEventArea.findByAreaId", query = "SELECT t FROM TbEventArea t WHERE t.areaId = :areaId")
    , @NamedQuery(name = "TbEventArea.findByAreaName", query = "SELECT t FROM TbEventArea t WHERE t.areaName = :areaName")
    , @NamedQuery(name = "TbEventArea.findByDsc", query = "SELECT t FROM TbEventArea t WHERE t.dsc = :dsc")
    , @NamedQuery(name = "TbEventArea.findByDatetimeOpen", query = "SELECT t FROM TbEventArea t WHERE t.datetimeOpen = :datetimeOpen")
    , @NamedQuery(name = "TbEventArea.findByDatetimeClose", query = "SELECT t FROM TbEventArea t WHERE t.datetimeClose = :datetimeClose")})
public class TbEventArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "area_id")
    private String areaId;
    @Column(name = "area_name")
    private String areaName;
    @Column(name = "dsc")
    private String dsc;
    @Column(name = "datetime_open")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeOpen;
    @Column(name = "datetime_close")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeClose;
    @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id")
    @ManyToOne(optional = false)
    private TbEventDay eventDayId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areaId")
    private Collection<TbSalepoint> tbSalepointCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areaId")
    private Collection<TbSubEvent> tbSubEventCollection;

    public TbEventArea() {
    }

    public TbEventArea(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
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

    public TbEventDay getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(TbEventDay eventDayId) {
        this.eventDayId = eventDayId;
    }

    @XmlTransient
    public Collection<TbSalepoint> getTbSalepointCollection() {
        return tbSalepointCollection;
    }

    public void setTbSalepointCollection(Collection<TbSalepoint> tbSalepointCollection) {
        this.tbSalepointCollection = tbSalepointCollection;
    }

    @XmlTransient
    public Collection<TbSubEvent> getTbSubEventCollection() {
        return tbSubEventCollection;
    }

    public void setTbSubEventCollection(Collection<TbSubEvent> tbSubEventCollection) {
        this.tbSubEventCollection = tbSubEventCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (areaId != null ? areaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEventArea)) {
            return false;
        }
        TbEventArea other = (TbEventArea) object;
        if ((this.areaId == null && other.areaId != null) || (this.areaId != null && !this.areaId.equals(other.areaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbEventArea[ areaId=" + areaId + " ]";
    }
    
}
