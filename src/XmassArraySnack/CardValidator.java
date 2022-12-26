package XmassArraySnack;

import java.util.Arrays;
import java.util.Scanner;

public class CardValidator {
    private int cardNumber ;
    private int count;

    public void collectUserCardNumber(int number){
        cardNumber = number;
    }
    public int returnCardNumber(){
        return cardNumber;
    }

    public void cardNumberCounter(int number){
        int counter =0;
            while(number > 0){
                number = number/10;
                counter++;
            }
            count = counter;
    }
    public int getCardNumberCount(){
        return count;
    }
    public void separateCardNumbers(int number) {

        int[] collect = new int[getCardNumberCount()];

        int number1 = number;
        int number2;
        for (int i = 0; i < collect.length; i++) {
            number2 = number1 % 10;
            collect[collect.length - 1 - i] = number2;
            number1 /= 10;
       }
        System.out.println(Arrays.toString(collect));
        if (collect[0] == 4 ){
            System.out.println("Visa: More Than Credit Cards; It Is\n" +
                    "   Trust, Security, Acceptance, and Inclusion.");
        } else if (collect[0] == 5) {
            System.out.println("There are some things money can't buy; for everything else,\n" +
                    "there's MASTERCARD.");
        }else if (collect[0]== 3 && collect[1] == 7) {
            System.out.println("Don't carry cash, carry American Express.");
        }
        else if (collect[0] == 6) {
            System.out.println("    It pays to Discover.");
        }else {
            System.out.println("Invalid card");
        }
    }

}
