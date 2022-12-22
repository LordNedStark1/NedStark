package chapterTwo;

import java.util.Scanner;

public class SelfReviewMultipleOfThreeIntergers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int x = input.nextInt();

        System.out.println("Enter the second number");
        int y = input.nextInt();

        System.out.println("Enter the third number");
        int z = input.nextInt();

        int total = x * y * z;

        System.out.printf("The product of %d%s%d%s%d%s%d",  x, " * ",  y, " * ",  z, " is ", +total);
    }
}
