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


class Stack{
    
    int stck[] = new int[10];
    int tos;
    
    
    Stack(){
        tos = -1;
        
    }
    
    void push(int item){
        if(tos == 9)
            System.out.println("full");
        else 
            stck[++tos] = item;
    }
    
    int pop(){
        
        if(tos < 0){
            System.out.println("underflow");
            return 0;
        }
        else 
            return stck[tos--];
            
    }
}
public class TestStack {
    
    public static void main(String args[]){
    
    Stack s1 = new Stack();
    Stack s2 = new Stack();
    
    for(int i = 0; i < 10; i++){
        s1.push(i);
       // System.out.println(s1.pop());
    }
    for(int i = 10; i < 20; i++){
        s2.push(i);
       // System.out.println(s2.pop());
    }
    for(int i = 0; i < 10; i++){
         System.out.println(s1.pop());
    }
    for(int i = 0; i < 10; i++){
        System.out.println(s2.pop());
    }
    }
}
