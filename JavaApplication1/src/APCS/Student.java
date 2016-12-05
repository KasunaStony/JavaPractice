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
public class Student {
    
    public final static int NUM_TESTS = 3;
    private String name;
    private int[] tests;
    private String grade;
    
    
    public Student(){
        
        name = "";
        tests = new int[NUM_TESTS];
        grade = "";
        
    }
    
    public Student(String studName, int[] studTests, String studGrade){
        name = studName;
        tests = studTests;
        grade = studGrade;
                
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getGrade(){
        return grade;
    }
    
    public void setGrade(String newGrade){
        grade = newGrade;
    }
    
    public void computeGrade(){
        if(name.equals(""))
            grade = "No Grade";
        
        else if(getTestAverage() >= 65)
            grade = "pass";
        
        else
            grade = "Fail";
    }
    
    public double getTestAverage(){
        double total = 0;
        for(int score : tests)
            total += score;
        return total/NUM_TESTS;
                
    }
    
    public void method(int c){
        System.out.print(c);
    }
}
