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
public class Fish {
    
    public String end = "bone";
    
    public void action(){
        System.out.println("s");
                
    }
    
}

class Shark extends Fish{
    
    public void action(){
        System.out.println("c");
    }
    
    public String end = "c";
}

class demo{
    public static void main(String args[]){
        Fish bob = new Shark();
        System.out.println(bob.end);
        bob.action();
    }    
}