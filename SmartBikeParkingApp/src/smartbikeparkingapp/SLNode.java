/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */
public class SLNode {

    private AreaDesc areaDesc;
    private SLNode next;    

    public SLNode(AreaDesc areaDesc, SLNode next) {
        this.areaDesc = areaDesc;
        this.next = next;
    }

    public AreaDesc getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(AreaDesc areaDesc) {
        this.areaDesc = areaDesc;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
    
    public String printAreaDesc(){
        String sMessage;
        sMessage = "Area Name: " + areaDesc.getAreaName() + "\n Population: " + areaDesc.getPopulation() + "\n Current Bikes Racks: " + areaDesc.getCurrentBikeRacks();
        return sMessage;
    }
    
    
}
