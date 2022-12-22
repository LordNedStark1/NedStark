package chapterTwo;

import java.util.Scanner;

public class PrimeNumberIndicator {
    public static  boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("false");
                return false;

            }

        }
        System.out.println("true");
        return true;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        isPrimeNumber(input.nextInt());

    }
}
