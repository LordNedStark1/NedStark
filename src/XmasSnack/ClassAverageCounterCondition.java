package XmasSnack;

import java.util.Scanner;

public class ClassAverageCounterCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int total = 0;
        int counter = 1;

        while ( counter <= 10) {
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            counter++;
        }
        double average = (double) total / 10;

        System.out.printf("Total of all 10 grades is %n%d%n", total);
        System.out.printf("Class average is %n%.2f%n", average);
    }

}
