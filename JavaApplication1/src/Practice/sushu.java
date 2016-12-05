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
public class sushu {
    
    public static void main(String arg[]){
    
    int i , j;
    boolean c;
    
    for(i = 2; i <= 100; i++){
        
        c = true;
        
        for(j = 2; j < i; j++){
            
            if(i % j == 0) c = false;
        }
        if(c)System.out.println(i);
    
    
}
    
}
}
