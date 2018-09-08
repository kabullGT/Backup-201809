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
@Table(name = "tb_atendee_id_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAtendeeIdType.findAll", query = "SELECT t FROM TbAtendeeIdType t")
    , @NamedQuery(name = "TbAtendeeIdType.findByIdType", query = "SELECT t FROM TbAtendeeIdType t WHERE t.idType = :idType")
    , @NamedQuery(name = "TbAtendeeIdType.findByDsc", query = "SELECT t FROM TbAtendeeIdType t WHERE t.dsc = :dsc")})
public class TbAtendeeIdType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_type")
    private Integer idType;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idType")
    private Collection<TbAtendee> tbAtendeeCollection;

    public TbAtendeeIdType() {
    }

    public TbAtendeeIdType(Integer idType) {
        this.idType = idType;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbAtendee> getTbAtendeeCollection() {
        return tbAtendeeCollection;
    }

    public void setTbAtendeeCollection(Collection<TbAtendee> tbAtendeeCollection) {
        this.tbAtendeeCollection = tbAtendeeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAtendeeIdType)) {
            return false;
        }
        TbAtendeeIdType other = (TbAtendeeIdType) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAtendeeIdType[ idType=" + idType + " ]";
    }
    
}
