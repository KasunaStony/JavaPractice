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

class Sentence{
    
    private String sentence;
    private int numWords;
    
    public Sentence(String str){
        
        sentence = str;
        
        numWords = 1;
        int k = str.indexOf(" ");
        while(k != -1){
            
            numWords++;
            str = str.substring(k + 1);
            k = str.indexOf(" ");
        }
    }
    
}
public class SentenceDemo {
    
}
