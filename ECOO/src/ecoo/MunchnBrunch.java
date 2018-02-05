/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoo;

/**
 *
 * @author maruiling
 */

import java.io.*;
import java.util.*;
public class MunchnBrunch {
    
    public static void main(String args[]) throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("DATA11.txt"));
        
        for(int i = 0; i < 10; i++){
        int cost = Integer.parseInt(reader.readLine());
        StringTokenizer s = new StringTokenizer(reader.readLine());
        
        double Y1 = Double.parseDouble(s.nextToken());
        double Y2 = Double.parseDouble(s.nextToken());
        double Y3 = Double.parseDouble(s.nextToken());
        double Y4 = Double.parseDouble(s.nextToken());
        
        int N = Integer.parseInt(reader.readLine());
        
        int N1=(int)(Y1*N);
        int N2=(int)(Y2*N);
        int N3=(int)(Y3*N);
        int N4=(int)(Y4*N);
        
        int add=N1+N2+N3+N4;
        int diff=N-add;
        if(add!=N){
            int max=Math.max(Math.max(N1, N2), Math.max(N3, N4));
            if(N1==max){
                N1=N1+diff;
            }
            else if(N2==max){
                N2=N2+diff;
            }
            else if(N3==max){
                N3=N3+diff;
            }
            else if(N4==max){
                N4=N4+diff;
            }
        }
        
       // System.out.println(N1);
       // System.out.println(N2);
       // System.out.println(N3);
       // System.out.println(N4);
        double money = (N1 * 12 + N2 * 10 + N3 * 7 + N4 * 5)/2.0;
       // System.out.println(money);
        if(money > cost)
            System.out.println("NO");
        else
            System.out.println("YES");
        
        
        }
    }
    
}
