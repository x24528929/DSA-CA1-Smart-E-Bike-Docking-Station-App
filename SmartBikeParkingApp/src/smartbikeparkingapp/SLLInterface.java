/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */

//SLL interface
public interface SLLInterface {
    
    public int size();
    
    public boolean isEmpty();
    
    public void add(Object theElement);
    
    public void add(int iPosition, Object theElement);
    
    public void remove(int iPosition);
    
    public Object get(int iPosition);
    
    public String printList();
    
}
