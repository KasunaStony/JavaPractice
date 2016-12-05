/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APCS;

import java.io.IOException;

/**
 *
 * @author maruiling
 */
public class Recursion {
    
    public static void stackWords() throws IOException{
        
        String word;
        word = String.valueOf((char)System.in.read());
        
        if(word.equals("."))
            System.out.println();
        else
            stackWords();
        System.out.println(word);
    }
    
    public static void main(String args[]) throws IOException{
        
        stackWords();
    }
    
}
