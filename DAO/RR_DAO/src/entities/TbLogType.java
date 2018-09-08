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
@Table(name = "tb_log_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLogType.findAll", query = "SELECT t FROM TbLogType t")
    , @NamedQuery(name = "TbLogType.findByLogTypeId", query = "SELECT t FROM TbLogType t WHERE t.logTypeId = :logTypeId")
    , @NamedQuery(name = "TbLogType.findByName", query = "SELECT t FROM TbLogType t WHERE t.name = :name")
    , @NamedQuery(name = "TbLogType.findByDsc", query = "SELECT t FROM TbLogType t WHERE t.dsc = :dsc")})
public class TbLogType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "log_type_id")
    private String logTypeId;
    @Column(name = "name")
    private String name;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "logTypeId")
    private Collection<TbLog> tbLogCollection;

    public TbLogType() {
    }

    public TbLogType(String logTypeId) {
        this.logTypeId = logTypeId;
    }

    public String getLogTypeId() {
        return logTypeId;
    }

    public void setLogTypeId(String logTypeId) {
        this.logTypeId = logTypeId;
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
    public Collection<TbLog> getTbLogCollection() {
        return tbLogCollection;
    }

    public void setTbLogCollection(Collection<TbLog> tbLogCollection) {
        this.tbLogCollection = tbLogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logTypeId != null ? logTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLogType)) {
            return false;
        }
        TbLogType other = (TbLogType) object;
        if ((this.logTypeId == null && other.logTypeId != null) || (this.logTypeId != null && !this.logTypeId.equals(other.logTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbLogType[ logTypeId=" + logTypeId + " ]";
    }
    
}
