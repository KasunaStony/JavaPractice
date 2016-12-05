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
public class UnderGrad extends Student{
    
    public UnderGrad(){
        super();
    }
    
    public UnderGrad(String studName, int[] studTests, String studGrade){
        super(studName, studTests, studGrade);
    }
    
    public void computeGrade(){
        
        if(getTestAverage() >= 70)
            setGrade("Pass");
        
        else
            setGrade("Fail");
    }
    
    public void method(int c){
        System.out.print(c);
    }
    
    public static void main(String args[]){
        Student one = new UnderGrad("peter", new int[]{70, 69, 70}, "none");
        one.computeGrade();
        String grade = one.getGrade();
        
        System.out.print(grade);
    }
}
