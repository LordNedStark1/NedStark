package XmasSnack;

import java.util.Scanner;

public class CalculatingSales {
    static Scanner input = new Scanner(System.in);

//    private String productOn;
//    private String productTw;
//    private String productThre;
//    private String productFou;

    private double productOne;
    private double productTwo;
    private double productThree;
    private double productFour;
    private double productFive;

    public void userChoice() {
        System.out.println("What product will u like to buy today. Chose from product 1 - 4");
        int productChoice = input.nextInt();
        switch (productChoice) {
            case 1:
                System.out.println("The price of product one is $2.98 per one. How many do u want?");
                int amount1 = input.nextInt();
                productOne = amount1 * 2.98;
                System.out.println("The total price for "+ amount1 +" product one goods is: "+ productOne);
                break;
            case 2:
                System.out.println("The price of product one is $4.50 per one. How many do u want?");
                int amount2 = input.nextInt();
                productTwo = amount2 * 4.50;
                System.out.println("The total price for "+ amount2 +" product one goods is: "+ productTwo);
                break;
            case 3:
                System.out.println("The price of product one is $9.98 per one. How many do u want?");
                int amount3 = input.nextInt();
                productThree = amount3 * 9.98;
                System.out.println("The total price for "+ amount3 +" product one goods is: "+ productThree);
                break;
            case 4:
                System.out.println("The price of product one is $4.49 per one. How many do u want?");
                int amount4 = input.nextInt();
                productFour = amount4 * 4.49;
                System.out.println("The total price for "+ amount4 +" product one goods is: "+ productFour);
                break;
            case 5:
                System.out.println("The price of product one is $6.87 per one. How many do u want?");
                int amount5 = input.nextInt();
                productFive = amount5 * 6.87;
                System.out.println("The total price for "+ amount5 +" product one goods is: "+ productFive);
                break;
            default:
                System.out.println("We don't hava product with that number");
        }
    }
    public void calculateProductsPurchased(){
        double total = productOne + productTwo + productThree + productFour + productFive;
        System.out.println("The amount for all products purchased is:  " + total);
    }

}
