/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_list_names")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbListNames.findAll", query = "SELECT t FROM TbListNames t")
    , @NamedQuery(name = "TbListNames.findByListName", query = "SELECT t FROM TbListNames t WHERE t.tbListNamesPK.listName = :listName")
    , @NamedQuery(name = "TbListNames.findByListNameIdentifyer", query = "SELECT t FROM TbListNames t WHERE t.tbListNamesPK.listNameIdentifyer = :listNameIdentifyer")})
public class TbListNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbListNamesPK tbListNamesPK;
    @Lob
    @Column(name = "valid")
    private byte[] valid;
    @JoinColumn(name = "list_id", referencedColumnName = "list_id")
    @ManyToOne(optional = false)
    private TbList listId;

    public TbListNames() {
    }

    public TbListNames(TbListNamesPK tbListNamesPK) {
        this.tbListNamesPK = tbListNamesPK;
    }

    public TbListNames(String listName, String listNameIdentifyer) {
        this.tbListNamesPK = new TbListNamesPK(listName, listNameIdentifyer);
    }

    public TbListNamesPK getTbListNamesPK() {
        return tbListNamesPK;
    }

    public void setTbListNamesPK(TbListNamesPK tbListNamesPK) {
        this.tbListNamesPK = tbListNamesPK;
    }

    public byte[] getValid() {
        return valid;
    }

    public void setValid(byte[] valid) {
        this.valid = valid;
    }

    public TbList getListId() {
        return listId;
    }

    public void setListId(TbList listId) {
        this.listId = listId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbListNamesPK != null ? tbListNamesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbListNames)) {
            return false;
        }
        TbListNames other = (TbListNames) object;
        if ((this.tbListNamesPK == null && other.tbListNamesPK != null) || (this.tbListNamesPK != null && !this.tbListNamesPK.equals(other.tbListNamesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbListNames[ tbListNamesPK=" + tbListNamesPK + " ]";
    }
    
}
