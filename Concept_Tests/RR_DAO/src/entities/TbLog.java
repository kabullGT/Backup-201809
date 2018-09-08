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
import javax.persistence.Lob;
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
@Table(name = "tb_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLog.findAll", query = "SELECT t FROM TbLog t")
    , @NamedQuery(name = "TbLog.findByLogId", query = "SELECT t FROM TbLog t WHERE t.logId = :logId")})
public class TbLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "log_id")
    private String logId;
    @Lob
    @Column(name = "log_dsc")
    private byte[] logDsc;
    @JoinColumn(name = "log_type_id", referencedColumnName = "log_type_id")
    @ManyToOne(optional = false)
    private TbLogType logTypeId;
    @JoinColumn(name = "module_id", referencedColumnName = "module_id")
    @ManyToOne(optional = false)
    private TbSystemModule moduleId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "logId")
    private Collection<TbTransaction> tbTransactionCollection;

    public TbLog() {
    }

    public TbLog(String logId) {
        this.logId = logId;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public byte[] getLogDsc() {
        return logDsc;
    }

    public void setLogDsc(byte[] logDsc) {
        this.logDsc = logDsc;
    }

    public TbLogType getLogTypeId() {
        return logTypeId;
    }

    public void setLogTypeId(TbLogType logTypeId) {
        this.logTypeId = logTypeId;
    }

    public TbSystemModule getModuleId() {
        return moduleId;
    }

    public void setModuleId(TbSystemModule moduleId) {
        this.moduleId = moduleId;
    }

    @XmlTransient
    public Collection<TbTransaction> getTbTransactionCollection() {
        return tbTransactionCollection;
    }

    public void setTbTransactionCollection(Collection<TbTransaction> tbTransactionCollection) {
        this.tbTransactionCollection = tbTransactionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLog)) {
            return false;
        }
        TbLog other = (TbLog) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbLog[ logId=" + logId + " ]";
    }
    
}
