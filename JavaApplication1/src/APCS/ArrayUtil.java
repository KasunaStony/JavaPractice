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
public class ArrayUtil {
    
    public static void reverseArray(int[] arr){
        
    int temp;
    int length = arr.length;
    
    for(int i = 0; i < length / 2; i++){
        
        temp = arr[i];
        arr[i] = arr[length - i - 1];
        arr[length - i - 1] = temp;
    
    }
    
    }
    
    public static void main(String args[]){
    
    int[][] test = 
    {{2, 3, 4, 5, 6, 7},
     {3, 4, 1, 6, 0, 4},
     {3, 5, 2, 6, 7, 1}
    };
   // reverseArray(test);
    Matrix ma = new Matrix(test);
    ma.reverseMatrix();
    for(int i = 0; i < test.length; i++){
        for(int j = 0; j < test[i].length; j++){
        System.out.print(test[i][j] + " ");
        }System.out.println();
    }
    
    }
    
}


class Matrix{
    
    private int[][] mat;
    
    public Matrix(int[][] m){
        mat = m;
    }
    
    public void reverseAllRows(){
    
        for(int i = 0; i < mat.length; i++){
            ArrayUtil.reverseArray(mat[i]);
        }
    }
    
    public void reverseMatrix(){
        
        int[] temp;
        reverseAllRows();
        
        for(int i = 0; i < mat.length/2; i++){
            temp = mat[i];
            mat[i] = mat[(mat.length - i - 1)];
            mat[(mat.length - i - 1)] = temp;
        }
    }
}