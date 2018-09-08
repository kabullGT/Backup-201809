/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_day_copartner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDayCopartner.findAll", query = "SELECT t FROM TbDayCopartner t")
    , @NamedQuery(name = "TbDayCopartner.findByCopartnerId", query = "SELECT t FROM TbDayCopartner t WHERE t.copartnerId = :copartnerId")})
public class TbDayCopartner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "copartner_id")
    private String copartnerId;
    @JoinColumn(name = "copartner_id", referencedColumnName = "copartner_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TbCopartner tbCopartner;
    @JoinColumn(name = "event_day_id", referencedColumnName = "event_day_id")
    @ManyToOne(optional = false)
    private TbEventDay eventDayId;

    public TbDayCopartner() {
    }

    public TbDayCopartner(String copartnerId) {
        this.copartnerId = copartnerId;
    }

    public String getCopartnerId() {
        return copartnerId;
    }

    public void setCopartnerId(String copartnerId) {
        this.copartnerId = copartnerId;
    }

    public TbCopartner getTbCopartner() {
        return tbCopartner;
    }

    public void setTbCopartner(TbCopartner tbCopartner) {
        this.tbCopartner = tbCopartner;
    }

    public TbEventDay getEventDayId() {
        return eventDayId;
    }

    public void setEventDayId(TbEventDay eventDayId) {
        this.eventDayId = eventDayId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (copartnerId != null ? copartnerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDayCopartner)) {
            return false;
        }
        TbDayCopartner other = (TbDayCopartner) object;
        if ((this.copartnerId == null && other.copartnerId != null) || (this.copartnerId != null && !this.copartnerId.equals(other.copartnerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbDayCopartner[ copartnerId=" + copartnerId + " ]";
    }
    
}
