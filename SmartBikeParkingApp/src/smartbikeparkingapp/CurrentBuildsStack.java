/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class CurrentBuildsStack implements StackInterface {
    private final ArrayList<SmartBikeParkLocation> theStack;
    
    //constructor with an arraylist of type object SmartBikeParkLocation
    public CurrentBuildsStack(){
        theStack = new ArrayList<>();
    }
    
    //check if stack is empty
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    
    //check the size of the stack, used for isFull()
    @Override
    public int size(){
        return theStack.size();
    }

    /*this method will check if the size is greater or equal to 3, marking the stack as full
       in my implementation I will only allow 3 jobs to be added from the priority queue
    */
    @Override
    public boolean isFull(){
        return theStack.size() >= 3;
        
    }
    
    //push to top of the stack, i will be pushing straight from the PQ an object
    @Override
    public void push(Object theElement){
        //if the stack is not full we add it to the top, if not we display an error message
        if(!isFull()){
            theStack.add(0, (SmartBikeParkLocation) theElement);           
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR, STACK IS FULL CANNOT ADD ANYMORE JOBS!");
        }
        
    }
    //if the stack is not empty, returns object and removes, if it is empty returned null
    @Override
    public SmartBikeParkLocation pop(){
        if(!theStack.isEmpty()){
            return theStack.remove(0);
        }
        else{
            return null;
        }
    }
 //method to print the stack using the same method in the pq element but adjusting it to an array list type stack   
    @Override
    public String printStack(){ 
       String sMessage = "";        
       for(int iCount = 0; iCount < theStack.size(); iCount++){
                  
        String sIsSheltered;
        if(theStack.get(iCount).isIsSheltered()){
            sIsSheltered = "IS Sheltered";
        }
        else{
            sIsSheltered = "IS NOT Sheltered";
        }           
           sMessage += "\nLocation: " + theStack.get(iCount).getLocation() + "\n Bike Capacity: " + theStack.get(iCount).getBikeCapacity() + "\n The location: " + sIsSheltered;
       }
       return sMessage;
    }
    
    
    
    
}
