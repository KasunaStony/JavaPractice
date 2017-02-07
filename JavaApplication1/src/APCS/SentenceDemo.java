/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APCS;

import java.util.*;
/**
 *
 * @author maruiling
 */

class Sentence{
    
    String sentence;
    
    
   
    public List<Integer> getBlankPositions(){
        
        List<Integer> Blank = new ArrayList<Integer>();
        
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' ')
                Blank.add(i);
        }
        
        return Blank;
    }
    
    public int countWords(){
        return getBlankPositions().size() + 1;
    }
    
    public String[] getWords(){
        
        
        String[] str = new String[countWords()];
        
        str[0] = sentence.substring(0, getBlankPositions().get(0));
        
        for(int i = 1; i < countWords() - 1; i++){
            str[i] = sentence.substring(getBlankPositions().get(i - 1) + 1, getBlankPositions().get(i));
        }
        
        str[countWords() - 1] = sentence.substring(getBlankPositions().get(countWords() - 2) + 1);
        
        return str;
        
    }
    
    
}
public class SentenceDemo {
    
    public static void main(String args[]){
        
        Sentence s = new Sentence();
        s.sentence = "Hi";
        
        List<Integer> in = s.getBlankPositions();
        String[] t = s.getWords();
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + ",");
        }
        
    }
}
