/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maruiling
 */
public class LT {
       
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("DATA31.txt"));
        int maxIndex ;
        for(int i = 0; i < 10; i++){
            
            StringTokenizer str = new StringTokenizer(reader.readLine());
            
            int N = Integer.parseInt(str.nextToken());           
            int M = Integer.parseInt(str.nextToken());
            int K = Integer.parseInt(str.nextToken());
            
            int rate[] = new int[N];
            StringTokenizer sr = new StringTokenizer(reader.readLine());
            for(int c = 0; c < N; c++){
                
                
                rate[c] = Integer.parseInt(sr.nextToken());
                
            }
            
            for(int h = 1; h < K; h++){
                maxIndex=0;
                for(int u = 0; u < N; u++){
                    if(rate[u]>rate[maxIndex]){
                        maxIndex=u;
                    }
                    
                    
                    
                    
                }
                rate[maxIndex] -= M;
               // System.out.print(maxIndex+" ");  
            }
            
            maxIndex=0;
                for(int u = 1; u < N; u++){
                    if(rate[u] > rate[maxIndex]){
                        maxIndex=u;
                    }
                }
                maxIndex=maxIndex+1;
                //System.out.println("");
                System.out.println(maxIndex+"");
        }
        
    }
}
