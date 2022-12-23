package XmasSnack;

import java.util.Scanner;

public class AnalysingExamResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passed = 0;
        int failed = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter result. press 1 for passed and 2 for failed");
            int grade = input.nextInt();
            ;
            if (grade == 1) {
                passed++;
                counter++;
            } else if (grade == 2) {
                failed++;
                counter++;
            }
        }
        if (passed >= 8) {
            System.out.println("Bonus to to the teacher");
            System.out.println("Total number of passed: " + passed);
        } else {
            System.out.println("Students need to work harder");
            System.out.println("Total number of failed: " + failed);
        }
    }
}