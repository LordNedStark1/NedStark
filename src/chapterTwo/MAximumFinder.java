package chapterTwo;

import java.util.Scanner;

public class MAximumFinder {

    public static double maximum(){
        Scanner input = new Scanner(System.in);

       int  counter = 1;
        System.out.println("please enter first double");
        double maximumValue = input.nextInt();;
               while( counter < 6){
                   counter ++;
                   System.out.println("please enter next double: ");
                   double userInput = input.nextInt();
                   if( maximumValue < userInput){
                   maximumValue = userInput;
                   }

               }
               return maximumValue;
    }

    public static void main(String[] args) {
        System.out.println(" the maximum value out of 6 numbers is: "+ maximum());
    }
}
