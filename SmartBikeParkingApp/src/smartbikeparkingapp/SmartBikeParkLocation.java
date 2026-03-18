/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */
public class SmartBikeParkLocation {
    private String location;
    private int bikeCapacity;
    private boolean isSheltered;
    
    public SmartBikeParkLocation(String location, int bikeCapacity, boolean isSheltered){
        this.location = location;
        this.bikeCapacity = bikeCapacity;
        this.isSheltered = isSheltered;
    }

    public SmartBikeParkLocation() {    
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBikeCapacity() {
        return bikeCapacity;
    }

    public void setBikeCapacity(int bikeCapacity) {
        this.bikeCapacity = bikeCapacity;
    }

    public boolean isIsSheltered() {
        return isSheltered;
    }

    public void setIsSheltered(boolean isSheltered) {
        this.isSheltered = isSheltered;
    }
    
    
    
}
