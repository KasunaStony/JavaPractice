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
public class hiuwen {
    
    
    public static void main(String args[]){
        
        String str = "ajfi";
        
        boolean c = true;
        
        for(int i = 0; i < str.length()/2; i++){
            
           if(str.charAt(i) != str.charAt(str.length()-1-i)){
               
               c = false;
               
               
           }
        }
        if(c){
            System.out.println("la");
        }
        
    }

}