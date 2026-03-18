/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class SmartBikeParkPQ implements PQInterface {
    private final ArrayList<PQElement> thePQueue;
    
    public SmartBikeParkPQ(){
        thePQueue = new ArrayList<>();
    }
    //return if pqueue is empty
    @Override
    public boolean isEmpty(){
        return thePQueue.isEmpty();
    }
    //return size of pqueue
    @Override
    public int size(){
        return thePQueue.size();
    }
    //method for finding the insert position of new element entering pqueue
    private int findInsertPosition(int iNewKey){
        boolean bFound = false;
        int iPosition = 0;
        PQElement currElement;
        //while loop comparing the first element priority with the new key
        //if higher, it moves onto the next position if not we change boolean value exiting the loop
        while(iPosition < thePQueue.size() && !bFound){
            currElement = thePQueue.get(iPosition);
            if(currElement.getiKey()>iNewKey){
                iPosition ++;
            }
            else{
                bFound = true;
            }
        }
        //return the position for element to be inserted
        return iPosition;      
    }
    //queue the element based on insert position
    @Override
    public void enqueue(int iPriorityKey, Object theElement){
        //create new element and type cast smartbikeparklocation type object 
        PQElement newElement = new PQElement(iPriorityKey, (SmartBikeParkLocation) theElement);
        //find the index where we will insert of the priority key
        int iIndex = findInsertPosition(iPriorityKey);
        
        //add to the end 
        if(iIndex==thePQueue.size()){
            thePQueue.add(newElement);
        }
        //other wise add at insert position
        else{
            thePQueue.add(iIndex, newElement);
        }
    }
    //removing and returning the first object in the pqueue
    @Override
    public Object dequeue(){
        return thePQueue.remove(0);
    }
    
    //print the pq by a while loop going through each pq element and calling the print smblocation method 
    @Override
    public String printPQueue(){
        int iPosition = 0;
        String pqList = "";
        while(iPosition<thePQueue.size()){
            pqList += thePQueue.get(iPosition).printSMBLocation() + "\n";
            iPosition ++;
        }
        return pqList;
    }

}
