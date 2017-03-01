/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maruiling
 */
import java.util.*;

public class Main {
    
    
    
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        int d = s.nextInt();
        
        int an = d/720 * 31;
        int hour = 0;
        int min = 0;
        
        if(d % 720 != 0){
            hour = d % 720 / 60;
            min = d % 720 % 60;
        }
        
        if(hour == 0){
            an += 0;
            if(min >= 34 && min < 60)
                an+=1;
        }
        else if(hour == 1){
            an+=1;
            if(min >= 11 && min < 23)
                an++;
            else if(min >= 23 && min < 35)
                an+=2;
            else if(min >= 35 && min < 47)
                an+=3;
            else if(min >= 47 && min < 59)
                an+=4;
            else if(min >= 59 && min < 60)
                an+=5;
        }
        else if(hour == 2){
            an+=6;
            if(min >= 10 && min < 22)
                an++;
            else if(min >= 22 && min < 34)
                an+=2;
            else if(min >= 34 && min < 46)
                an+=3;
            else if(min >= 46 && min < 58)
                an+=4;
            else if(min >= 58 && min < 60)
                an+=5;
        
        }
        else if(hour == 3){
            an+=11;
            if(min >= 21 && min < 33)
                an++;
            else if(min >= 33 && min < 45)
                an+=2;
            else if(min >= 45 && min < 57)
                an+=3;
            else if(min >= 57 && min < 60)
                an+=4;
       
        
        }
        else if(hour == 4){
            an+=15;
            if(min >= 20 && min < 32)
                an++;
            else if(min >= 32 && min < 44)
                an+=2;
            else if(min >= 44 && min < 56)
                an+=3;
            else if(min >= 56 && min < 60)
                an+=4;
       
        
        }
        else if(hour == 5){
            an+=19;
            if(min >= 31 && min < 43)
                an++;
            else if(min >= 43 && min < 55)
                an+=2;
            else if(min >= 55 && min < 60)
                an+=3;
           
       
        
        }
        else if(hour == 6){
            an+=22;
            if(min >= 30 && min < 42)
                an++;
            else if(min >= 42 && min < 54)
                an+=2;
            else if(min >= 54 && min < 60)
                an+=3;
           
       
        
        }
        else if(hour == 7){
            an+=25;
            if(min >= 41 && min < 53)
                an++;
            else if(min >= 53 && min < 60)
                an+=2;
          
       
        
        }
         else if(hour == 8){
            an+=27;
            if(min >= 40 && min < 52)
                an++;
            else if(min >= 52 && min < 60)
                an+=2;
          
       
        
        }
        else if(hour == 9){
            an+=29;
            if(min >= 51 && min < 60)
                an++;          
          
       
        
        }else if(hour == 11){
            an+=30;
            if(min >= 11 && min < 60)
                an++;                  
        }
        
       System.out.println(an);    
    }
    
}
