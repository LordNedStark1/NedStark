package chapterTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BitFlipper {

     private static int j = 2;
     private static int i = 3;
   private static Scanner input = new Scanner (System.in);
 private static int counter;
    public static void main(String[] args) {
//        System.out.println("Enter a number");
//        int userInput = input.nextInt();
//        if(userInput == 0) System.out.println(1);
//        if (userInput ==1) System.out.println(0);

//        {  int d = i++ + --j;
//            System.out.println("d is " + d+" i and j is "+ i +" "+ j);}
//        { int a = i++ + j--;
//        System.out.println("a is " + a +" i and j is "+ i +" "+ j);}
//        {int b = ++i + --j;
//        System.out.println("b is " + b+" i and j is "+ i +" "+ j);}
        { int c = ++i + j--;
        System.out.println("c is "+ c+" i and j is "+ i +" "+ j);}

//        System.out.println("use the program. ");
//        unitCheck(1122223);
//        System.out.println( unitCheckReturn());
    }
    public static void unitCheck(long number){
        System.out.println("enter a number: ");
         number = input.nextLong();
         counter = 0;
        while (number != 0){
            number = number/ 10;
            counter++;
        if (counter > 5) {
            System.out.println("digits more than five");
            }
        }

    }
    public static int unitCheckReturn(){
        return  counter;

    }
}
