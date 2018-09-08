/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_user_device")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUserDevice.findAll", query = "SELECT t FROM TbUserDevice t")
    , @NamedQuery(name = "TbUserDevice.findByDeviceId", query = "SELECT t FROM TbUserDevice t WHERE t.tbUserDevicePK.deviceId = :deviceId")
    , @NamedQuery(name = "TbUserDevice.findByUserId", query = "SELECT t FROM TbUserDevice t WHERE t.tbUserDevicePK.userId = :userId")})
public class TbUserDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbUserDevicePK tbUserDevicePK;
    @JoinColumn(name = "device_id", referencedColumnName = "device_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbDevice tbDevice;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbUser tbUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUserDevice")
    private Collection<TbOrder> tbOrderCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbUserDevice")
    private Collection<TbTransaction> tbTransactionCollection;

    public TbUserDevice() {
    }

    public TbUserDevice(TbUserDevicePK tbUserDevicePK) {
        this.tbUserDevicePK = tbUserDevicePK;
    }

    public TbUserDevice(String deviceId, String userId) {
        this.tbUserDevicePK = new TbUserDevicePK(deviceId, userId);
    }

    public TbUserDevicePK getTbUserDevicePK() {
        return tbUserDevicePK;
    }

    public void setTbUserDevicePK(TbUserDevicePK tbUserDevicePK) {
        this.tbUserDevicePK = tbUserDevicePK;
    }

    public TbDevice getTbDevice() {
        return tbDevice;
    }

    public void setTbDevice(TbDevice tbDevice) {
        this.tbDevice = tbDevice;
    }

    public TbUser getTbUser() {
        return tbUser;
    }

    public void setTbUser(TbUser tbUser) {
        this.tbUser = tbUser;
    }

    @XmlTransient
    public Collection<TbOrder> getTbOrderCollection() {
        return tbOrderCollection;
    }

    public void setTbOrderCollection(Collection<TbOrder> tbOrderCollection) {
        this.tbOrderCollection = tbOrderCollection;
    }

    @XmlTransient
    public Collection<TbTransaction> getTbTransactionCollection() {
        return tbTransactionCollection;
    }

    public void setTbTransactionCollection(Collection<TbTransaction> tbTransactionCollection) {
        this.tbTransactionCollection = tbTransactionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbUserDevicePK != null ? tbUserDevicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUserDevice)) {
            return false;
        }
        TbUserDevice other = (TbUserDevice) object;
        if ((this.tbUserDevicePK == null && other.tbUserDevicePK != null) || (this.tbUserDevicePK != null && !this.tbUserDevicePK.equals(other.tbUserDevicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbUserDevice[ tbUserDevicePK=" + tbUserDevicePK + " ]";
    }
    
}
