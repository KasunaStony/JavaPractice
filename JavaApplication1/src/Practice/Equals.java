/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author maruiling
 */
public class Equals {
    public static void main(String[] args){
        Equals a = new Equals(){
                 public boolean haha(Object obj){
                return false;
                
            }
            
       
            
       };
        Equals c = a;
        boolean b = c.equals(c + "!");
        System.out.println(b);
    }
    
}
