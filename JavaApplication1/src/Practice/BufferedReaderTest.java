/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maruiling
 */
public class BufferedReaderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        BufferedReader reader = new BufferedReader(new FileReader(new File("./negTest.txt")));

        StringTokenizer st;
        String newLine;

        while ((newLine = reader.readLine()) != null) {

            System.out.print(newLine);
        }

    }

}
