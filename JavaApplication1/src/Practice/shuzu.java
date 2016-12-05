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
import java.util.Scanner;

public class shuzu{
        
        public static void main(String arg[]){
                
            Scanner in =new Scanner(System.in);
            int nums[] = new int[4];
            int min, max;
             min = max = nums[0] = in.nextInt();
            for(int i = 1; i < 4; i++){
                
                nums[i] = in.nextInt();
               
                
               
                
           
            
                
                if(min > nums[i])min = nums[i];
                if(max < nums[i])max = nums[i];
          
            
            
                
         
            }System.out.println("min is " + min + " max is "+ max);
            
            
         


    

}
}
