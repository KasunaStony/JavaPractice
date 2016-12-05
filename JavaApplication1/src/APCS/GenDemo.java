/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APCS;

/**
 *
 * @author maruiling
 */
class Gen<T>{
    
    T ob;
    
    Gen(T o){
        ob = o;
    }
    
    
}
public class GenDemo {
    
    public static void main(String args[]){
        
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<Double> dOb = new Gen<Double>(88.0);
        
        
    }
    
}
