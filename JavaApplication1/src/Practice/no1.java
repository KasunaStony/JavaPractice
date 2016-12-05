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
public class no1{
    
    
    static int y;
    public static void main(String arg[])
            throws java.io.IOException{
        
        char ch;
        
        
        int i = 0;
        
        for( ; ; ){
            ch = (char)System.in.read();
            
            if(ch == 32)i++;
            if(ch == '.')break;
        }System.out.println(i);
    }
    
}
