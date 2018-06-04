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
public class WristbandType {
    private int id;
    private String name;
    private String description;
    private List<WristbandSubType> subTypes;
    private List<Wristband> wristbands;
    private List<SubEvent> subEvents;
    private List<EventDay> eventDays;

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

    public List<WristbandSubType> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(List<WristbandSubType> subTypes) {
        this.subTypes = subTypes;
    }
    
    public void addSubType(WristbandSubType subType) {
        this.subTypes.add(subType);
    }
    
    public void removeSubType(WristbandSubType subType) {
        this.subTypes.add(subType);
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
    
    public void rmeoveWristband(Wristband wristband) {
        this.wristbands.remove(wristband);
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
}
