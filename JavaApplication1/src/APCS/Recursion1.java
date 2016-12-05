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
public class Recursion1 {
    
    static int Recursion1(int n){
        
        if(n == 0)
            return n;
        else
            return n + Recursion1(n-1);
        
        
    }
    
    static void Recursion2(int i){
        
        System.out.print(i + " ");
        
        if(i == 1)
            System.out.println();
        else
            Recursion2(i - 1);
    }
    
    public static void main(String args[]){
        
        
        
        Recursion2(3);
        
    }
    
}
