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
public class BinarySearch {
    
    public static int BS(int key, int[] a, int lo, int hi){
        
        if(lo > hi) return -1;
        int mid = (hi - lo)/2;
               
        if(a[mid] > key) return BS(key, a, mid + 1, hi);
        else if (a[mid] < key) return BS(key, a, lo, mid - 1);
        else return mid;
    }
    
}
