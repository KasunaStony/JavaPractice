/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imac.project;

/**
 *
 * @author maruiling
 */
public class ClassAndObjects {
    
    public static void main(String args[]){
        Students s = new Students(887);
        System.out.println(s.getNumber());
    }
    
}

class Students{
    
    private int number;

    public Students(int n) {
        this.number = n;
    }
    
    int getNumber(){
        return this.number;
    }
    
}
