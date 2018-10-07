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
import javax.script.*;
import java.util.*;

public class NewClass2 {

    public static int nextPrime(int n) {
        boolean isPrime = false;

        int start = 2;

        while (!isPrime) {
            n += 1;
            int m = (int) Math.ceil(Math.sqrt(n));

            isPrime = true;
            for (int i = start; i <= m; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return n;
    }

    public static void main(String args[]) throws ScriptException {

        double a, b, c, d, e, f, g;
        a = 3.14;
        b = a * 2;
        c = a + b;
        d = c / b + a;
        e = c - d * b + a;
        f = e + d / c - b * a;
        g = f * e - d + c * b + a;
        a = g * g;
        a = Math.floor(a);
        System.out.println(a);

        ArrayList<Character> array = new ArrayList();
        StringTokenizer st = new StringTokenizer("102,117,110,99,116,105,111,110,32,99,104,101,99,107,40,41,123,13,10,09,118,97,114,32,97,32,61,32,39,100,52,103,39,59,13,10,09,105,102,40,100,111,99,117,109,101,110,116,46,103,101,116,69,108,101,109,101,110,116,66,121,73,100,40,39,116,120,116,39,41,46,118,97,108,117,101,61,61,97,41,123,13,10,09,09,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,97,43,34,46,112,104,112,34,59,13,10,09,125,101,108,115,101,123,13,10,09,09,97,108,101,114,116,40,34,23494,30721,38169,35823,34,41,59,13,10,09,125,13,10,125", ",");
        while (st.hasMoreElements()) {
            array.add((char) Integer.parseInt(st.nextToken()));
        }
        String s = "";
        for (int i = 0; i < array.size(); i++) {
            s += array.get(i);
        }
        System.out.println(s);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object result = engine.eval(s);
        System.out.println(result.toString());
        
        
        int r = 0;
        System.out.println(nextPrime(r));
        for(int i = 2; i <= 10000; ){
            r += i;
            i = nextPrime(i);
        }
        
        System.out.println(r);
    }

}
