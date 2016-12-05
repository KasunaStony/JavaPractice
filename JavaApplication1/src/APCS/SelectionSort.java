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
public class SelectionSort {
    
    public static void selectSort(int[]a)
{
    int minIndex=0;
    int temp=0;
    if((a==null)||(a.length==0))
        return;
    for(int i=0;i<a.length;i++)
    {
        minIndex=i;//无序区的最小数据数组下标
        for(int j=i+1;j < a.length;j++)
        {
            //在无序区中找到最小数据并保存其数组下标
            if(a[j]<a[minIndex])
            {
                minIndex=j;
            }
        }
        if(minIndex!=i)
        {
            //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
            temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
}

    
    public static void main(String arg[]){
        
       int a[] = {8, 1, 4, 6};
       selectSort(a); 
       
       for(int i = 0; i < a.length; i++)System.out.print(a[i] + " ");
    }
    
}
