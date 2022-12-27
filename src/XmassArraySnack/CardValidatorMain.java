package XmassArraySnack;

import java.util.Scanner;

public class CardValidatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardValidator validator = new CardValidator();


        validator.checkCardValidationPrompt();
        int nextOption = Integer.parseInt(input.next());

        while (nextOption != -1) {
            validator.guideForUserInput();
            int number = input.nextInt();

            validator.collectUserCardNumber(number);
            validator.contactPoint();

            validator.checkCardValidationPrompt();
            nextOption = Integer.parseInt(input.next());

        }
    }
}
