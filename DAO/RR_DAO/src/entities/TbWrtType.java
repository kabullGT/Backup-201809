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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "tb_wrt_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWrtType.findAll", query = "SELECT t FROM TbWrtType t")
    , @NamedQuery(name = "TbWrtType.findByWrtTypeId", query = "SELECT t FROM TbWrtType t WHERE t.wrtTypeId = :wrtTypeId")
    , @NamedQuery(name = "TbWrtType.findByName", query = "SELECT t FROM TbWrtType t WHERE t.name = :name")
    , @NamedQuery(name = "TbWrtType.findByDsc", query = "SELECT t FROM TbWrtType t WHERE t.dsc = :dsc")
    , @NamedQuery(name = "TbWrtType.findByImagePatch", query = "SELECT t FROM TbWrtType t WHERE t.imagePatch = :imagePatch")})
public class TbWrtType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wrt_type_id")
    private String wrtTypeId;
    @Column(name = "name")
    private String name;
    @Column(name = "dsc")
    private String dsc;
    @Column(name = "image_patch")
    private String imagePatch;
    @ManyToMany(mappedBy = "tbWrtTypeCollection")
    private Collection<TbEventDay> tbEventDayCollection;
    @ManyToMany(mappedBy = "tbWrtTypeCollection")
    private Collection<TbSubEvent> tbSubEventCollection;
    @JoinColumn(name = "wrt_sub_type_id", referencedColumnName = "wrt_sub_type_id")
    @ManyToOne(optional = false)
    private TbWrtSubType wrtSubTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wrtTypeId")
    private Collection<TbWristband> tbWristbandCollection;

    public TbWrtType() {
    }

    public TbWrtType(String wrtTypeId) {
        this.wrtTypeId = wrtTypeId;
    }

    public String getWrtTypeId() {
        return wrtTypeId;
    }

    public void setWrtTypeId(String wrtTypeId) {
        this.wrtTypeId = wrtTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public String getImagePatch() {
        return imagePatch;
    }

    public void setImagePatch(String imagePatch) {
        this.imagePatch = imagePatch;
    }

    @XmlTransient
    public Collection<TbEventDay> getTbEventDayCollection() {
        return tbEventDayCollection;
    }

    public void setTbEventDayCollection(Collection<TbEventDay> tbEventDayCollection) {
        this.tbEventDayCollection = tbEventDayCollection;
    }

    @XmlTransient
    public Collection<TbSubEvent> getTbSubEventCollection() {
        return tbSubEventCollection;
    }

    public void setTbSubEventCollection(Collection<TbSubEvent> tbSubEventCollection) {
        this.tbSubEventCollection = tbSubEventCollection;
    }

    public TbWrtSubType getWrtSubTypeId() {
        return wrtSubTypeId;
    }

    public void setWrtSubTypeId(TbWrtSubType wrtSubTypeId) {
        this.wrtSubTypeId = wrtSubTypeId;
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
        hash += (wrtTypeId != null ? wrtTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbWrtType)) {
            return false;
        }
        TbWrtType other = (TbWrtType) object;
        if ((this.wrtTypeId == null && other.wrtTypeId != null) || (this.wrtTypeId != null && !this.wrtTypeId.equals(other.wrtTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWrtType[ wrtTypeId=" + wrtTypeId + " ]";
    }
    
}
