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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_copartner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCopartner.findAll", query = "SELECT t FROM TbCopartner t")
    , @NamedQuery(name = "TbCopartner.findByCopartnerId", query = "SELECT t FROM TbCopartner t WHERE t.copartnerId = :copartnerId")
    , @NamedQuery(name = "TbCopartner.findByName", query = "SELECT t FROM TbCopartner t WHERE t.name = :name")
    , @NamedQuery(name = "TbCopartner.findByAddress", query = "SELECT t FROM TbCopartner t WHERE t.address = :address")
    , @NamedQuery(name = "TbCopartner.findByZipcode", query = "SELECT t FROM TbCopartner t WHERE t.zipcode = :zipcode")
    , @NamedQuery(name = "TbCopartner.findByCountry", query = "SELECT t FROM TbCopartner t WHERE t.country = :country")
    , @NamedQuery(name = "TbCopartner.findByPhone1", query = "SELECT t FROM TbCopartner t WHERE t.phone1 = :phone1")
    , @NamedQuery(name = "TbCopartner.findByPhone2", query = "SELECT t FROM TbCopartner t WHERE t.phone2 = :phone2")
    , @NamedQuery(name = "TbCopartner.findByEmail", query = "SELECT t FROM TbCopartner t WHERE t.email = :email")
    , @NamedQuery(name = "TbCopartner.findByEventId", query = "SELECT t FROM TbCopartner t WHERE t.eventId = :eventId")
    , @NamedQuery(name = "TbCopartner.findByEventDayId", query = "SELECT t FROM TbCopartner t WHERE t.eventDayId = :eventDayId")
    , @NamedQuery(name = "TbCopartner.findByImagePatch", query = "SELECT t FROM TbCopartner t WHERE t.imagePatch = :imagePatch")})
public class TbCopartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "copartner_id")
    private String copartnerId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "country")
    private String country;
    @Column(name = "phone1")
    private String phone1;
    @Column(name = "phone2")
    private String phone2;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "event_id")
    private String eventId;
    @Basic(optional = false)
    @Column(name = "event_day_id")
    private String eventDayId;
    @Column(name = "image_patch")
    private String imagePatch;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbCopartner")
    private Collection<TbCopartnerProduct> tbCopartnerProductCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "copartnerId")
    private Collection<TbSalepoint> tbSalepointCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tbCopartner")
    private TbDayCopartner tbDayCopartner;

    public TbCopartner() {
    }

    public TbCopartner(String copartnerId) {
        this.copartnerId = copartnerId;
    }

    public TbCopartner(String copartnerId, String eventId, String eventDayId) {
        this.copartnerId = copartnerId;
        this.eventId = eventId;
        this.eventDayId = eventDayId;
    }

    public String getCopartnerId() {
        return copartnerId;
    }

    public void setCopartnerId(String copartnerId) {
        this.copartnerId = copartnerId;
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

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(String eventDayId) {
        this.eventDayId = eventDayId;
    }

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    @XmlTransient
    public Collection<TbCopartnerProduct> getTbCopartnerProductCollection() {
        return tbCopartnerProductCollection;
    }

    public void setTbCopartnerProductCollection(Collection<TbCopartnerProduct> tbCopartnerProductCollection) {
        this.tbCopartnerProductCollection = tbCopartnerProductCollection;
    }

    @XmlTransient
    public Collection<TbSalepoint> getTbSalepointCollection() {
        return tbSalepointCollection;
    }

    public void setTbSalepointCollection(Collection<TbSalepoint> tbSalepointCollection) {
        this.tbSalepointCollection = tbSalepointCollection;
    }

    public TbDayCopartner getTbDayCopartner() {
        return tbDayCopartner;
    }

    public void setTbDayCopartner(TbDayCopartner tbDayCopartner) {
        this.tbDayCopartner = tbDayCopartner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (copartnerId != null ? copartnerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCopartner)) {
            return false;
        }
        TbCopartner other = (TbCopartner) object;
        if ((this.copartnerId == null && other.copartnerId != null) || (this.copartnerId != null && !this.copartnerId.equals(other.copartnerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbCopartner[ copartnerId=" + copartnerId + " ]";
    }
    
}
