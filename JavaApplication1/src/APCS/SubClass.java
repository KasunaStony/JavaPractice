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
public class SubClass extends SuperClass{
    
    public int a = 1;
    public int b = 2;
    public static void main(String args[]){
        
        SubClass s = new SubClass();
        SuperClass c = new SubClass();
        
        System.out.println(s.a);
        System.out.println(c.a);
                
    }
    
    
    
}
