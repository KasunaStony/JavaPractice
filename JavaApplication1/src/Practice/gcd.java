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
public class gcd {
    
    public static int gcd(int a, int b){
        
        int temp, t;
        
        if(a < b){
            t = a;
            a = b;
            b = t;
        }
        
        while(a % b != 0){
            temp = a;
            a = b;
            b = temp % b;
        }
        
        return b;
    }
    
    public static void main(String args[]){
        
       System.out.println (gcd(1, 5));
    }
    
}
