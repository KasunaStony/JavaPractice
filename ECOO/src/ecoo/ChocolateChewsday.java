/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoo;

/**
 *
 * @author maruiling
 */
import java.io.*;
import java.util.*;

public class ChocolateChewsday {

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("DATA21.txt"));

        hai:
        for (int i = 0; i < 10; i++) {

            //System.out.println("11");
            int N = Integer.parseInt(reader.readLine());
            List<people> list = new ArrayList<people>();
            int m1 = 0, m2 = 0, m3 = 0;
            String s;
            String y = "";
            s = reader.readLine();
            for (int c = 0; c < N; c++) {
                if (c != 0) {
                    s = y;
                }
                wai:
                for (;;) {
                    StringTokenizer str = new StringTokenizer(reader.readLine());
                    y = str.nextToken();
                    if (!y.equals("J")) {
                        break wai;
                    } else if (y.equals("*")) {
                        // i++;
                        continue hai;

                    }
                    //  System.out.print(str.nextToken());

                    m1 += Integer.parseInt(str.nextToken());
                    m2 += Integer.parseInt(str.nextToken());
                    m3 += Integer.parseInt(str.nextToken());

                }
                list.add(new people(s, m1, m2, m3));
                m1 = 0;
                m2 = 0;
                m3 = 0;
            }

          //  System.out.println(list.get(0).mark.length);
            //System.out.println(list.get(0).total + " " + list.get(1).total);

            
                
            for (int a = list.size() - 1; a >= 1; a--) {
                if (list.get(a).total > list.get(a - 1).total) {
                    list.remove(a - 1);

                } else if (list.get(a).total < list.get(a - 1).total) {
                    list.remove(a);
                }
            }
            
            if (list.size() == 1) {
                System.out.println(list.get(0).name);

            } else {
                
                h:for (int a = list.size() - 1; a >= 1; a--) {
                  //  System.out.print(list.size());
                    if (list.get(a).mark[2] > list.get(a - 1).mark[2]) {
                        list.remove(a - 1);

                    } else if (list.get(a).mark[2] < list.get(a - 1).mark[2]) {
                        list.remove(a);
                    }
                    if (list.size() == 1) {
                        System.out.println(list.get(0).name);
                        break h;
                    } else {
                        for (int b = list.size() - 1; b >= 1; b--) {
                            if (list.get(b).mark[1] > list.get(b - 1).mark[1]) {
                                list.remove(b - 1);

                            } else if (list.get(b).mark[1] < list.get(b - 1).mark[1]) {
                                list.remove(b);
                            }
                            if (list.size() == 1) {
                                System.out.println(list.get(0).name);
                                break h;
                            } else {
                                for (int c = list.size() - 1; c >= 1; c--) {
                                    if (list.get(c).mark[0] > list.get(c - 1).mark[0]) {
                                        list.remove(c - 1);

                                    } else if (list.get(c).mark[0] < list.get(c - 1).mark[0]) {
                                        list.remove(c);
                                    }
                                }
                                String output = "";
                                for (int d = 0; d < list.size(); d++) {
                                    if (d == 0) {
                                        output = output + list.get(0).name;
                                    } else {
                                        output = output + "," + list.get(d).name;
                                    }
                                }
                                System.out.println(output);
                                break h;
                            }
                        }
                    }

                }
            }

        }
    }
}

class people {

    String name;
    int mark[]=new int[3];
    int total;

    public people(String n, int m1, int m2, int m3) {
        name = n;
        mark[0]=m1;
        mark[1]=m2;
        mark[2]=m3;
        total = m1 + m2 + m3;
    }
}
