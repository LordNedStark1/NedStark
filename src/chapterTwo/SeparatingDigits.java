package chapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
    Scanner input = new Scanner(System.in);
    private int counter ;

    public void DetermineEachNUmber() {
        System.out.println("enter a number: ");
        int number = input.nextInt();
        int first = number / 10000;


        int next = number / 1000;
        int second = next % 10;

        int following = number / 100;
        int third = following % 10;

        int check = number / 10;
        int forth = check % 10;

        int fifth = number % 10;
        System.out.print(first + " " + second + " " + third + " " + forth + " " + fifth);
    }

    public int getCounter(){
        return counter;
    }
//    public String menu(){
//        return ("""Welcome to number determiner\n. 6
//                To use this app press 1
////                To end it press 0""");
//    }

}