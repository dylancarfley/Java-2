
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dylan
 */
public class DistanceFromAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] scores = new double[20];
        double score = 0;
        int count = 0;
        int total = 0;
        final int quit = 99999;
        final int max = 20;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter a quiz score or type " + quit + " to quit the program.");
        score = inputDevice.nextDouble();

        while (score != quit) {
            scores[count] = score;
            total += scores[count];
            count++;
            if (count == max) {
                score = quit;
            } else {
                System.out.println("Enter a quiz score or type " + quit + " to quit the program.");
                score = inputDevice.nextDouble();
            }
        }

        if (count != 0) {
            System.out.println("\n The average is " + (total * 1.0 / count));
        } else {
            System.out.println("Error: No scores were entered.");
        }

        if (count > 0) {
            System.out.println("\nThe scores entered and their distance from the average: ");
        }

        for (int i = 1; i <= count; i++) {
            System.out.println(scores[i - 1] + " & the distance is " + Math.abs((total * 1.0 / count) - scores[i-1]) );
        }

    }

}
