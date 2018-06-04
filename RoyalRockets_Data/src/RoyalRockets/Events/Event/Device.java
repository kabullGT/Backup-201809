/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Event;

import RoyalRockets.Events.Sales.Order;
import RoyalRockets.Events.Sales.Transaction;
import java.util.List;

/**
 *
 * @author Infax
 */
public class Device {
    private int id;
    private String name;
    private String description;
    private String brand;
    private String model;
    private List<Order> orders;
    private List<Transaction> transactions;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
    
    public void removeTransaction(Transaction transaction) {
        this.transactions.remove(transaction);
    }
}
