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
class equal{
    
    int I;
    int R;
    String S;
    equal(int i, int r, String s){
        
        I = i;
        R = r;
        S = s;
        
    }
    
    public boolean equals(Object obj){
        
        return S.equals(((equal)obj).S);
    }
}
public class equals {
    
    public static void main(String args[]){
        
        equal ob1 = new equal(3,4,"h");
        equal ob2 = new equal(3,4,"h");
        
        if(ob1.equals(ob2))System.out.print("haha");
        
    }
    
}
