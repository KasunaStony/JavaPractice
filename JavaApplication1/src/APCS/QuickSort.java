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
public class QuickSort {
    
  private static void QuickSort(int[] array, int[] follow, int start,int end)
    {
        if(start<end)
        {
            int key=array[start];//初始化保存基元
            int fk=follow[start];
            int i=start,j;//初始化i,j
            for(j=start+1;j<=end;j++)
            {
                if(array[j]<key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环
                {
                    System.out.println(array[j] + " " + array[i+1] + "   " + follow[j] + " " + follow[i+1]);
                    int temp=array[j], temp1 = follow[j];
                    array[j]=array[i+1];
                    follow[j] = follow[i+1];
                    array[i+1]=temp;
                    follow[i+1] = temp1;
                    System.out.println(array[j] + " " + array[i+1] + "   " + follow[j] + " " + follow[i+1] + "\n");
                    i++;
                }
                
            }
            array[start]=array[i];//交换i处元素和基元
            follow[start] = follow[i];
            array[i]=key;
            follow[i]=fk;
            QuickSort(array, follow, start, i-1);//递归调用
            QuickSort(array, follow, i+1, end);
            
        }
        
    }
  public static void main(String args[]){
      
      int a[] = new int[]{2, 5, 3, 8, 7, 12, 1, 32, 9};
      int b[] = new int[]{4, 3, 8, 1, 0, 32, 2, 90, 0};
      QuickSort(a, b, 0, a.length - 1);
      for(int i = 0; i < a.length; i++){
          System.out.print(a[i]+ " ");
      }
      System.out.println();
      for(int i = 0; i < a.length; i++){
          System.out.print(b[i]+ " ");
      }
  }
 
}
