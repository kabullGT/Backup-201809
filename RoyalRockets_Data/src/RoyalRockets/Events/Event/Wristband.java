/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import RoyalRockets.Events.Sales.Order;
import java.util.List;

/**
 *
 * @author Infax
 */
public class Wristband {
    private int wuid;
    private Attendee attendeeRuid;
    private WristbandType type;
    private float balance;
    private Event event;
    private List<EventDay> eventDays;
    private WristbandStatus status;
    private Calendar calendar;
    private List<Order> orders;
    private List<Attendance> attendances;

    public int getWuid() {
        return wuid;
    }

    public void setWuid(int wuid) {
        this.wuid = wuid;
    }

    public Attendee getAttendeeRuid() {
        return attendeeRuid;
    }

    public void setAttendeeRuid(Attendee attendeeRuid) {
        this.attendeeRuid = attendeeRuid;
    }

    public WristbandType getType() {
        return type;
    }

    public void setType(WristbandType type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<EventDay> getEventDays() {
        return eventDays;
    }

    public void setEventDays(List<EventDay> eventDays) {
        this.eventDays = eventDays;
    }

    public WristbandStatus getStatus() {
        return status;
    }

    public void setStatus(WristbandStatus status) {
        this.status = status;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
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
}
