package Chapter4;

import java.util.Scanner;

public class SentinelWhileLoop {
    private int sumTotal;
    private int minusTotal;
    Scanner input = new Scanner(System.in);

    public void additionProgram(){
        System.out.println(" enter the first number");
    int num1 = input.nextInt();
        System.out.println("enter the second number");
    int num2 = input.nextInt();

     sumTotal = num1 + num2;
        System.out.println("the total of the two numbers are: " + sumTotal);
    }
    public void menu(){
        System.out.println("welcome to addition and subtraction program. \n" +
                "press 1 if u want to do addition \n" +
                "press 2 if u want to subtract \n" );
        menuOptions();
    }
    public void subtractionProgram(){
        System.out.println(" enter the first number");
        int num1 = input.nextInt();
        System.out.println("enter the second number");
        int num2 = input.nextInt();

        minusTotal = num1- num2;
        System.out.println("the result of the two numbers are: " + minusTotal);
    }
    public void loopSectionForAddition() {
        additionProgram();
        System.out.println("press 1 to add again\n " +
                "press 2 to end");
        int endPoint = input.nextInt();
        if (endPoint == 1){
            loopSectionForAddition();
        }else if (endPoint == 2){
            menu();
        }else if (endPoint > 2){
            System.out.println("invalid option\n" +
                    "press 1 to add again\n " +
                    "press 2 to end");
            endPoint = input.nextInt();

        }

    }
    public void menuOptions(){
        int option = input.nextInt();
        if (option == 1){
            loopSectionForAddition();
        }
        else if(option == 2){
            subtractionProgram();
        }

    }

    public void entryPoint() {
        System.out.print("would you like to use this program. \n" +
                "press 1 to use \n"+
                " press 0 to end \n");
    }
}
