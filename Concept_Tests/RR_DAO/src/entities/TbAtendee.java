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
import javax.persistence.OneToOne;
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
@Table(name = "tb_atendee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAtendee.findAll", query = "SELECT t FROM TbAtendee t")
    , @NamedQuery(name = "TbAtendee.findByAtendeeRuid", query = "SELECT t FROM TbAtendee t WHERE t.atendeeRuid = :atendeeRuid")
    , @NamedQuery(name = "TbAtendee.findById", query = "SELECT t FROM TbAtendee t WHERE t.id = :id")
    , @NamedQuery(name = "TbAtendee.findByName", query = "SELECT t FROM TbAtendee t WHERE t.name = :name")
    , @NamedQuery(name = "TbAtendee.findByBirth", query = "SELECT t FROM TbAtendee t WHERE t.birth = :birth")
    , @NamedQuery(name = "TbAtendee.findByAddress", query = "SELECT t FROM TbAtendee t WHERE t.address = :address")
    , @NamedQuery(name = "TbAtendee.findByZipcode", query = "SELECT t FROM TbAtendee t WHERE t.zipcode = :zipcode")
    , @NamedQuery(name = "TbAtendee.findByCountry", query = "SELECT t FROM TbAtendee t WHERE t.country = :country")
    , @NamedQuery(name = "TbAtendee.findByPhone1", query = "SELECT t FROM TbAtendee t WHERE t.phone1 = :phone1")
    , @NamedQuery(name = "TbAtendee.findByPhone2", query = "SELECT t FROM TbAtendee t WHERE t.phone2 = :phone2")
    , @NamedQuery(name = "TbAtendee.findByEmail", query = "SELECT t FROM TbAtendee t WHERE t.email = :email")
    , @NamedQuery(name = "TbAtendee.findByTicketid", query = "SELECT t FROM TbAtendee t WHERE t.ticketid = :ticketid")
    , @NamedQuery(name = "TbAtendee.findByImagePatch", query = "SELECT t FROM TbAtendee t WHERE t.imagePatch = :imagePatch")})
public class TbAtendee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "atendee_ruid")
    private String atendeeRuid;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "birth")
    @Temporal(TemporalType.DATE)
    private Date birth;
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
    @Column(name = "ticketid")
    private String ticketid;
    @Column(name = "image_patch")
    private String imagePatch;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tbAtendee")
    private TbAtendeeWristband tbAtendeeWristband;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbAtendee")
    private Collection<TbBlacklist> tbBlacklistCollection;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TbAtendeeIdType idType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbAtendee")
    private Collection<TbAtendeeEvent> tbAtendeeEventCollection;

    public TbAtendee() {
    }

    public TbAtendee(String atendeeRuid) {
        this.atendeeRuid = atendeeRuid;
    }

    public TbAtendee(String atendeeRuid, String id) {
        this.atendeeRuid = atendeeRuid;
        this.id = id;
    }

    public String getAtendeeRuid() {
        return atendeeRuid;
    }

    public void setAtendeeRuid(String atendeeRuid) {
        this.atendeeRuid = atendeeRuid;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
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

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    public TbAtendeeWristband getTbAtendeeWristband() {
        return tbAtendeeWristband;
    }

    public void setTbAtendeeWristband(TbAtendeeWristband tbAtendeeWristband) {
        this.tbAtendeeWristband = tbAtendeeWristband;
    }

    @XmlTransient
    public Collection<TbBlacklist> getTbBlacklistCollection() {
        return tbBlacklistCollection;
    }

    public void setTbBlacklistCollection(Collection<TbBlacklist> tbBlacklistCollection) {
        this.tbBlacklistCollection = tbBlacklistCollection;
    }

    public TbAtendeeIdType getIdType() {
        return idType;
    }

    public void setIdType(TbAtendeeIdType idType) {
        this.idType = idType;
    }

    @XmlTransient
    public Collection<TbAtendeeEvent> getTbAtendeeEventCollection() {
        return tbAtendeeEventCollection;
    }

    public void setTbAtendeeEventCollection(Collection<TbAtendeeEvent> tbAtendeeEventCollection) {
        this.tbAtendeeEventCollection = tbAtendeeEventCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atendeeRuid != null ? atendeeRuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtendee)) {
            return false;
        }
        TbAtendee other = (TbAtendee) object;
        if ((this.atendeeRuid == null && other.atendeeRuid != null) || (this.atendeeRuid != null && !this.atendeeRuid.equals(other.atendeeRuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAtendee[ atendeeRuid=" + atendeeRuid + " ]";
    }
    
}
