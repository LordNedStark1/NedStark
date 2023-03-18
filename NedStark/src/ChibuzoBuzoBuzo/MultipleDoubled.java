package ChibuzoBuzoBuzo;

import java.util.Scanner;

public class MultipleDoubled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.println("enter first nbumeber: ");
        int firstNumber = input.nextInt();
      System.out.println("enter second Numeber: ");
        int secondNumber =input.nextInt();

        int tripleFirstNumber = 3 * firstNumber;
        int doubleSecondNumber = 2 * secondNumber;

      if (tripleFirstNumber % doubleSecondNumber == 0){
          System.out.println("correct");
      }
      if (tripleFirstNumber % doubleSecondNumber != 0){
            System.out.println("not correct");
        }
    }
}
