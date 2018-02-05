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
import java.util.StringTokenizer;

public class buf {
    
      public static void main(String[] args) throws IOException  
    {  
        BufferedReader buf = new BufferedReader (new InputStreamReader(System.in));  
        BufferedWriter buff = new BufferedWriter(new FileWriter("abc.txt"));  
        StringTokenizer st = new StringTokenizer(buf.readLine());
        
        String str = st.nextToken();  
        
        while(!str.equals("exit"))  
        {  
            buff.write(str);  
            buff.newLine();  
            System.out.print(str);
            str = st.nextToken();  
        }  
        buf.close();  
        buff.close();  
    }  
    
}
