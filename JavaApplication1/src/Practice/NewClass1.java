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
public class NewClass1 {
    
    public static void main(String arg[]){
        
        for(double x = -1;x <= 1 ; x += 0.01){
     
  double t = Math.pow(x, 2);
  
  double c = Math.pow(t, 1/3);
  
  double d = Math.pow(Math.pow(t, 2), 1/3);
  
  double r = Math.pow((d - 4*t + 4), 1/2);
  
  double y = (c + r)/2;
  
  double z = ((Math.pow(Math.pow(x, 2), 1/3))+((Math.pow(Math.pow(x, 4), 1/3))-4*Math.pow(x, 2) + 4))/2;
  
  double h = (c - r)/2;
  
  System.out.print(z + " ");
    }
    }
}
