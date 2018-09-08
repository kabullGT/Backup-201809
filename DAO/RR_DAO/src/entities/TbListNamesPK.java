/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Kabull
 */
@Embeddable
public class TbListNamesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "list_name")
    private String listName;
    @Basic(optional = false)
    @Column(name = "list_name_identifyer")
    private String listNameIdentifyer;

    public TbListNamesPK() {
    }

    public TbListNamesPK(String listName, String listNameIdentifyer) {
        this.listName = listName;
        this.listNameIdentifyer = listNameIdentifyer;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListNameIdentifyer() {
        return listNameIdentifyer;
    }

    public void setListNameIdentifyer(String listNameIdentifyer) {
        this.listNameIdentifyer = listNameIdentifyer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listName != null ? listName.hashCode() : 0);
        hash += (listNameIdentifyer != null ? listNameIdentifyer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbListNamesPK)) {
            return false;
        }
        TbListNamesPK other = (TbListNamesPK) object;
        if ((this.listName == null && other.listName != null) || (this.listName != null && !this.listName.equals(other.listName))) {
            return false;
        }
        if ((this.listNameIdentifyer == null && other.listNameIdentifyer != null) || (this.listNameIdentifyer != null && !this.listNameIdentifyer.equals(other.listNameIdentifyer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbListNamesPK[ listName=" + listName + ", listNameIdentifyer=" + listNameIdentifyer + " ]";
    }
    
}
