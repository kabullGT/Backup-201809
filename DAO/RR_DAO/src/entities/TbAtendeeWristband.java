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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_atendee_wristband")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAtendeeWristband.findAll", query = "SELECT t FROM TbAtendeeWristband t")
    , @NamedQuery(name = "TbAtendeeWristband.findByAtendeeRuid", query = "SELECT t FROM TbAtendeeWristband t WHERE t.tbAtendeeWristbandPK.atendeeRuid = :atendeeRuid")
    , @NamedQuery(name = "TbAtendeeWristband.findByWrtUid", query = "SELECT t FROM TbAtendeeWristband t WHERE t.tbAtendeeWristbandPK.wrtUid = :wrtUid")
    , @NamedQuery(name = "TbAtendeeWristband.findByRegisterDatetime", query = "SELECT t FROM TbAtendeeWristband t WHERE t.registerDatetime = :registerDatetime")})
public class TbAtendeeWristband implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbAtendeeWristbandPK tbAtendeeWristbandPK;
    @Column(name = "register_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDatetime;
    @JoinColumn(name = "atendee_ruid", referencedColumnName = "atendee_ruid", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TbAtendee tbAtendee;
    @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TbWristband tbWristband;

    public TbAtendeeWristband() {
    }

    public TbAtendeeWristband(TbAtendeeWristbandPK tbAtendeeWristbandPK) {
        this.tbAtendeeWristbandPK = tbAtendeeWristbandPK;
    }

    public TbAtendeeWristband(String atendeeRuid, String wrtUid) {
        this.tbAtendeeWristbandPK = new TbAtendeeWristbandPK(atendeeRuid, wrtUid);
    }

    public TbAtendeeWristbandPK getTbAtendeeWristbandPK() {
        return tbAtendeeWristbandPK;
    }

    public void setTbAtendeeWristbandPK(TbAtendeeWristbandPK tbAtendeeWristbandPK) {
        this.tbAtendeeWristbandPK = tbAtendeeWristbandPK;
    }

    public Date getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(Date registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public TbAtendee getTbAtendee() {
        return tbAtendee;
    }

    public void setTbAtendee(TbAtendee tbAtendee) {
        this.tbAtendee = tbAtendee;
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
        hash += (tbAtendeeWristbandPK != null ? tbAtendeeWristbandPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtendeeWristband)) {
            return false;
        }
        TbAtendeeWristband other = (TbAtendeeWristband) object;
        if ((this.tbAtendeeWristbandPK == null && other.tbAtendeeWristbandPK != null) || (this.tbAtendeeWristbandPK != null && !this.tbAtendeeWristbandPK.equals(other.tbAtendeeWristbandPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAtendeeWristband[ tbAtendeeWristbandPK=" + tbAtendeeWristbandPK + " ]";
    }
    
}
