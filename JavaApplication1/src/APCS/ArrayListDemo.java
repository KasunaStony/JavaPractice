/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APCS;

/**
 *
 * @author maruiling
 */
import java.io.IOException;
import java.util.*;
class arrayList{
    
    public static List<Integer> getRandomIntList() throws IOException{
        
        List<Integer> list = new ArrayList<Integer>();
        int length = System.in.read();//read()方法读入的是一个char, 不是数字!!!!!
      //  System.out.print(length);
        for(int i = 0; i < length; i++){
          //  System.out.print("mewo");
            int newNum = (int) (Math.random() * 101);
            list.add(new Integer(newNum));
        }
        
        return list;
    
    }
}
public class ArrayListDemo {
    
    public static void main(String args[]) throws IOException{
        
        List<Integer> array = arrayList.getRandomIntList();
        
        for(int i = 0; i < array.size(); i++){
          //  System.out.println(array.indexOf(i));
        }
        
        int test[][] = new int[10][9];
        System.out.print(test[4].length);
    }
    
}
