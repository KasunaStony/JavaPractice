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



public class trycatch {
    
    
    public static char prompt(String str){
        
     try{
         
        System.out.print(str);
        
        
        
        return (char)System.in.read();
        
        
    } catch(java.io.IOException exc){
            
            System.out.println("occurred");
            
            
        }
     return 'c';
    }
    public static void main(String arg[]){
        
        char ch;
        
        
        ch = prompt("enter a letter ");
        
        
       
        System.out.println("pressed " + ch);
                
  /*      int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        
        for (int i = 0; i < nums.length; i++){
            
            try{
                
                System.out.println(nums[i]/denom[i]);
                throw new ArithmeticException();
            }catch(ArithmeticException exc){
                System.out.println("can't divide by zero");
            }catch(Throwable exc){
                System.out.println("No matching element found");
            }
        }*/
    }
    
}
