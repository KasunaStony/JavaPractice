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
public class math {
    
    public static void main(String args[]){
        
        int sum = 0;
        
        for(int i = 0; i * 7 <= 300; i++){
            sum += i * 7;
        }
        
        System.out.println(sum);
    }
    
}
