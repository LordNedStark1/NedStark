package XmasSnack;

import javax.swing.*;
import java.util.Scanner;

public class ClassAverageSentinelControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total =0.0;
        int counter = 0;

        System.out.print("Enter grade or -1 to quit: \n");
        int grade = input.nextInt();

        while (grade != -1) {
            total += grade;
            counter++;

            System.out.print("Enter grade or -1 to quit: \n");
            grade = input.nextInt();
        }

        if (counter != 0){
            double average = total /counter;
            System.out.println("The total grades for " + counter + " students are:  \n"+ total+ "\n"+"And the average is: \n" + average);
        }
    }
}
