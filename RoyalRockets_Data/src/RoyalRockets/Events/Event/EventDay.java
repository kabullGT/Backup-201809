/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and openTime the template in the editor.
 */
package RoyalRockets.Events.Event;

import RoyalRockets.Events.Sales.CoPartner;
import RoyalRockets.Events.Sales.Order;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Infax
 */
public class EventDay {
    private int id;
    private Event event;
    private Date openTime;
    private Date closeTime;
    private List<EventArea> eventAreas;
    private List<Order> orders;
    private List<Attendee> attendees;
    private List<Wristband> wristbands;
    private List<Attendance> attendances;
    private List<WristbandType> wristbandTypes;
    private List<CoPartner> coPartners;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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

    public List<EventArea> getEventAreas() {
        return eventAreas;
    }

    public void setEventAreas(List<EventArea> eventAreas) {
        this.eventAreas = eventAreas;
    }
    
    public void addEventArea(EventArea eventArea) {
        this.eventAreas.add(eventArea);
    }
    
    public void removeEventArea(EventArea eventArea) {
        this.eventAreas.remove(eventArea);
    }
    
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    
    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
    
    public void addAttendee(Attendee attendee) {
        this.attendees.add(attendee);
    }
    
    public void removeAttendee(Attendee attendee) {
        this.attendees.add(attendee);
    }

    public List<Wristband> getWristbands() {
        return wristbands;
    }

    public void setWristbands(List<Wristband> wristbands) {
        this.wristbands = wristbands;
    }
    
    public void addWristband(Wristband wristband) {
        this.wristbands.add(wristband);
    }
    
    public void removeWristband(Wristband wristband) {
        this.wristbands.remove(wristband);
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }
    
    public void addAttendance(Attendance attendance) {
        this.attendances.add(attendance);
    }
    
    public void removeAttendance(Attendance attendance) {
        this.attendances.remove(attendance);
    }

    public List<WristbandType> getWristbandTypes() {
        return wristbandTypes;
    }

    public void setWristbandTypes(List<WristbandType> wristbandTypes) {
        this.wristbandTypes = wristbandTypes;
    }
    
    public void addWristbandType(WristbandType wristbandType) {
        this.wristbandTypes.add(wristbandType);
    }
    
    public void removeWristbandType(WristbandType wristbandType) {
        this.wristbandTypes.remove(wristbandType);
    }

    public List<CoPartner> getCoPartners() {
        return coPartners;
    }

    public void setCoPartners(List<CoPartner> coPartners) {
        this.coPartners = coPartners;
    }

    public void addCoPartner(CoPartner coPartner) {
        this.coPartners.add(coPartner);
    }
    
    public void removeCoPartner(CoPartner coPartner) {
        this.coPartners.remove(coPartner);
    }
}
