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
public class erweishuzu {
    
    public static void main(String arg[]){
        
        int t, j;
        
        int table[][] = new int[6][6];
        
        for(t = 0; t < 6; ++t){
            for(j = 0; j <= t; ++j){
                
                if(t == j || j == 0)table[t][j] = 1;
                
                else table[t][j] = table[t - 1][j] + table[t -1][j - 1];
                
                System.out.printf("%-4d",table[t][j]);
            }System.out.println();
        }
        
        
    }
    
}
