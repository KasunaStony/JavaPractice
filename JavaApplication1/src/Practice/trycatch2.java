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

import java.io.*;
public class trycatch2 {
    
    public static void main(String args[]){
    boolean i = true;
    try(DataOutputStream dataout = new DataOutputStream(new FileOutputStream("testdata"))){
        
        
        dataout.writeBoolean(i);
        
    }catch(IOException exc){
        System.out.println();
        return;
    }
     
    
    try(FileInputStream fin = new FileInputStream("testdata")){
        int c;
        do{
            
            c = fin.read();
            
            if(c != -1)System.out.println(c);
        }while(c != -1);
        
        
    }catch(IOException exc){
        
    }
    }      
    
}
