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
import java.util.*;
import java.io.*;
public class ReaderTest {
    
    public static void main(String args[]) throws IOException{
        
        FileReader fr = new FileReader("testdata.txt");
        
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        
     //   StringTokenizer st = new StringTokenizer(br.readLine());
       // if(sc.hasNextLine())
          //  System.out.println("hhhhhh");
        StringTokenizer str = new StringTokenizer(sc.nextLine());
        
        for(int i = 0; i < 2; i++){
            
            System.out.print(str.nextToken());
            
        }
        
    }
    
}
