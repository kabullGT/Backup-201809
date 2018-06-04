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
public class WristbandStatus {
    private int id;
    private String description;
    private List<Wristband> wristbands;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    
    public void removeWristband(Wristband wristband) {
        this.wristbands.remove(wristband);
    }
}
