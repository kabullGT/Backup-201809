/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Sales;

import RoyalRockets.Events.Event.Device;
import RoyalRockets.Events.Event.Wristband;
import RoyalRockets.Events.System.Module;
import RoyalRockets.Events.System.User;
import RoyalRockets.Events.System.Logger.LogEntry;
import java.util.Date;

/* 
 * Wristbands can transfer balance from one to the other.
 * In this case, the transfer will be tracked in the TB_TRANSACTION database as a credit transfer from Wristband A to Wristband B. Thus, requiring two transaction ids and two wuids to identify source and destination of the balance transfer.
 */

/**
 *
 * @author Infax
 */
public class Transaction {
    private int id;
    private float amount;
    private Date time;
    private TransactionType type;
    private Wristband wristband;
    private Transaction asscoiatedTransaction;
    private Wristband associatedWristband;
    private Module module;
    private Device device;
    private User user;
    private LogEntry log;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Wristband getWristband() {
        return wristband;
    }

    public void setWristband(Wristband wristband) {
        this.wristband = wristband;
    }

    public Transaction getAsscoiatedTransaction() {
        return asscoiatedTransaction;
    }

    public void setAsscoiatedTransaction(Transaction asscoiatedTransaction) {
        this.asscoiatedTransaction = asscoiatedTransaction;
    }

    public Wristband getAssociatedWristband() {
        return associatedWristband;
    }

    public void setAssociatedWristband(Wristband associatedWristband) {
        this.associatedWristband = associatedWristband;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LogEntry getLog() {
        return log;
    }

    public void setLog(LogEntry log) {
        this.log = log;
    }
}
