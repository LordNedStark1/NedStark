package chapterTwo;

import java.security.SecureRandom;

public class SameParameters {
    public static void calculate(double num1, double num2) {

        int total = (int) (num1 + num2);

        System.out.println(total);
    }

    public static void squared(double num) {
        double answer = Math.round(num);
        System.out.println(answer);
    }

    public static void securedDiesGame() {
        SecureRandom randomNumber = new SecureRandom();
        int number1 = 1 + randomNumber.nextInt(7);
        int number2 = 1 + randomNumber.nextInt(7);
        System.out.printf("%d%s%d", number1, " : ", number2);

    }

    public static void securedCoinGame() {
        SecureRandom randomNumber = new SecureRandom();
        int number = randomNumber.nextInt(2);
        switch (number) {
            case 0:
                System.out.println("Tail");
                break;
            case 1:
                System.out.println("Head");
                break;
        }
    }

    public static void main(String[] args) {
//        calculate(5.98, 8.95);
//        squared(97643.6654);
//        securedCoinGame();
//        securedDiesGame();


        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled
        // tally counts for 60,000,000 rolls of a die
        for (int roll = 1; roll <= 60_000_000; roll++) {
            int face = 1 + randomNumbers.nextInt(6);

            // use face value 1-6 to determine which counter to increment
            switch (face) {
                case 1:
                    ++frequency1; // increment the 1s counter
                    break;
                case 2:
                    ++frequency2; // increment the 2s counter
                    break;
                case 3:
                    ++frequency3; // increment the 3s counter
                    break;
                case 4:
                    ++frequency4; // increment the 4s counter
                    break;
                case 5:
                    ++frequency5; // increment the 5s counter
                    break;
                case 6:
                    ++frequency6; // increment the 6s counter
                    break;
            }
        }
                System.out.println("Face\tFrequency"); // output headers
                System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                        frequency1, frequency2, frequency3, frequency4,
                        frequency5, frequency6);


    }
}