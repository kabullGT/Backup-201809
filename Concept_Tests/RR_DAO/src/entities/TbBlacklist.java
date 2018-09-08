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
@Table(name = "tb_blacklist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbBlacklist.findAll", query = "SELECT t FROM TbBlacklist t")
    , @NamedQuery(name = "TbBlacklist.findByAtendeeRuid", query = "SELECT t FROM TbBlacklist t WHERE t.tbBlacklistPK.atendeeRuid = :atendeeRuid")
    , @NamedQuery(name = "TbBlacklist.findByEventId", query = "SELECT t FROM TbBlacklist t WHERE t.tbBlacklistPK.eventId = :eventId")
    , @NamedQuery(name = "TbBlacklist.findByDeleted", query = "SELECT t FROM TbBlacklist t WHERE t.deleted = :deleted")})
public class TbBlacklist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbBlacklistPK tbBlacklistPK;
    @Lob
    @Column(name = "reason")
    private byte[] reason;
    @Column(name = "deleted")
    private Boolean deleted;
    @JoinColumn(name = "atendee_ruid", referencedColumnName = "atendee_ruid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbAtendee tbAtendee;
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TbEvent tbEvent;

    public TbBlacklist() {
    }

    public TbBlacklist(TbBlacklistPK tbBlacklistPK) {
        this.tbBlacklistPK = tbBlacklistPK;
    }

    public TbBlacklist(String atendeeRuid, String eventId) {
        this.tbBlacklistPK = new TbBlacklistPK(atendeeRuid, eventId);
    }

    public TbBlacklistPK getTbBlacklistPK() {
        return tbBlacklistPK;
    }

    public void setTbBlacklistPK(TbBlacklistPK tbBlacklistPK) {
        this.tbBlacklistPK = tbBlacklistPK;
    }

    public byte[] getReason() {
        return reason;
    }

    public void setReason(byte[] reason) {
        this.reason = reason;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public TbAtendee getTbAtendee() {
        return tbAtendee;
    }

    public void setTbAtendee(TbAtendee tbAtendee) {
        this.tbAtendee = tbAtendee;
    }

    public TbEvent getTbEvent() {
        return tbEvent;
    }

    public void setTbEvent(TbEvent tbEvent) {
        this.tbEvent = tbEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbBlacklistPK != null ? tbBlacklistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBlacklist)) {
            return false;
        }
        TbBlacklist other = (TbBlacklist) object;
        if ((this.tbBlacklistPK == null && other.tbBlacklistPK != null) || (this.tbBlacklistPK != null && !this.tbBlacklistPK.equals(other.tbBlacklistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbBlacklist[ tbBlacklistPK=" + tbBlacklistPK + " ]";
    }
    
}
