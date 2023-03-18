package ChibuzoBuzoBuzo;


import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int i = 0;
        while (i < 5){
            System.out.println("enter any number,positve,negative or zero:");
            int number = input.nextInt();
            if(number == 0){
                zeroCount++;
                System.out.println(zeroCount);

            } else if (number > 0) {
                positiveCount++;
                System.out.println(positiveCount);


            }else if (number < 0){
                negativeCount++;
                System.out.println(negativeCount);
            }
            i++;

        }



    }

    }
