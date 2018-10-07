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
import java.util.*;
import java.io.*;
public class Decimal {
    
    int x;
    
    public static void arc(int[] c){
        c[0] = 6;
    }
    
    public static void main(String args[]) throws IOException{
        
        Decimal d = new Decimal();
        double a = 0.4;
        double b = 0.1 + 0.1 + 0.1 + 0.1;
        double c = 0.1;
        
        System.out.println(b == a);
        
        String s1 = "6663";
        String s2 = "777";
        
        //System.out.println(s1.charAt(s1.length()));
        
        ArrayList<String> al = new ArrayList();
        
        
        String[] ar = new String[9];
        System.out.println(ar[1]);
        
        File f = new File("file.txt");
        
        int[] w = new int[7];
        
        arc(w);
        
        char e = (char)90;
        
        System.out.println(e);
        
        
    }
    
}
