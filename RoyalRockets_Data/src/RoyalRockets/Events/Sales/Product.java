/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.Sales;

import java.util.List;

/**
 *
 * @author Infax
 */
public class Product {
    private int id;
    private String name;
    private String description;
    private float cost;
    private float salePrince;
    private int quantity;
    private List<CoPartner> coPartners;

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getSalePrince() {
        return salePrince;
    }

    public void setSalePrince(float salePrince) {
        this.salePrince = salePrince;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
