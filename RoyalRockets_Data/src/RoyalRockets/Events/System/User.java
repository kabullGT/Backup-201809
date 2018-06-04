/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalRockets.Events.System;

import RoyalRockets.Events.Event.Device;
import java.util.List;

/**
 *
 * @author Infax
 */
public class User {
    private int id;
    private String name;
    private String password;
    private UserType type;
    private List<ModuleAuthorization> moduleAuthorizations;
    private List<Device> devices;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public List<ModuleAuthorization> getModuleAuthorizations() {
        return moduleAuthorizations;
    }

    public void setModuleAuthorizations(List<ModuleAuthorization> moduleAuthorizations) {
        this.moduleAuthorizations = moduleAuthorizations;
    }
    
    public void addModuleAuthorization(ModuleAuthorization moduleAuthorization) {
        this.moduleAuthorizations.add(moduleAuthorization);
    }
    
    public void removeModuleAuthorization(ModuleAuthorization moduleAuthorization) {
        this.moduleAuthorizations.remove(moduleAuthorization);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
    
    public void addDevice(Device device) {
        this.devices.add(device);
    }
    
    public void removeDevice(Device device) {
        this.devices.remove(device);
    }
}
