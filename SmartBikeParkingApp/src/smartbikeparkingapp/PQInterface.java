/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */

//pq interface
public interface PQInterface {
    
    public void enqueue(int iPriorityKey, Object theElement);
    
    public Object dequeue();
    
    public int size();
    
    public boolean isEmpty();
    
    public String printPQueue();
    
}
