package tddFirst;

import java.util.Scanner;

public class TwoInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        boolean yes = true;
//        boolean test =input.nextBoolean();
//        yes =
//        if (yes == test)
//        System.out.println( );
        int passed = 0;
        int failed = 0;
        int counter = 1;

        while (counter <= 10){
            System.out.println("Enter result. press 1 for passed and 2 for failed");
            int grade = input.nextInt();;
            if (grade == 1 ){
                passed++;
                counter++;
            }else if (grade == 2 ){
                failed++;
                counter++;
            }
        }
        if (passed >=7 ){
            System.out.println("bonus to to the teacher");
            System.out.println("Total number of passed: "+ passed);
        }else {
            System.out.println("students need to work harder");
            System.out.println("total number of failed: "+ failed);
        }
    }
}
