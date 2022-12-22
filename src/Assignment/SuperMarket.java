package Assignment;

import java.util.Scanner;

public class SuperMarket {
    Scanner input = new Scanner(System.in);
    Store storeKeeper = new Store();
    private int calculatedBookPrice;
    private int calculatedBagPrice;
    private int calculatedShoePrice;
    private int totalItemPurchase;
    private int recieptInt;
    private String recieptAbove;
    private String recieptBelow;

    public void bookPriceCalculator() {
        int numberOfBooksToBuy = input.nextInt();
        if (numberOfBooksToBuy > 0) {
            int bookPrice = numberOfBooksToBuy * storeKeeper.actualBookPrice();
            calculatedBookPrice = bookPrice;
        } else {
            calculatedBookPrice = 0;
            System.out.println("invalid number of books entered.");
        }
    }

    public int bookPrice() {
        return calculatedBookPrice;
    }


    public String menuPrompt() {
        return "Welcome to: NED-STARK SUPERMARKET. " +
                "We offer the best of quality and class. " +
                "press 1 to buy books" +
                "press 2 to buy bags" +
                "press 3 to buy shoes" +
                "press 4 to end";

    }

    public void bagPriceCalculator() {
        int numberOfBagsToBuy = input.nextInt();
        if (numberOfBagsToBuy > 0) {
            int bagPrice = numberOfBagsToBuy * storeKeeper.actualBagPrice();
            calculatedBagPrice = bagPrice;
        } else {
            calculatedBagPrice = 0;
            System.out.println("invalid number of bags entered.");
        }
    }

    public int bagPrice() {
        return calculatedBagPrice;
    }

    public void shoePriceCalculator() {
        int numberOfShoesToBuy = input.nextInt();
        if (numberOfShoesToBuy > 0) {
            int bagPrice = numberOfShoesToBuy * storeKeeper.actualShoePrice();
            calculatedShoePrice = bagPrice;
        } else {
            calculatedShoePrice = 0;
            System.out.println("invalid number of shoes entered.");
        }
    }

    public int shoePrice() {
        return calculatedShoePrice;
    }

    public void menuOptions() {


        int inputOption = input.nextInt();
        if (inputOption == 1) {
                bookMenu();
                bookPriceCalculator();
        } else if (inputOption ==2) {
                bagMenu();
                bagPriceCalculator();
        } else if (inputOption ==3) {
            shoeMenu();
            shoePriceCalculator();
        }else{
            System.out.println("please pick a valid number!");
        }
    }

    public String shoeMenu() {
        return "Shoe menu";
    }

    public String bagMenu() {
        return "Bag menu";
    }

    public String bookMenu() {
        return "Book menu";
    }

    public void bagPurchase() {
        bagPriceCalculator();
    }

    public void shoePurchase() {
        shoePriceCalculator();
    }

    public void bookPurchase() {
        bookPriceCalculator();
    }

    public int totalItemPurchase() {
        return totalItemPurchase = calculatedBagPrice + calculatedBookPrice + calculatedShoePrice;

    }

    public int paymentMenu() {
        int paymentAmount = input.nextInt();
        if (paymentAmount > totalItemPurchase) {
            recieptAbove = "Payment amount is above item price";
        } else if (paymentAmount < totalItemPurchase) {
            recieptBelow = "Payment amount is below item price";
        } else if (paymentAmount == totalItemPurchase) {
            recieptInt = totalItemPurchase - paymentAmount;
        }
        return paymentAmount;
    }
}