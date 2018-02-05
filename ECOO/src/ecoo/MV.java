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
public class MV {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("DATA31.txt"));
        
        int front = 0;
            int middle = 0;
            int back = 0;
            int diff;
            int diffIndex;
            double line;
            
            int N = Integer.parseInt(reader.readLine());
            StringTokenizer str = new StringTokenizer(reader.readLine());

            int[] m = new int[N];
            for (int i = 0; i < N; i++) {

                m[i] = Integer.parseInt(str.nextToken());

            }
            
            front = m[0];
            back = m[N - 1];
            wai:
            for (int i = 0; i < N; i++) {
                middle = m[i];
                //cha qian
                if (i > 1) {
                    diff = middle - front;
                    diffIndex = i;
                    for (int j = i - 1; j > 0; j--) {
                        line = ((double)j * Math.abs(middle - front))/i + front;
                        System.out.println(line);
                        if (line <= m[j]) {
                            continue wai;
                        }
                    }
                }
                //cha hou
                diff = middle - back;
                diffIndex = N - i;
                for (int j = i + 1; j < N - 1; j++) {
                    line = ((double)j * Math.abs(middle - back))/i + front;
                    System.out.println(line);
                    if (line <= m[j]) {
                        continue wai;
                    }
                }
                System.out.println(i + 1);
                break wai;

            }
        
    }
    
}
