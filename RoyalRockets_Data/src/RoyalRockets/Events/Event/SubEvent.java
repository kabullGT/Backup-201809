/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Infax
 */
public class SubEvent {
    private int id;
    private String name;
    private Date openTime;
    private Date closeTime;
    private EventArea eventArea;
    private List<Calendar> calendarsIncludingSubEvent;
    private List<Attendance> attendances;
    private List<SubEvent> subEvents;

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

    public EventArea getEventArea() {
        return eventArea;
    }

    public void setEventArea(EventArea eventArea) {
        this.eventArea = eventArea;
    }

    public List<Calendar> getCalendarsIncludingSubEvent() {
        return calendarsIncludingSubEvent;
    }

    public void setCalendarsIncludingSubEvent(List<Calendar> calendarsIncludingSubEvent) {
        this.calendarsIncludingSubEvent = calendarsIncludingSubEvent;
    }
    
    public void addCalendarInlcudingSubEvent(Calendar calendarIncludingSubEvent) {
        this.calendarsIncludingSubEvent.add(calendarIncludingSubEvent);
    }
    
    public void removeCalendarIncludingSubEvent(Calendar calendarIncludingSubEvent) {
        this.calendarsIncludingSubEvent.remove(calendarIncludingSubEvent);
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
}
