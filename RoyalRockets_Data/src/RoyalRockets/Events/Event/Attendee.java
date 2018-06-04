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
public class Attendee {
    private int attendeeRuid;
    private String externalSystemId;
    private AttendeeType type;
    private String name;
    private Date birth;
    private String address;
    private String zipCode;
    private String country;
    private String phone1;
    private String phone2;
    private String email;
    private String ticketId;
    private List<Wristband> wristband;
    private List<Event> event;

    public int getId() {
        return attendeeRuid;
    }

    public void setId(int attendeeRuid) {
        this.attendeeRuid = attendeeRuid;
    }

    public String getExternalSystemId() {
        return externalSystemId;
    }

    public void setExternalSystemId(String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }

    public AttendeeType getType() {
        return type;
    }

    public void setType(AttendeeType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}
