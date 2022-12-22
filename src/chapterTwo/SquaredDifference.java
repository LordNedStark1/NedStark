package chapterTwo;

import java.util.Scanner;

public class SquaredDifference {
    private static int squrdDiff;
    private static Scanner input = new Scanner(System.in);
    public static int  squaredNumbers( ){
        System.out.println("enter the first and second numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num1Sqrd = num1 * num1;
        int num2Squrd = num2 * num2;

        return squrdDiff = num2Squrd - num1Sqrd;

    }

    public static void main(String[] args) {
//        System.out.println("the squared difference is: " + squaredNumbers()  );
        var remainder = new Remainder();
        remainder.verifyNumber(7);
        System.out.println(remainder.returnVerifiedAnswer());
    }
}
