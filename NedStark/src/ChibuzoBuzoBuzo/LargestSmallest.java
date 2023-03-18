package ChibuzoBuzoBuzo;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = input.nextInt();
        System.out.println("Enter forth number:");
        int forthNumber = input.nextInt();
        System.out.println("Enter fifth number:");
        int fifthNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) ;
            if (firstNumber > forthNumber) ;
            if (firstNumber > fifthNumber) ;
            System.out.printf("The greatest number is: %d %n", firstNumber);
        }
      else if  (secondNumber > firstNumber){
            if (secondNumber > thirdNumber);
            if (secondNumber > forthNumber);
            if (secondNumber > fifthNumber);
            System.out.printf("The greatest number is: %d %n", secondNumber);
        }
      else  if (thirdNumber > secondNumber) {
            if (thirdNumber > firstNumber) ;
            if (thirdNumber > forthNumber) ;
            if (thirdNumber > fifthNumber) ;
            System.out.printf("The greatest number is: %d %n", thirdNumber);
        }
        else if (forthNumber > secondNumber) {
            if (forthNumber > thirdNumber) ;
            if (forthNumber > firstNumber) ;
            if (forthNumber > fifthNumber) ;
            System.out.printf("The greatest number is: %d %n", forthNumber);
        }
     else if (fifthNumber > secondNumber) {
            if (fifthNumber > thirdNumber) ;
            if (fifthNumber > forthNumber) ;
            if (fifthNumber > firstNumber) ;
            System.out.printf("The greatest number is: %d %n", fifthNumber);
        }

    }
}