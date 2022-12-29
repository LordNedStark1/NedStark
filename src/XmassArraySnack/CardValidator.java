package XmassArraySnack;

import java.util.Arrays;
import java.util.Scanner;

public class CardValidator {
    static int[] collectingEverySecondNumber;
    static int[] doubleEverySecondDigit;
    static int[] collect;
    static int [] multipleOfNumbersArray ;
    private int cardNumber;
    private int count;
    private  int calculateArrayTotal = 0;

    public void collectUserCardNumber(int number) {
        cardNumber = number;
    }

    public int returnCardNumber() {
        return cardNumber;
    }

    public void cardNumberCounter(int number) {
        int counter = 0;
        while (number > 0) {
            number = number / 10;
            counter++;
        }
        count = counter;
    }

    public int getCardNumberCount() {
        return count;
    }

    public void separateCardNumbers(int number) {

        collect = new int[getCardNumberCount()];

        int number1 = number;
        int number2;
        for (int i = 0; i < collect.length; i++) {
            number2 = number1 % 10;
            collect[collect.length - 1 - i] = number2;
            number1 /= 10;
        }
        System.out.println(Arrays.toString(collect));
        displayCardName();

    }

    public void displayCardName() {
        if (collect[0] == 4) {
            System.out.println("Visa: More Than Credit Cards; It Is\n" +
                    "   Trust, Security, Acceptance, and Inclusion.");
        } else if (collect[0] == 5) {
            System.out.println("There are some things money can't buy; for everything else,\n" +
                    "there's MASTERCARD.");
        } else if (collect[0] == 3 && collect[1] == 7) {
            System.out.println("Don't carry cash, carry American Express.");
        } else if (collect[0] == 6) {
            System.out.println("    It pays to Discover.");
        } else {
            System.out.println("Invalid card");
        }

    }


    public void collectingEverySecondNumber() {
        collectingEverySecondNumber = new int[getCardNumberCount()];
        int num2;
        for (int i = 1; i < collect.length; i += 2) {

            num2 = collect[collect.length - 1 - i];
            collectingEverySecondNumber[i] = num2;
        }
        System.out.println(Arrays.toString(collectingEverySecondNumber));
        multiplyEverySecondArrayNumber();
    }

    public void multiplyEverySecondArrayNumber() {
        multipleOfNumbersArray = new int[9];
        int calculateArray ;
        int multipliedNumber;

        for (int i = 0; i < collectingEverySecondNumber.length; i++) {
            multipliedNumber = collectingEverySecondNumber[i] * 2;

            if (multipliedNumber > 9) {
                multipliedNumber = (multipliedNumber % 10) + 1;
                multipleOfNumbersArray[i] = multipliedNumber;
            } else {
                multipleOfNumbersArray[i] = multipliedNumber;
            }
        }
        System.out.println(Arrays.toString(multipleOfNumbersArray));

        for(int i = 0; i< multipleOfNumbersArray.length; i++ ){
            calculateArray = multipleOfNumbersArray[i];
            calculateArrayTotal += calculateArray;
        }
        System.out.println(calculateArrayTotal);
    }
}
