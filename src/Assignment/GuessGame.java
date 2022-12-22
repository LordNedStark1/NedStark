package Assignment;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessRandomNumberGameDevelopmentSegment guessGame = new GuessRandomNumberGameDevelopmentSegment();

        guessGame.menu();
        int userOption = input.nextInt();
        while (userOption == 1){
            guessGame.guessTheNumber();

            guessGame.menu();
             userOption = input.nextInt();
        }
        System.out.printf(" Thanks for playing.%n%s%n", "GoodByeee");
    }
}
