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
/*
For Loops: used to repeatedly run a block of code
For Each Loops: a concise version of a for loop
ArrayList: stores a list of data
HashMap: stores keys and associated values like a dictionary
*/
import java.util.ArrayList;
public class mark {
    public static void main(String[] args){
        
        
        ArrayList<Integer> studentMark = new ArrayList<Integer>();
        studentMark.add(98);
        studentMark.add(67);
        studentMark.add(87);
        studentMark.add(90);
        studentMark.add(2,89);
        
        
//        for(int m = 0; m < studentMark.size(); m++){
//            System.out.println(studentMark.get(m));
//        }
        for(Integer Mark : studentMark){
            System.out.println(Mark);
        }
       
        
    }
    
}
