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
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int k = s.nextInt();
        
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt() % k;
        }
        
        int count[] = new int[k];
        for(int i = 1; i < k; i++){
            for(int j = 0; j < n; j++){
               if(a[j] == i)count[i]++;              
            }
        }
        int an = 0;
        int i = 1;
        while(i <= k-i){
            if (i == k - i){
                an++;
                break;
            }
            if(count[i] > count[k-i])
                an += count[i];
            else
                an += count[k-i];
        }
        System.out.print(an);
    }
}
