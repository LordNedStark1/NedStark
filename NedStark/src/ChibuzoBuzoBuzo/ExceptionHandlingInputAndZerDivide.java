package ChibuzoBuzoBuzo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandlingInputAndZerDivide {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is neede

        do {
            try { // read two numbers and calculate quotient
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false; // input successful; end looping
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                scanner.nextLine(); // discard input so user can try again
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);


    }
}






//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int firstNumber = input.nextInt();
//        System.out.println("Enter second number:");
//        int secondNumber = input.nextInt();
//        System.out.println("Enter third number:");
//        int thirdNumber = input.nextInt();
//        System.out.println("Enter forth number:");
//        int forthNumber = input.nextInt();
//        System.out.println("Enter fifth number:");
//        int fifthNumber = input.nextInt();
//
//        System.out.printf("%d %d %d %d %d %n", firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber);
//    }
//}
