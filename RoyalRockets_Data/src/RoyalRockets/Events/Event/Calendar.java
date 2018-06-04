/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import java.util.List;

/**
 *
 * @author Infax
 */
public class Calendar {
    private Wristband wristband;
    private List<EventDay> eventDays;
    private List<SubEvent> subEvents;

    public Wristband getWristband() {
        return wristband;
    }

    public void setWristband(Wristband wristband) {
        this.wristband = wristband;
    }

    public List<EventDay> getEventDays() {
        return eventDays;
    }

    public void setEventDays(List<EventDay> eventDays) {
        this.eventDays = eventDays;
    }
    
    public void addEventDay(EventDay eventDay) {
        this.eventDays.add(eventDay);
    }
    
    public void removeEventDay(EventDay eventDay) {
        this.eventDays.remove(eventDay);
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
