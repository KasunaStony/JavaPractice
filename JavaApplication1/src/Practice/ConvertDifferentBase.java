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
public class ConvertDifferentBase {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("十进制转换到其它进制：");
        int x = 123 ;
        String str1 = Integer.toHexString(x) ;      ///10进制转换成16进制的字符串
        System.out.println(str1);
        String str2 = Integer.toOctalString(x) ;     ///10进制转换成8进制的字符串
        System.out.println(str2);
        String str3 = Integer.toBinaryString(x) ;    ///10进制转换成2进制的字符串
        System.out.println(str3);
        String str4 = Integer.toString(123456,20) ;  ///10进制转换成7进制的字符串
        System.out.println(str4);
        ///String str4 = Integer.toString(i,x) ;  ///10进制的数字i转换成x进制的字符串



        System.out.println("其它制转换到十进制：");
        int y1= Integer.valueOf("FFFF",16);     ///16进制转换成10进制
        System.out.println(y1);
        int y2=Integer.valueOf("776",8);        ///8进制转换成10进制
        System.out.println(y2);
        int y3=Integer.valueOf("0101",2);       //2进制转换成10进制
        System.out.println(y3);
        int y4=Integer.valueOf("101",7);        //7进制转换成10进制
        System.out.println(y4);

        ///Integer.valueOf("str",x); ///可以为任意进制的字符串str转换成x进制的10进制数

        System.out.println("其它的可能用到的函数：");
        //static int parseInt(String s, int radix) //使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
        int n = Integer.parseInt("776", 8) ; ///8进制转换成10进制
        System.out.println(n);
        ///Integer.valueOf()返回一个“integer对象”和Integer.parseInt()返回一个“int值”的区别在于，返回值不同
        ///基本常识，其他的非10进制的数的保存，基本都是以字符串的形式


        ///例子：7进制到8进制的转换
        String q = "6523" ; ///7进制的字符串
        String b = Integer.toString(Integer.valueOf(q,7),8) ;///这样7进制就变成8进制了
    }
    
}
