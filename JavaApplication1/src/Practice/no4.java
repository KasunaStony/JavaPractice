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
public class no4 {
    
   int a ;
   no4(int i){
    
    a = i;
}
   
   
   

    
    static void swap(no4 ob, no4 ob2){
       
       no4 ob3 = ob;
       ob = ob2;
       ob2 = ob3;
       
       
}
   public static void main(String args[]){

    
       
       no4 no43 = new no4(3);
       no4 no42 = new no4(2);
       
       swap(no43, no42);
       
       
       System.out.println(no43.a);
       
       
   }
       
}    
   
    

