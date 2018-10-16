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
import java.util.*;

public class ArrayListTest {
    
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        

        
        ArrayList<Integer> S = new ArrayList<Integer>();
        ArrayList<Integer> A = new ArrayList<Integer>();
        
        for(int i = 0; i < scores.length; i++){
            S.add(scores[i]);
        }
        
        for(int i = 0; i < alice.length; i++){
            A.add(alice[i]);
        }

        
        S.addAll(A);
        Collections.sort(S);
        Collections.reverse(S);
        Collections.reverse(A);
        
         ArrayList<ArrayList<Integer> > aList =  
                  new ArrayList<ArrayList<Integer>>(); 
         
        
        for(int i = 0; i < S.size(); i++){
            System.out.print(S.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < A.size(); i++){
            System.out.print(A.get(i) + " ");
        }
        
        System.out.println();
        
        ArrayList<Integer> AS = new ArrayList<Integer>();
        int[] answer = new int[alice.length];
        
        int count = 1;
        
        for(int i = 0; i < S.size(); i++){
            System.out.println("C");
            for(int j = 0; j < alice.length; j++){
                if(S.get(0) == A.get(0)){
                    AS.add(count);
                    A.remove(j);
                    break;
                }  
            }
            if(i != S.size() - 1 && S.get(i) != S.get(i + 1)){
                    count++;
                    System.out.println("F");
                }
            S.remove(0);
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = AS.get(i);
        }
        return answer;

    }

    
    public static void main(String args[]){
        
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
        int[] alice = new int[]{5, 25, 50, 120};
        
        int[] a = climbingLeaderboard(scores, alice);
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
