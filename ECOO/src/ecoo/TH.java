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

public class TH {

    static int[][] twod;
    static int key = 0;
    static int tre = 0;

    public static void zuo(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        
        a++;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 0) {
            System.out.println("!!!");
            char w = ar[a][b];
            //System.out.println(w);
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                   
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                     
                    twod[a][b] = 1;
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                zuo(a, b, N, ar);
                you(a, b, N, ar);
                shang(a, b, N, ar);
                xia(a, b, N, ar);
            }
        }
    }

    public static void you(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        a--;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 0) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                zuo(a, b, N, ar);
                you(a, b, N, ar);
                shang(a, b, N, ar);
                xia(a, b, N, ar);
            }
        }
    }

    public static void shang(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        b++;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 0) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                zuo(a, b, N, ar);
                you(a, b, N, ar);
                shang(a, b, N, ar);
                xia(a, b, N, ar);
            }
        }
    }

    public static void xia(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        b--;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 0) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                zuo(a, b, N, ar);
                you(a, b, N, ar);
                shang(a, b, N, ar);
                xia(a, b, N, ar);
            }
        }
    }

    public static void chongzuo(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        a++;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 2) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                chongzuo(a, b, N, ar);
                chongyou(a, b, N, ar);
                chongshang(a, b, N, ar);
                chongxia(a, b, N, ar);
            }
        }
    }

    public static void chongyou(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        a--;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 2) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                chongzuo(a, b, N, ar);
                chongyou(a, b, N, ar);
                chongshang(a, b, N, ar);
                chongxia(a, b, N, ar);
            }
        }
    }

    public static void chongshang(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        b++;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 2) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                chongzuo(a, b, N, ar);
                chongyou(a, b, N, ar);
                chongshang(a, b, N, ar);
                chongxia(a, b, N, ar);
            }
        }
    }

    public static void chongxia(int a, int b, int N, char[][] ar) {
        twod = new int[N][N];
        b--;
        if (a <= N - 1 && a >= 0 && b <= N - 1 && b >= 0 && twod[a][b] == 1) {
            char w = ar[a][b];
            switch (w) {
                case '.':
                    twod[a][b] = 1;
                    break;
                case '#':
                    twod[a][b] = 3;
                    break;
                case 'K':
                    twod[a][b] = 1;
                    key += 1;
                    ar[a][b] = '.';
                    break;
                case 'T':
                    twod[a][b] = 1;
                    tre++;
                    ar[a][b] = '.';
                    break;
                case 'S':
                    break;
                default:
                    int f = Integer.parseInt(String.valueOf(w));
                    if (key > f) {
                        twod[a][b] = 1;
                    } else {
                        twod[a][b] = 2;
                    }
                    break;
            }
            if (twod[a][b] == 1) {
                chongzuo(a, b, N, ar);
                chongyou(a, b, N, ar);
                chongshang(a, b, N, ar);
                chongxia(a, b, N, ar);
            }
        }
    }

    public static void main(String args[]) throws IOException {

        int a = 0;
        int b = 0;
        BufferedReader reader = new BufferedReader(new FileReader("DATA21.txt"));

        for (int i = 0; i < 1; i++) {

            int N = Integer.parseInt(reader.readLine());
            char maze[][] = new char[N][N];

            for (int c = 0; c < N; c++) {
                for (int t = 0; t < N; t++) {
                    maze[c][t] = (char) reader.read();
                    if (maze[c][t] == 'S') {
                        a = c;
                        b = t;
                    }
                }
                reader.readLine();
            }
         //   System.out.println(a+""+b);
            for(int c=0;c<N;c++){
                for (int t = 0; t < N; t++) {
                //    System.out.print(maze[c][t]);
                }
            }
            zuo(a, b, N, maze);
            you(a, b, N, maze);
            shang(a, b, N, maze);
            xia(a, b, N, maze);
           // System.out.println(a+""+b);
            for(int c=0;c<N;c++){
                for (int t = 0; t < N; t++) {
              //      System.out.print(maze[c][t]);
                }
            }
            chongzuo(a, b, N, maze);
            chongyou(a, b, N, maze);
            chongshang(a, b, N, maze);
            chongxia(a, b, N, maze);
            System.out.println(tre+"");

        }

    }

}
