/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imac.project;

/**
 *
 * @author maruiling
 */
public class RandomTest {
    
    public static void main(String args[]){
        
        int a = 0; 
        int b = 0;
        
        for(int i = 0; i < 200; i++){
            if(Math.random() * 2 < 1)
                a++;
            else
                b++;
        }
        
        System.out.println(a + " " + b);
    }
    
}
