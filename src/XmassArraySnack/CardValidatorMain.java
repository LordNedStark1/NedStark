package XmassArraySnack;

import java.util.Scanner;

public class CardValidatorMain {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        CardValidator validator =new CardValidator();

        System.out.println("enter the number to be validated");
        int number = input.nextInt();

        validator.collectUserCardNumber(number);
        validator.cardNumberCounter(validator.returnCardNumber());

        validator.separateCardNumbers(validator.returnCardNumber());
        validator.collectingEverySecondNumber();

    }
}
