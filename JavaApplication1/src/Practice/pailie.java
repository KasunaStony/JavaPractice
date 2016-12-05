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
public class pailie {
    
    public static void main(String arg[]){
        
        int A[] = new int[5];
        A[0] = 34;
        A[1] = 56;
        A[2] = -87;
        A[3] = 67;
        A[4] = 293;
        
        int t, p;
               
        
        for(int i = 0; i < 5 - 1; i++){
            
            p = i;
            
            for(int j = i + 1; j < 5 ; j++){
                
                if(A[p] < A[j]) p = j;
                    
                    t = A[i];
                    
                    A[i] = A[p];
                    
                    A[p] = t;
                    
                    
                    
                
            }
    }
        for(int a = 0; a < 5; a++){
            System.out.print(A[a] + " ");
        }
    
}
}
