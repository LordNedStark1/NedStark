package Assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessRandomNumberGameDevelopmentSegment {
    Scanner input = new Scanner(System.in);
    SecureRandom randomNumber = new SecureRandom();

    public void guessTheNumber(){
        System.out.printf("Hello. I have a number saved in a box.%n%s%n%s%n",
                            "Its between the range of 1-3, not more than and not less than",
                            "Guess the number, I promise I wont lie");
    int yourGuessedNumber = input.nextInt();

    int randomValue = 1 + randomNumber.nextInt(3);

    if (yourGuessedNumber == randomValue){
        System.out.printf("CORRECT!!! %n%s%d%n%s%d%n%n ", "your guess:   ", yourGuessedNumber, "the actual number is:  ", randomValue);
    }else {
        System.out.printf("Sorry try again %n%s%d%n%s%d%n%n ", "your guess:  ", yourGuessedNumber, "the actual number is:  ", randomValue);
    }

    }


    public void menu(){
        System.out.printf("Welcome to Guess Number game for all game lovers.%n%s%n%s%n",
                            "press 1 to play game",
                            "press 2 to end");

    }
}
