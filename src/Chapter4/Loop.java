package Chapter4;

import java.util.Scanner;

public class Loop {
//    counter variable
//     loop continuation condition
//     increment
    public static void main(String[] args) {
//         while loop
        int counter = 0 ;
        while (counter <= 5){
            System.out.println(counter);
            counter++;
        }
        for (int count = 0; count <= 5; count ++){
            System.out.println(count);
        }
        int countNumber= 0;
        do {
            System.out.println(countNumber);
            countNumber++;
        } while (countNumber<= 5);
        Scanner input = new Scanner(System.in);

        System.out.println(" do you want water: press 1 for water 2 for food");
        int option = input.nextInt();

        while (option == 1) {
            System.out.println("drink water");

            System.out.println(" do you want water: press 1 for water 2 for food");
            option = input.nextInt();
        }

        System.out.println("enjoy your meal");

        }

 }





