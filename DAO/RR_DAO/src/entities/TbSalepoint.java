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
@Table(name = "tb_salepoint")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSalepoint.findAll", query = "SELECT t FROM TbSalepoint t")
    , @NamedQuery(name = "TbSalepoint.findByIdSalepoint", query = "SELECT t FROM TbSalepoint t WHERE t.idSalepoint = :idSalepoint")
    , @NamedQuery(name = "TbSalepoint.findByDsc", query = "SELECT t FROM TbSalepoint t WHERE t.dsc = :dsc")})
public class TbSalepoint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_salepoint")
    private String idSalepoint;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbSalepoint")
    private Collection<TbOrderProduct> tbOrderProductCollection;
    @JoinColumn(name = "copartner_id", referencedColumnName = "copartner_id")
    @ManyToOne(optional = false)
    private TbCopartner copartnerId;
    @JoinColumn(name = "area_id", referencedColumnName = "area_id")
    @ManyToOne(optional = false)
    private TbEventArea areaId;

    public TbSalepoint() {
    }

    public TbSalepoint(String idSalepoint) {
        this.idSalepoint = idSalepoint;
    }

    public String getIdSalepoint() {
        return idSalepoint;
    }

    public void setIdSalepoint(String idSalepoint) {
        this.idSalepoint = idSalepoint;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbOrderProduct> getTbOrderProductCollection() {
        return tbOrderProductCollection;
    }

    public void setTbOrderProductCollection(Collection<TbOrderProduct> tbOrderProductCollection) {
        this.tbOrderProductCollection = tbOrderProductCollection;
    }

    public TbCopartner getCopartnerId() {
        return copartnerId;
    }

    public void setCopartnerId(TbCopartner copartnerId) {
        this.copartnerId = copartnerId;
    }

    public TbEventArea getAreaId() {
        return areaId;
    }

    public void setAreaId(TbEventArea areaId) {
        this.areaId = areaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSalepoint != null ? idSalepoint.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSalepoint)) {
            return false;
        }
        TbSalepoint other = (TbSalepoint) object;
        if ((this.idSalepoint == null && other.idSalepoint != null) || (this.idSalepoint != null && !this.idSalepoint.equals(other.idSalepoint))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbSalepoint[ idSalepoint=" + idSalepoint + " ]";
    }
    
}
