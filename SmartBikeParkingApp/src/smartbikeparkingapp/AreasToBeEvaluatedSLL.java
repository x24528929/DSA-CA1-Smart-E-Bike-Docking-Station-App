/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */
public class AreasToBeEvaluatedSLL implements SLLInterface {
    private SLNode head;
    private SLNode currNode;
    private SLNode prevNode;
    private int iSize;
    
    public AreasToBeEvaluatedSLL(){
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }
    
    //set current method used to set the current node position for CRUD
    private void setCurrent(int iPosition){
        prevNode = null;
        currNode = head;
        for(int iCount = 1; iCount < iPosition; iCount++){
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }
    //return the variable iSize that we will use to keep track of SLList size
    @Override
    public int size(){
        return iSize;
    }
    
    //return a boolean value if the isize is equal to 0
    @Override
    public boolean isEmpty(){
        return iSize==0;
    }    
    
    //adding an element to the end of the SLList
    @Override
    public void add(Object theElement){
        SLNode newNode = new SLNode((AreaDesc)theElement, null);
        if(head==null){
            head = newNode;
        }
        else{
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize ++;
    }
    
    @Override
    public void add(int iPosition, Object theElement){
        //if iPosition is 1 we add to the start of the list
        if(iPosition==1){
            SLNode newNode = new SLNode((AreaDesc) theElement,head );
            head = newNode;
        }
        //we get the currnode w/ set current and then point the new node to it and the prev node to the new node
        else{
            setCurrent(iPosition);
            SLNode newNode = new SLNode((AreaDesc) theElement, currNode);
            prevNode.setNext(newNode);
        }
        //increasing size
        iSize++;
    }
    @Override
    public AreaDesc get(int iPosition){
        setCurrent(iPosition);
        return currNode.getAreaDesc();
    }
    
    @Override    
    public void remove(int iPosition){
        //if iPosition is 1 we remove the first from list
        if(iPosition==1){
            head = head.getNext();
        }
        //otherwise we get the currnode with setcurrent and modify the prevnodes link
        else{
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        //remove one from the size tally of list
        iSize --;
    }
    
    //print list method using a while loop that ends when a temp node equals null
    @Override
    public String printList(){
        String sPrintList = "";
        SLNode tempNode = head;
        while(tempNode!=null){
            sPrintList += "\nArea Name: " + tempNode.getAreaDesc().getAreaName() + "\nPopulation: " + tempNode.getAreaDesc().getPopulation() + "\nArea's current bike racks: " + tempNode.getAreaDesc().getCurrentBikeRacks()
                     + "\n ****************";
            tempNode = tempNode.getNext();
        }
        return sPrintList;
    }
    
}
