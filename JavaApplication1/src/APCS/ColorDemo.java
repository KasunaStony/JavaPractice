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
class ColorGrid {
    
    String[][] pixels;
    private int rows;
    private int cols;
    
    public ColorGrid(String s, int numRows, int numCols){
        int c = 0;
        rows = numRows;
        cols = numCols;
        pixels = new String[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                pixels[i][j] = s.substring(c, c + 1);
                c++;
            }
        }
        
    }
    
    public void paintRegion(int row, int col, String newColor, String oldColor){
        
       
        
        if(0 <= row && row < rows && 0 <= col && col < cols){
            
            if(pixels[row][col].equals(oldColor) && !pixels[row][col].equals(newColor)){
                
                pixels[row][col] = newColor;
                paintRegion(row + 1, col, newColor, oldColor);
                paintRegion(row, col + 1, newColor, oldColor);
                paintRegion(row - 1, col, newColor, oldColor);
                paintRegion(row, col - 1, newColor, oldColor);
            }
            
        }
    }
        
    
    
   
    
}


public class ColorDemo{
    
    public static void main(String arg[]){
        
        ColorGrid f = new ColorGrid("brrygrggyyyr", 3, 4);
        
        f.paintRegion(1, 2, "y", "g");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(f.pixels[i][j] + " ");
            }System.out.println();
        }
    }
    
}