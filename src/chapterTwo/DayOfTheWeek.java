package chapterTwo;

import java.util.Scanner;

public class DayOfTheWeek {
    static Scanner input = new Scanner(System.in);
    private static void printDayOfTheWeek(){
        System.out.println("Enter a number for the day of the week: ");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                System.out.println("do you want to check the best hours for Monday, press 1 for yes");
                for (int userChoice = input.nextInt(); userChoice == 1;){
                    System.out.println("what time do u wake up. enter numbers only please");

                   for (  int counter = input.nextInt();counter >5 && counter < 12; counter ++){
                       System.out.println(counter);
                   }
                    System.out.println("press 1 to checks best hours again 0r 2 to end ");
                     userChoice = input.nextInt();
                }
                break;
            case 2:
                System.out.println("Tuesday");

                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Retry");
                break;
        }
    }
    public static void main(String[] args) {

        System.out.println("press 1 to check the day of week, press 2 to end. ");
      int option = input.nextInt();
      while (option ==1) {
          printDayOfTheWeek();

          System.out.println("press 1 to check the day of week, press 2 to end. ");
           option = input.nextInt();
      }
    }

}
