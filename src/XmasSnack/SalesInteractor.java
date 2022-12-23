package XmasSnack;

import java.util.Scanner;

public class SalesInteractor {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CalculatingSales sales = new CalculatingSales();
        
        System.out.println("Welcome to product purchase");
        sales.userChoice();
        sales.calculateProductsPurchased();
        System.out.println(" press 1 to purchase again. \npress 2 to end");
        int option = input.nextInt();
        while (option != 2){
            sales.userChoice();

            System.out.println("press 1 to purchase again. \n  press 2 to end \n");
             option = input.nextInt();
        }

        sales.calculateProductsPurchased();
        System.out.println("Thank you for stopping by"); 
        
    }
}
