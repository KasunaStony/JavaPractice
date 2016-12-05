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
public class StringPaixu {
    
    
    public static void main(String args[])
            
            throws java.io.IOException{
        
        String string[] = new String[5];
        
        string[0] = "how";
        string[1] = "so";
        string[2] = "you";
        string[3] = "did";
        string[4] = "that";
        
        
        int i, p;
        String t;
        
        for(i = 0; i < 5 - 1; i++){
            
            p = i;
            
            for(int a = i + 1; a < 5; a++){
                
                if(string[p].compareTo(string[a]) < 0)p = a;
                
                t = string[i];
                
                string[i] = string[p];
                
                string[p] = t;
            }
            
            
        }
        for(int b = 0; b < 5;b++){
            
            System.out.println(string[b]);
        }
            
    }     
    
}
