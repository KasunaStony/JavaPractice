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
import java.io.*;
import java.util.*;
public class Tomato {
    
    public static void main(String[] args) throws FileNotFoundException {
        //Print out introduction
        System.out.println("What would you like to do?");
        System.out.println("1: Get the score of a word");
        System.out.println("2: Get the average score of words in a file");
        System.out.println("3: Find the highest/lowest scoring words in a file");
        System.out.println("4: Sort words from a file into positive.txt and negative.txt");
        System.out.println("5: Exit");
        System.out.println("Enter a number 1-5");

        //Get user input and run programs
        Scanner menu = new Scanner(System.in);
        int menuC = menu.nextInt();

        switch (menuC) {
            case 1:

                //Variable: input, scan, word, results, score1
                System.out.println("Please enter a word" + " ");
//SCANNER
                Scanner scan = new Scanner(System.in);
                
                String word = scan.nextLine();

                //Call Method 
                double[] results = calRating(word);

                double score1 = -1;

                //Calculate value
                if (results[0] != 0) {
                    score1 = results[1] / results[0];
                }

                //output
                System.out.println(word + " " + "appears" + " " + results[0] + " " + "times");
                System.out.println("The average score for reviews containing the word " + word + " is "
                        + "" + score1);

                break;

            case 2:
                //(The loop has issues) 
                System.out.println("Enter the name of the file with words you wnat to find the average "
                        + "score for: ");

                
                //Locate the file + variable 
                scan = new Scanner(System.in);
                String file2 = scan.nextLine();
                File words = new File(file2);
                Scanner reader = new Scanner(words);

                //Start edit here
                double scoreSum = 0;
                int counter2 = 0;

                while (reader.hasNext()) {
                    String word2 = reader.nextLine();
                    word2 = word2.toLowerCase();

                    results = calRating(word2);
                    counter2++;
                    scoreSum = results[1]/results[0] + scoreSum;

                }
               // System.out.print(scoreSum);
                double score2 = scoreSum / counter2;

                if (score2 > 2.01) {
                    System.out.println("The average score of words in " + "is " + score2);
                    System.out.println("The overall sentiment of " + "is positive");
                }

                if (score2 < 1.99) {
                    System.out.println("The average score of words in " + "is " + score2);
                }
                System.out.println("The overall sentiment of " + "is negative");

                break;
            case 3:
                //here

                System.out.println("Enter the name of the file with words you want to score:");

                //Locate the file + variable 
                scan = new Scanner(System.in);
                String fileN3 = scan.nextLine();
                
                File words3 = new File(fileN3);
                Scanner reader3 = new Scanner(words3);
                //reader = new Scanner(words3);
                
                double max = -1;
                double min = 5;

                String wordF1 = " ";
                String wordF2 = " ";

                while (reader3.hasNext()) {
                    String word3 = reader3.nextLine();
                    word3 = word3.toLowerCase();
                   // System.out.println(word3);
                    double[] results3 = calRating(word3);
                   double score3 = results3[1]/results3[0];
                    // double score3 = calScore(results3, scan, input);

                    if (score3 > max) {
                        max = score3;
                        wordF1 = word3;

                    }
                    if (score3 < min) {
                        min = score3;
                        wordF2 = word3;
                    }

                }

                System.out.println("The most positive word, with a score of " + wordF1 + " is " + max);
                System.out.println("The most negative word, with a score of " + wordF2 + " is " + min);

                break;
            case 4:
                System.out.println("Enter the name of the file with words you want to sort:");

                //Locate the file + variable 
                scan = new Scanner(System.in);
                String fileN4 = scan.nextLine();
                File words4 = new File(fileN4);
                Scanner reader4 = new Scanner(words4);

                
                

                PrintWriter writerPos = new PrintWriter("positive.txt");
                PrintWriter writerNeg = new PrintWriter("negative.txt");
                while (reader4.hasNext()) {
                    String word4 = reader4.nextLine();
                    word4 = word4.toLowerCase();
                    double[] results4 = calRating(word4);
                    double score4 = results4[1]/results4[0];

                    if (score4 > 2.1) {
                        writerPos.println(word4);
                    }
                    else if (score4 < 1.9) {
                        writerNeg.println(word4);
                    }

                }

                writerPos.close();
                writerNeg.close();

                break;
            case 5:
                break;

        }

    }

    public static double[] calRating(String word) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MovieReviews.txt"));
        //use string tokenizer 
        word = word.toLowerCase();

        int rating;
        int counter = 0;

        int rating1 = 0;

        double[] list = new double[2];

        do {
            rating = input.nextInt(); //
            String rev = input.nextLine();
            if (rev.indexOf(word) != -1) {
                rating1 = rating1 + rating;
                counter++;

            }

        } while (input.hasNext());

        list[0] = counter;
        list[1] = rating1;
        return list;
    }
}
    
