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
public class TbAccountWristbandPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "acccount_id")
    private String acccountId;
    @Basic(optional = false)
    @Column(name = "wrt_uid")
    private String wrtUid;

    public TbAccountWristbandPK() {
    }

    public TbAccountWristbandPK(String acccountId, String wrtUid) {
        this.acccountId = acccountId;
        this.wrtUid = wrtUid;
    }

    public String getAcccountId() {
        return acccountId;
    }

    public void setAcccountId(String acccountId) {
        this.acccountId = acccountId;
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
        hash += (acccountId != null ? acccountId.hashCode() : 0);
        hash += (wrtUid != null ? wrtUid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAccountWristbandPK)) {
            return false;
        }
        TbAccountWristbandPK other = (TbAccountWristbandPK) object;
        if ((this.acccountId == null && other.acccountId != null) || (this.acccountId != null && !this.acccountId.equals(other.acccountId))) {
            return false;
        }
        if ((this.wrtUid == null && other.wrtUid != null) || (this.wrtUid != null && !this.wrtUid.equals(other.wrtUid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAccountWristbandPK[ acccountId=" + acccountId + ", wrtUid=" + wrtUid + " ]";
    }
    
}
