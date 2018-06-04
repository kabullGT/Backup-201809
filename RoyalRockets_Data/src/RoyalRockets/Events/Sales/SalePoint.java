/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Sales;

import RoyalRockets.Events.Event.EventArea;

/**
 *
 * @author Infax
 */
public class SalePoint {
    private int id;
    private String description;
    private CoPartner coPartner;
    private EventArea eventArea;

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

    public CoPartner getCoPartner() {
        return coPartner;
    }

    public void setCoPartner(CoPartner coPartner) {
        this.coPartner = coPartner;
    }

    public EventArea getEventArea() {
        return eventArea;
    }

    public void setEventArea(EventArea eventArea) {
        this.eventArea = eventArea;
    }
}
