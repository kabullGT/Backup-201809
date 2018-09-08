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
@Table(name = "tb_device")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDevice.findAll", query = "SELECT t FROM TbDevice t")
    , @NamedQuery(name = "TbDevice.findByDeviceId", query = "SELECT t FROM TbDevice t WHERE t.deviceId = :deviceId")
    , @NamedQuery(name = "TbDevice.findByName", query = "SELECT t FROM TbDevice t WHERE t.name = :name")
    , @NamedQuery(name = "TbDevice.findByBrand", query = "SELECT t FROM TbDevice t WHERE t.brand = :brand")
    , @NamedQuery(name = "TbDevice.findByModel", query = "SELECT t FROM TbDevice t WHERE t.model = :model")
    , @NamedQuery(name = "TbDevice.findByDsc", query = "SELECT t FROM TbDevice t WHERE t.dsc = :dsc")})
public class TbDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbDevice")
    private Collection<TbUserDevice> tbUserDeviceCollection;

    public TbDevice() {
    }

    public TbDevice(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbUserDevice> getTbUserDeviceCollection() {
        return tbUserDeviceCollection;
    }

    public void setTbUserDeviceCollection(Collection<TbUserDevice> tbUserDeviceCollection) {
        this.tbUserDeviceCollection = tbUserDeviceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deviceId != null ? deviceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDevice)) {
            return false;
        }
        TbDevice other = (TbDevice) object;
        if ((this.deviceId == null && other.deviceId != null) || (this.deviceId != null && !this.deviceId.equals(other.deviceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbDevice[ deviceId=" + deviceId + " ]";
    }
    
}
