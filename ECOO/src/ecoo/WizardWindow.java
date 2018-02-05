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
import java.util.StringTokenizer;

public class WizardWindow {

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("DATA11.txt"));

        for (int i = 0; i < 10; i++) {

            StringTokenizer s = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(s.nextToken());
            int M = Integer.parseInt(s.nextToken());

            String rule1[] = new String[4];
            String rule2[] = new String[4];

            for (int c = 0; c < 4; c++) {

                StringTokenizer str = new StringTokenizer(reader.readLine());

                rule1[c] = str.nextToken();
                rule2[c] = str.nextToken();

            }

            String[][] tower = new String[M][N];
            for (int j = 0; j < N; j++) {

                tower[0][j] = String.valueOf((char)reader.read());
                //System.out.println(tower[0][j]);
            }
            reader.readLine();
            reader.readLine();
           
            String st = "";
            String ss = "";
            for (int w = 1; w < M; w++) {
                for (int k = 0; k < N; k++) {
                    if (k - 1 < 0) {
                        st = tower[w - 1][N - 1] + tower[w - 1][k + 1];
                    } else if (k + 1 == N) {
                        st = tower[w - 1][k - 1] + tower[w - 1][0];
                    } else {
                        st = tower[w - 1][k - 1] + tower[w - 1][k + 1];
                    }

                    for (int t = 0; t < 4; t++) {
                        if(st.equals(rule1[t]))
                            ss = rule2[t];
                    }
                    tower[w][k] = ss;
                }
            }
            
            for(int r = 0; r < N; r++){
                System.out.print(tower[M - 1][r]);
            }
            System.out.println();
            
            
        }

    }

}


