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
public class no10 {
    
    public static void main(String arg[])
            throws java.io.IOException{
        
        char ch;
        int letters = 0;
        
        do{
            ch = (char)System.in.read();
            
            if(ch >= 'a' && ch <= 'z'){
                
                ch = (char)(ch - 32);
                letters++;
                System.out.print(ch);
               
            }
            else if(ch >= 'A' && ch <= 'Z'){
                
                ch = (char)(ch + 32);
                letters++;
                System.out.print(ch);
                
            }
        }while(ch != '.');
        System.out.println(letters);
    }
    
}
