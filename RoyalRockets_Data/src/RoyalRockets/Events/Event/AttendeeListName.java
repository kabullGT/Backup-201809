/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

/**
 *
 * @author Infax
 */
public class AttendeeListName {
    private int id;
    private String nameInAttendeeList;
    private String identifierForNameInAttendeeList;
    private boolean valid;
    private AttendeeList attendeeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameInAttendeeList() {
        return nameInAttendeeList;
    }

    public void setNameInAttendeeList(String nameInAttendeeList) {
        this.nameInAttendeeList = nameInAttendeeList;
    }

    public String getIdentifierForNameInAttendeeList() {
        return identifierForNameInAttendeeList;
    }

    public void setIdentifierForNameInAttendeeList(String identifierForNameInAttendeeList) {
        this.identifierForNameInAttendeeList = identifierForNameInAttendeeList;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public AttendeeList getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(AttendeeList attendeeList) {
        this.attendeeList = attendeeList;
    }
}
