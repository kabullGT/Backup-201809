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
@Table(name = "tb_wrt_sub_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWrtSubType.findAll", query = "SELECT t FROM TbWrtSubType t")
    , @NamedQuery(name = "TbWrtSubType.findByWrtSubTypeId", query = "SELECT t FROM TbWrtSubType t WHERE t.wrtSubTypeId = :wrtSubTypeId")
    , @NamedQuery(name = "TbWrtSubType.findByName", query = "SELECT t FROM TbWrtSubType t WHERE t.name = :name")
    , @NamedQuery(name = "TbWrtSubType.findByDsc", query = "SELECT t FROM TbWrtSubType t WHERE t.dsc = :dsc")})
public class TbWrtSubType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "wrt_sub_type_id")
    private String wrtSubTypeId;
    @Column(name = "name")
    private String name;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wrtSubTypeId")
    private Collection<TbWrtType> tbWrtTypeCollection;

    public TbWrtSubType() {
    }

    public TbWrtSubType(String wrtSubTypeId) {
        this.wrtSubTypeId = wrtSubTypeId;
    }

    public String getWrtSubTypeId() {
        return wrtSubTypeId;
    }

    public void setWrtSubTypeId(String wrtSubTypeId) {
        this.wrtSubTypeId = wrtSubTypeId;
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

    @XmlTransient
    public Collection<TbWrtType> getTbWrtTypeCollection() {
        return tbWrtTypeCollection;
    }

    public void setTbWrtTypeCollection(Collection<TbWrtType> tbWrtTypeCollection) {
        this.tbWrtTypeCollection = tbWrtTypeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wrtSubTypeId != null ? wrtSubTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbWrtSubType)) {
            return false;
        }
        TbWrtSubType other = (TbWrtSubType) object;
        if ((this.wrtSubTypeId == null && other.wrtSubTypeId != null) || (this.wrtSubTypeId != null && !this.wrtSubTypeId.equals(other.wrtSubTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWrtSubType[ wrtSubTypeId=" + wrtSubTypeId + " ]";
    }
    
}
