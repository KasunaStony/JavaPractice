/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maruiling
 */
import java.util.*;


class Note{
    
    String dot;
    boolean empty = false;
    boolean camera = false;
    boolean con = false;
    int ways = -1;
    
    public Note(String d){
        dot = d;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        Note arr[][] = new Note[n][m];
        
        int xs = -1;
        int ys = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = new Note(input.next());
                if(arr[i][j].dot.equals("S")){
                    xs = i;
                    ys = j;
                }
                else if(arr[i][j].dot.equals(".")){
                    arr[i][j].empty = true;
                }
                else if(arr[i][j].dot.equals("C")){
                    arr[i][j].camera = true;
                }
                else if(arr[i][j].dot.equals("U") || arr[i][j].dot.equals("D") ||arr[i][j].dot.equals("L") ||arr[i][j].dot.equals("R")){
                    arr[i][j].con = true;
                }
            }
        }
        
        int x = xs;
        int y = ys;
        
        
        
        
        
        
        
        
                
        
           
        
    }
    
}
