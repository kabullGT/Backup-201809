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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_wristband_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWristbandStatus.findAll", query = "SELECT t FROM TbWristbandStatus t")
    , @NamedQuery(name = "TbWristbandStatus.findByWristbandStatusId", query = "SELECT t FROM TbWristbandStatus t WHERE t.wristbandStatusId = :wristbandStatusId")
    , @NamedQuery(name = "TbWristbandStatus.findByDsc", query = "SELECT t FROM TbWristbandStatus t WHERE t.dsc = :dsc")})
public class TbWristbandStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wristband_status_id")
    private String wristbandStatusId;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wristbandStatusId")
    private Collection<TbWristband> tbWristbandCollection;

    public TbWristbandStatus() {
    }

    public TbWristbandStatus(String wristbandStatusId) {
        this.wristbandStatusId = wristbandStatusId;
    }

    public String getWristbandStatusId() {
        return wristbandStatusId;
    }

    public void setWristbandStatusId(String wristbandStatusId) {
        this.wristbandStatusId = wristbandStatusId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbWristband> getTbWristbandCollection() {
        return tbWristbandCollection;
    }

    public void setTbWristbandCollection(Collection<TbWristband> tbWristbandCollection) {
        this.tbWristbandCollection = tbWristbandCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wristbandStatusId != null ? wristbandStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbWristbandStatus)) {
            return false;
        }
        TbWristbandStatus other = (TbWristbandStatus) object;
        if ((this.wristbandStatusId == null && other.wristbandStatusId != null) || (this.wristbandStatusId != null && !this.wristbandStatusId.equals(other.wristbandStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWristbandStatus[ wristbandStatusId=" + wristbandStatusId + " ]";
    }
    
}
