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
import java.util.*;

/**
 *
 * @author maruiling
 */
public class no2 {
    
     public static void main(String args[])throws IOException{
      
         
        BufferedReader reader = new BufferedReader(new FileReader("DATA21.txt"));
        for(int r = 0; r < 6; r++){
            
        StringTokenizer st = new StringTokenizer(reader.readLine());
       
        int N = Integer.parseInt(st.nextToken());
        
        int a[] = new int[N];
        StringTokenizer p = new StringTokenizer(reader.readLine());
        for(int i = 0; i < N; i++){
            
            a[i] = Integer.parseInt(p.nextToken());
            //System.out.print(a[i]);
        }
        
        int b[] = new int[5];
        StringTokenizer s = new StringTokenizer(reader.readLine());
        for(int i = 0; i < 5; i++){
            
            b[i] = Integer.parseInt(s.nextToken());
            
            
        }
        
       
        reader.mark(10000000);
        int e = 0;
        boolean c = false;
        wai: for(int i = 0; i < 5; i++){
            c = false;
            for(int j = 0; j < N; j++){
                
                for(int f = 0; f < N; f++){
                                       
                    for(int o = 0; o < N; o++){
                        if(b[i] == (a[j]+a[f]+a[o]))c = true;
                        else if(b[i] == ((a[j]+a[f])*a[o]))c = true;
                        else if(b[i] == (a[j]*a[f]+a[o]))c = true;
                        else if(b[i] == (a[j]*a[f]*a[o]))c = true;
                        e++;
                }
            }
        }if(c)System.out.print("T");
        else System.out.print("F");
       
     } System.out.print(e);
        System.out.println();
    //
}
}
}