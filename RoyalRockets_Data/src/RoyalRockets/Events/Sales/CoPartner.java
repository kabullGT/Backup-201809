/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Sales;

import RoyalRockets.Events.Event.Event;
import RoyalRockets.Events.Event.EventDay;
import java.util.List;

/**
 *
 * @author Infax
 */
public class CoPartner {
    private int id;
    private String name;
    private String address;
    private String zipCode;
    private String country;
    private String phone1;
    private String phone2;
    private String email;
    private List<Event> events;
    private List<EventDay> eventDays;
    private List<SalePoint> salePoints;
    private List<Product> products;

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

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
    
    public void addEvent(Event event) {
        this.events.add(event);
    }
    
    public void remove(Event event) {
        this.events.remove(event);
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }
    
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
