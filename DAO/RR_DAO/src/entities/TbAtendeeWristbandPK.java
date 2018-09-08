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
public class TbAtendeeWristbandPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "atendee_ruid")
    private String atendeeRuid;
    @Basic(optional = false)
    @Column(name = "wrt_uid")
    private String wrtUid;

    public TbAtendeeWristbandPK() {
    }

    public TbAtendeeWristbandPK(String atendeeRuid, String wrtUid) {
        this.atendeeRuid = atendeeRuid;
        this.wrtUid = wrtUid;
    }

    public String getAtendeeRuid() {
        return atendeeRuid;
    }

    public void setAtendeeRuid(String atendeeRuid) {
        this.atendeeRuid = atendeeRuid;
    }

    public String getWrtUid() {
        return wrtUid;
    }

    public void setWrtUid(String wrtUid) {
        this.wrtUid = wrtUid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atendeeRuid != null ? atendeeRuid.hashCode() : 0);
        hash += (wrtUid != null ? wrtUid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtendeeWristbandPK)) {
            return false;
        }
        TbAtendeeWristbandPK other = (TbAtendeeWristbandPK) object;
        if ((this.atendeeRuid == null && other.atendeeRuid != null) || (this.atendeeRuid != null && !this.atendeeRuid.equals(other.atendeeRuid))) {
            return false;
        }
        if ((this.wrtUid == null && other.wrtUid != null) || (this.wrtUid != null && !this.wrtUid.equals(other.wrtUid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAtendeeWristbandPK[ atendeeRuid=" + atendeeRuid + ", wrtUid=" + wrtUid + " ]";
    }
    
}
