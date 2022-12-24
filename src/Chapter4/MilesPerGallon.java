package Chapter4;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

        int miles = 0;
        int gallons = 0;
        int trip = 0;
        double milesPerGallon = 0;
        double totalMilesPerGallon =0;

        System.out.println("Enter miles or type -1");
        miles = input.nextInt();

        System.out.println("Enter gallons used or type -1");
        gallons = input.nextInt();


         while ( miles != -1){
              milesPerGallon =(double) miles/gallons;

              totalMilesPerGallon += milesPerGallon;
              trip++;

             System.out.println("Enter miles or type -1");
             miles = input.nextInt();

             System.out.println("Enter gallons used or type -1");
             gallons = input.nextInt();
         }
         if(trip != 0){
             System.out.println("total trip is "+ trip);

         double average = totalMilesPerGallon/ trip;
        System.out.println(" gallon per trip is: "+ milesPerGallon +
                " the average is "+ average);
    }
}
}