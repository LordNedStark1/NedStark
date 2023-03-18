package ChibuzoBuzoBuzo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter number: ");
        int number = input.nextInt();
        int checkNumber = number % 3;

        if (checkNumber == 0){
            System.out.println("Number is divisible by 3");
        }
        if (checkNumber != 0) {
            System.out.println("Number is not divisible by 3");
        }

    }
}
