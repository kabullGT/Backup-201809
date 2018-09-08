/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kabull
 */
@Entity
@Table(name = "tb_transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTransaction.findAll", query = "SELECT t FROM TbTransaction t")
    , @NamedQuery(name = "TbTransaction.findByTrnId", query = "SELECT t FROM TbTransaction t WHERE t.trnId = :trnId")
    , @NamedQuery(name = "TbTransaction.findByTrnDatetime", query = "SELECT t FROM TbTransaction t WHERE t.trnDatetime = :trnDatetime")
    , @NamedQuery(name = "TbTransaction.findByAmount", query = "SELECT t FROM TbTransaction t WHERE t.amount = :amount")})
public class TbTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "trn_id")
    private String trnId;
    @Column(name = "trn_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnDatetime;
    @Column(name = "amount")
    private BigInteger amount;
    @JoinColumns({
        @JoinColumn(name = "acccount_id", referencedColumnName = "acccount_id")
        , @JoinColumn(name = "wrt_uid", referencedColumnName = "wrt_uid")})
    @ManyToOne(optional = false)
    private TbAccountWristband tbAccountWristband;
    @JoinColumn(name = "log_id", referencedColumnName = "log_id")
    @ManyToOne(optional = false)
    private TbLog logId;
    @JoinColumn(name = "module_id", referencedColumnName = "module_id")
    @ManyToOne(optional = false)
    private TbSystemModule moduleId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "trnId1")
    private TbTransaction tbTransaction;
    @JoinColumn(name = "trn_id1", referencedColumnName = "trn_id")
    @OneToOne(optional = false)
    private TbTransaction trnId1;
    @JoinColumn(name = "trn_type_id", referencedColumnName = "trn_type_id")
    @ManyToOne(optional = false)
    private TbTransactionType trnTypeId;
    @JoinColumns({
        @JoinColumn(name = "device_id", referencedColumnName = "device_id")
        , @JoinColumn(name = "user_id", referencedColumnName = "user_id")})
    @ManyToOne(optional = false)
    private TbUserDevice tbUserDevice;

    public TbTransaction() {
    }

    public TbTransaction(String trnId) {
        this.trnId = trnId;
    }

    public String getTrnId() {
        return trnId;
    }

    public void setTrnId(String trnId) {
        this.trnId = trnId;
    }

    public Date getTrnDatetime() {
        return trnDatetime;
    }

    public void setTrnDatetime(Date trnDatetime) {
        this.trnDatetime = trnDatetime;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public TbAccountWristband getTbAccountWristband() {
        return tbAccountWristband;
    }

    public void setTbAccountWristband(TbAccountWristband tbAccountWristband) {
        this.tbAccountWristband = tbAccountWristband;
    }

    public TbLog getLogId() {
        return logId;
    }

    public void setLogId(TbLog logId) {
        this.logId = logId;
    }

    public TbSystemModule getModuleId() {
        return moduleId;
    }

    public void setModuleId(TbSystemModule moduleId) {
        this.moduleId = moduleId;
    }

    public TbTransaction getTbTransaction() {
        return tbTransaction;
    }

    public void setTbTransaction(TbTransaction tbTransaction) {
        this.tbTransaction = tbTransaction;
    }

    public TbTransaction getTrnId1() {
        return trnId1;
    }

    public void setTrnId1(TbTransaction trnId1) {
        this.trnId1 = trnId1;
    }

    public TbTransactionType getTrnTypeId() {
        return trnTypeId;
    }

    public void setTrnTypeId(TbTransactionType trnTypeId) {
        this.trnTypeId = trnTypeId;
    }

    public TbUserDevice getTbUserDevice() {
        return tbUserDevice;
    }

    public void setTbUserDevice(TbUserDevice tbUserDevice) {
        this.tbUserDevice = tbUserDevice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnId != null ? trnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTransaction)) {
            return false;
        }
        TbTransaction other = (TbTransaction) object;
        if ((this.trnId == null && other.trnId != null) || (this.trnId != null && !this.trnId.equals(other.trnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbTransaction[ trnId=" + trnId + " ]";
    }
    
}
