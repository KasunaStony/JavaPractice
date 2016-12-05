/*
ID: KasunaStony
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.*;

public class ride {
    




  public static void main (String [] args) throws IOException {
    
    
    Reader reader = null;
    Writer writer = null;
    
    reader = new InputStreamReader(new FileInputStream("ride.in"));
    writer = new OutputStreamWriter(new FileOutputStream("ride.out"));
    
   
    int tempchar, s1 = 1, s2 = 1;
    while((tempchar = reader.read()) != '\n'){
        
       
       s1 = s1 * (tempchar -64);
        
    }
    s1 = s1 % 47;
    
    
    while((tempchar = reader.read()) != '\n'){
       
        s2 = s2 * (tempchar - 64);
        
    }
    s2 = s2 % 47;
    
    if(s1 == s2){
        
        writer.write("GO" + '\n');
        
    }
    else{
        
        writer.write("STAY" + '\n');
    }
    
       
	reader.close();
        writer.close();
       
                                      
  }
}
