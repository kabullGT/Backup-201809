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
@Table(name = "tb_combo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCombo.findAll", query = "SELECT t FROM TbCombo t")
    , @NamedQuery(name = "TbCombo.findByComboId", query = "SELECT t FROM TbCombo t WHERE t.comboId = :comboId")
    , @NamedQuery(name = "TbCombo.findByDsc", query = "SELECT t FROM TbCombo t WHERE t.dsc = :dsc")})
public class TbCombo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "combo_id")
    private String comboId;
    @Column(name = "dsc")
    private String dsc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbCombo")
    private Collection<TbProductCombo> tbProductComboCollection;

    public TbCombo() {
    }

    public TbCombo(String comboId) {
        this.comboId = comboId;
    }

    public String getComboId() {
        return comboId;
    }

    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    @XmlTransient
    public Collection<TbProductCombo> getTbProductComboCollection() {
        return tbProductComboCollection;
    }

    public void setTbProductComboCollection(Collection<TbProductCombo> tbProductComboCollection) {
        this.tbProductComboCollection = tbProductComboCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comboId != null ? comboId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCombo)) {
            return false;
        }
        TbCombo other = (TbCombo) object;
        if ((this.comboId == null && other.comboId != null) || (this.comboId != null && !this.comboId.equals(other.comboId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbCombo[ comboId=" + comboId + " ]";
    }
    
}
