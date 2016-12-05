/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APCS;

/**
 *
 * @author maruiling
 */
public class InsertionSort {
    
    public static void IS(int[] a){
        
        int temp;
        
        for(int i = 1; i < a.length; i++){
            for(int j = i; j > 0; j--){
                if(a[j] < a[j - 1]){
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    public static void main(String arg[]){
        
        int[] a = {1, 4, 2, 100, 3, 6, 5 ,8, 7};
        
        IS(a);
        
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
