/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Sales;

import RoyalRockets.Events.Event.Device;
import RoyalRockets.Events.Event.EventDay;
import RoyalRockets.Events.Event.Wristband;
import RoyalRockets.Events.System.User;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Infax
 */
public class Order {
    private int id;
    private Wristband wristband;
    private Date time;
    private float total;
    private List<ProductInOrder> productsInOrder;
    private Device orderingDevice;
    private User orderingUser;
    private EventDay eventDay;
    private SalePoint salePoint;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Wristband getWristband() {
        return wristband;
    }

    public void setWristband(Wristband wristband) {
        this.wristband = wristband;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<ProductInOrder> getProductsInOrder() {
        return productsInOrder;
    }

    public void setProductsInOrder(List<ProductInOrder> productsInOrder) {
        this.productsInOrder = productsInOrder;
    }
    
    public void addProductInOrder(ProductInOrder product) {
        this.productsInOrder.add(product);
    }
    
    public void removePRoductInOrder(ProductInOrder product) {
        this.productsInOrder.remove(product);
    }

    public Device getOrderingDevice() {
        return orderingDevice;
    }

    public void setOrderingDevice(Device orderingDevice) {
        this.orderingDevice = orderingDevice;
    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public EventDay getEventDay() {
        return eventDay;
    }

    public void setEventDay(EventDay eventDay) {
        this.eventDay = eventDay;
    }

    public SalePoint getSalePoint() {
        return salePoint;
    }

    public void setSalePoint(SalePoint salePoint) {
        this.salePoint = salePoint;
    }
}
