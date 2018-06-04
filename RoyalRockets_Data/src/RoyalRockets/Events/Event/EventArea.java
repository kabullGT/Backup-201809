/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import RoyalRockets.Events.Sales.SalePoint;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Infax
 */
public class EventArea {
    private int id;
    private String name;
    private String description;
    private Date openTime;
    private Date closeTime;
    private EventDay eventDay;
    private List<SubEvent> subEvents;
    private List<SalePoint> salePoints;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public EventDay getEventDay() {
        return eventDay;
    }

    public void setEventDay(EventDay eventDay) {
        this.eventDay = eventDay;
    }

    public List<SubEvent> getSubEvents() {
        return subEvents;
    }

    public void setSubEvents(List<SubEvent> subEvents) {
        this.subEvents = subEvents;
    }
    
    public void addSubEvent(SubEvent subEvent) {
        this.subEvents.add(subEvent);
    }
    
    public void removeSubEvent(SubEvent subEvent) {
        this.subEvents.remove(subEvent);
    }

    public List<SalePoint> getSalePoints() {
        return salePoints;
    }

    public void setSalePoints(List<SalePoint> salePoints) {
        this.salePoints = salePoints;
    }
    
    public void addSalePoint(SalePoint salePoint) {
        this.salePoints.add(salePoint);
    }
    
    public void removeSalePoint(SalePoint salePoint) {
        this.salePoints.remove(salePoint);
    }
}
