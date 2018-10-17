/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USACOPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 *
 * @author maruiling
 */
public class milk2 {
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("milk2.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("milk2.out"));
        
        int n = Integer.parseInt( reader.readLine() );
        
        int[][] data = new int[n][2];
        
        StringTokenizer st;
        
        for(int i = 0; i < n; i++){
            
            st = new StringTokenizer(reader.readLine());
            
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
            
        }
        
        for(int i = 0; i < n; i++){
            
            System.out.println(data[i][0] + " " + data[i][1]);
            
        }
        
        Arrays.sort(data, (a, b) -> Integer.compare(a[0], b[0]));
        
        int head = data[0][0];
        int tail = data[0][1];
        
        int longest = 0;
        
        for(int i = 1; i < n; i++){
            
            if(!(tail > data[i][0] && tail > data[i][1])){
                if((tail - head) > longest){
                    longest = tail - head;
                }
            }
        }
        
        System.out.println(longest);
        
        
        
    }
    
    
    
}
