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
@Table(name = "tb_event_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEventOwner.findAll", query = "SELECT t FROM TbEventOwner t")
    , @NamedQuery(name = "TbEventOwner.findByEventOwnerId", query = "SELECT t FROM TbEventOwner t WHERE t.eventOwnerId = :eventOwnerId")
    , @NamedQuery(name = "TbEventOwner.findById", query = "SELECT t FROM TbEventOwner t WHERE t.id = :id")
    , @NamedQuery(name = "TbEventOwner.findByName", query = "SELECT t FROM TbEventOwner t WHERE t.name = :name")
    , @NamedQuery(name = "TbEventOwner.findByAddress", query = "SELECT t FROM TbEventOwner t WHERE t.address = :address")
    , @NamedQuery(name = "TbEventOwner.findByZipcode", query = "SELECT t FROM TbEventOwner t WHERE t.zipcode = :zipcode")
    , @NamedQuery(name = "TbEventOwner.findByCountry", query = "SELECT t FROM TbEventOwner t WHERE t.country = :country")
    , @NamedQuery(name = "TbEventOwner.findByContactName", query = "SELECT t FROM TbEventOwner t WHERE t.contactName = :contactName")
    , @NamedQuery(name = "TbEventOwner.findByPhone1", query = "SELECT t FROM TbEventOwner t WHERE t.phone1 = :phone1")
    , @NamedQuery(name = "TbEventOwner.findByPhone2", query = "SELECT t FROM TbEventOwner t WHERE t.phone2 = :phone2")
    , @NamedQuery(name = "TbEventOwner.findByEmail", query = "SELECT t FROM TbEventOwner t WHERE t.email = :email")
    , @NamedQuery(name = "TbEventOwner.findByImagePatch", query = "SELECT t FROM TbEventOwner t WHERE t.imagePatch = :imagePatch")})
public class TbEventOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "event_owner_id")
    private String eventOwnerId;
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "country")
    private String country;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "phone1")
    private String phone1;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "email")
    private String email;
    @Column(name = "image_patch")
    private String imagePatch;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventOwnerId")
    private Collection<TbEvent> tbEventCollection;

    public TbEventOwner() {
    }

    public TbEventOwner(String eventOwnerId) {
        this.eventOwnerId = eventOwnerId;
    }

    public String getEventOwnerId() {
        return eventOwnerId;
    }

    public void setEventOwnerId(String eventOwnerId) {
        this.eventOwnerId = eventOwnerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    @XmlTransient
    public Collection<TbEvent> getTbEventCollection() {
        return tbEventCollection;
    }

    public void setTbEventCollection(Collection<TbEvent> tbEventCollection) {
        this.tbEventCollection = tbEventCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventOwnerId != null ? eventOwnerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEventOwner)) {
            return false;
        }
        TbEventOwner other = (TbEventOwner) object;
        if ((this.eventOwnerId == null && other.eventOwnerId != null) || (this.eventOwnerId != null && !this.eventOwnerId.equals(other.eventOwnerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbEventOwner[ eventOwnerId=" + eventOwnerId + " ]";
    }
    
}
