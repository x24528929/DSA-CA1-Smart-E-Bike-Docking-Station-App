/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */
public class AreaDesc {
    private int areaName;
    private int population;
    private int currentBikeRacks;

    public AreaDesc(int areaName, int population, int currentBikeRacks) {
        this.areaName = areaName;
        this.population = population;
        this.currentBikeRacks = currentBikeRacks;
    }

    public AreaDesc() {
    }

    public int getAreaName() {
        return areaName;
    }

    public void setAreaName(int areaName) {
        this.areaName = areaName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCurrentBikeRacks() {
        return currentBikeRacks;
    }

    public void setCurrentBikeRacks(int currentBikeRacks) {
        this.currentBikeRacks = currentBikeRacks;
    }
    
    
    
    
}
