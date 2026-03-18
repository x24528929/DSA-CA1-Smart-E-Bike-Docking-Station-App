/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */
public class PQElement {
    private int iKey;
    private SmartBikeParkLocation smbLocation;

    public PQElement(int iKey, SmartBikeParkLocation smbLocation) {
        this.iKey = iKey;
        this.smbLocation = smbLocation;
    }

    public int getiKey() {
        return iKey;
    }

    public void setiKey(int iKey) {
        this.iKey = iKey;
    }

    public SmartBikeParkLocation getSmbLocation() {
        return smbLocation;
    }

    public void setSmbLocation(SmartBikeParkLocation smbLocation) {
        this.smbLocation = smbLocation;
    }
    
    public String printSMBLocation(){
        String sMessage;
        String sIsSheltered;
        if(smbLocation.isIsSheltered()){
            sIsSheltered = "IS Sheltered";
        }
        else{
            sIsSheltered = "IS NOT Sheltered";
        }
        sMessage = "Location: " + smbLocation.getLocation() + "\n Bike Capacity: " + smbLocation.getBikeCapacity() + "\n The location: " + sIsSheltered;
        return sMessage;
    }
    
}
