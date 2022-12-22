package Chapter4;

import java.util.Scanner;

public class WhileStatement {
    public static void main(String[] args) {
        int product = 2;
        while(product <= 3000){
            product = 2 * product;
            System.out.println(product);
        }
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter =1;

        while (gradeCounter <= 10){
            System.out.println("enter grade");
            int grade = input.nextInt();
        total = total + grade;
        gradeCounter = gradeCounter +1;
        }
        int average = total /10;
        System.out.println("total grade is:   "+ total);
        System.out.println("grade average is:  " + average);


        int gradeTotal = 0;
        int Counter = 1;

        int grade  = input.nextInt();
    }
}
