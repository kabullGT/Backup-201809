/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_general_config")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbGeneralConfig.findAll", query = "SELECT t FROM TbGeneralConfig t")
    , @NamedQuery(name = "TbGeneralConfig.findById", query = "SELECT t FROM TbGeneralConfig t WHERE t.id = :id")
    , @NamedQuery(name = "TbGeneralConfig.findByExternalId", query = "SELECT t FROM TbGeneralConfig t WHERE t.externalId = :externalId")})
public class TbGeneralConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Lob
    @Column(name = "dsc")
    private byte[] dsc;
    @Lob
    @Column(name = "value")
    private byte[] value;
    @Lob
    @Column(name = "source")
    private byte[] source;
    @Column(name = "external_id")
    private String externalId;

    public TbGeneralConfig() {
    }

    public TbGeneralConfig(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getDsc() {
        return dsc;
    }

    public void setDsc(byte[] dsc) {
        this.dsc = dsc;
    }

    public byte[] getValue() {
        return value;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }

    public byte[] getSource() {
        return source;
    }

    public void setSource(byte[] source) {
        this.source = source;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbGeneralConfig)) {
            return false;
        }
        TbGeneralConfig other = (TbGeneralConfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbGeneralConfig[ id=" + id + " ]";
    }
    
}
