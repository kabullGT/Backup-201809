/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import RoyalRockets.Events.System.User;
import java.util.List;

/**
 *
 * @author Infax
 */
public class AttendeeList {
    private int id;
    private String description;
    private float chargeAmount;
    private float topUpAmount;
    private User owner;
    private List<AttendeeListName> attendeeNames;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(float chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public float getTopUpAmount() {
        return topUpAmount;
    }

    public void setTopUpAmount(float topUpAmount) {
        this.topUpAmount = topUpAmount;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<AttendeeListName> getAttendeeNames() {
        return attendeeNames;
    }

    public void setAttendeeNames(List<AttendeeListName> attendeeNames) {
        this.attendeeNames = attendeeNames;
    }
    
    public void addAttendeeListName(AttendeeListName name) {
        this.attendeeNames.add(name);
    }
    
    public void removeAttendeeListName(AttendeeListName name) {
        this.attendeeNames.remove(name);
    }
}
