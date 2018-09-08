/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_attendance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAttendance.findAll", query = "SELECT t FROM TbAttendance t")
    , @NamedQuery(name = "TbAttendance.findByEventDayId", query = "SELECT t FROM TbAttendance t WHERE t.tbAttendancePK.eventDayId = :eventDayId")
    , @NamedQuery(name = "TbAttendance.findByWrtUid", query = "SELECT t FROM TbAttendance t WHERE t.tbAttendancePK.wrtUid = :wrtUid")
    , @NamedQuery(name = "TbAttendance.findByCheckin", query = "SELECT t FROM TbAttendance t WHERE t.checkin = :checkin")
    , @NamedQuery(name = "TbAttendance.findByCheckout", query = "SELECT t FROM TbAttendance t WHERE t.checkout = :checkout")
    , @NamedQuery(name = "TbAttendance.findBySubEventId", query = "SELECT t FROM TbAttendance t WHERE t.tbAttendancePK.subEventId = :subEventId")})
public class TbAttendance implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbAttendancePK tbAttendancePK;
    @Column(name = "checkin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkin;
    @Column(name = "checkout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkout;
    @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEventDay tbEventDay;
    @JoinColumn(name = "sub_event_id", referencedColumnName = "sub_event_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbSubEvent tbSubEvent;
    @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbWristband tbWristband;

    public TbAttendance() {
    }

    public TbAttendance(TbAttendancePK tbAttendancePK) {
        this.tbAttendancePK = tbAttendancePK;
    }

    public TbAttendance(String eventDayId, String wrtUid, String subEventId) {
        this.tbAttendancePK = new TbAttendancePK(eventDayId, wrtUid, subEventId);
    }

    public TbAttendancePK getTbAttendancePK() {
        return tbAttendancePK;
    }

    public void setTbAttendancePK(TbAttendancePK tbAttendancePK) {
        this.tbAttendancePK = tbAttendancePK;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public TbEventDay getTbEventDay() {
        return tbEventDay;
    }

    public void setTbEventDay(TbEventDay tbEventDay) {
        this.tbEventDay = tbEventDay;
    }

    public TbSubEvent getTbSubEvent() {
        return tbSubEvent;
    }

    public void setTbSubEvent(TbSubEvent tbSubEvent) {
        this.tbSubEvent = tbSubEvent;
    }

    public TbWristband getTbWristband() {
        return tbWristband;
    }

    public void setTbWristband(TbWristband tbWristband) {
        this.tbWristband = tbWristband;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbAttendancePK != null ? tbAttendancePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAttendance)) {
            return false;
        }
        TbAttendance other = (TbAttendance) object;
        if ((this.tbAttendancePK == null && other.tbAttendancePK != null) || (this.tbAttendancePK != null && !this.tbAttendancePK.equals(other.tbAttendancePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAttendance[ tbAttendancePK=" + tbAttendancePK + " ]";
    }
    
}
