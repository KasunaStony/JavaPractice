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
public class Main {
     public static void main(String[] args) {
        Main a = new Main() {
            
            public boolean equals(Object obj) {
                return true;
            }
        };

        Main b = a;

        Main c = new Main() {
           
            public boolean equals(Object obj) {
               return false;
            }
        };

        boolean b1 = a == b;
        boolean b2 = b.equals(b + "!");
        boolean b3 = !c.equals(a);
        
        System.out.println(b1);
        
        

 //       if (b1 && b2 && b3) {
 //           System.out.println("Success!");
  //      }
    }
    
}
