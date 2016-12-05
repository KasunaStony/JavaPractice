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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maruiling
 */
public class no1 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        double T = Integer.parseInt(st.nextToken());
        double A = Integer.parseInt(st.nextToken());
        double P = Integer.parseInt(st.nextToken());
        double Q = Integer.parseInt(st.nextToken());
        
        StringTokenizer y = new StringTokenizer(reader.readLine());
        int people = Integer.parseInt(y.nextToken());
        int t[] = new int[people];
        int a[] = new int[people];
        int p[] = new int[people];
        int q[] = new int[people];
        
        for(int i = 0; i < people; i++){
            StringTokenizer v = new StringTokenizer(reader.readLine());
            t[i] = Integer.parseInt(v.nextToken());
            a[i] = Integer.parseInt(v.nextToken());
            p[i] = Integer.parseInt(v.nextToken());
            q[i] = Integer.parseInt(v.nextToken());
        }
        
        double total[] = new double[people];
        
        for(int i = 0; i < people; i++){
            total[i] = t[i] * T + a[i] * A + p[i] * P + q[i] * Q;
            total[i] = total[i]/100;
            //System.out.println(total[i]);
        }
        int c = 0;
        for(int i = 0; i < people; i++){
            if(total[i] > 50)c++;
        }
        System.out.println(c);
    }
    
}
