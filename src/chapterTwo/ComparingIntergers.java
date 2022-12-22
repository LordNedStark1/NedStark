package chapterTwo;

import java.util.Scanner;

public class ComparingIntergers {
    private static Scanner input = new Scanner(System.in);
   public static void compareMethod() {
       System.out.println("Enter a number");
       int number = input.nextInt();

       if (number < 100 ) {
           System.out.println("number is less than 100");
       }
       else if (number == 100){
               System.out.println("number is equals to 100");
       }
       else{
           System.out.println("number is above 100");
       }

       int squrd = number  * number;
       if (squrd < 100 ) {
           System.out.println("number squared is less than 100");
       }
       else if (squrd == 100){
           System.out.println("number squared is equals to 100");
       }
       else{
           System.out.println("number squared is above 100");
       }
   }
    public static void main(String[] args) {
        compareMethod();
    }
}
