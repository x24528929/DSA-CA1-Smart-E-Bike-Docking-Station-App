/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smartbikeparkingapp;

/**
 *
 * @author marti
 */

//stack interface
public interface StackInterface {
    
    public boolean isEmpty();
    
    public boolean isFull();
    
    public int size();
    
    public void push(Object theElement);
    
    public Object pop();
    
    public String printStack();
    
}
