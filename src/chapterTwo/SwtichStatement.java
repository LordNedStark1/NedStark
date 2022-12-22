package chapterTwo;

import java.util.Scanner;

public class SwtichStatement {
    public static void main(String[] args) {
    MAximumFinder max = new MAximumFinder();

        double value =  max.maximum();
        switch ((int) value) {
            case 1:
                System.out.println("man");
           break;

            case 2:
                System.out.println("we");
            break;

            case 3:
                System.out.println("land");
            break;

            case 4:
                System.out.println("snow");
                break;

            case 5:
                System.out.println("shop");
                break;

            case 6:
                System.out.println("house");
                break;

            case 7: case 8: case 9: case 10:
                System.out.println(" here  is your value: " +value);
                break;

            default:
                System.out.println("none, value is: " + value);
        }


    }

    public static class Account {
        private String name;
        private int balance;
        private int pin;
        private int phoneNumber;

        private boolean isValidAmount;


        public Account( int firstPin, int firstPhoneNumber ){


            pin = firstPin;
            phoneNumber = firstPhoneNumber;
        }
        public Account (int firstPin){
    //        System.out.println("Enter firstPin");
            pin = firstPin;

        }
        public Account (){

        }

        public void deposit(int amount) {
    //        System.out.println("Enter Deposit amount");
           if (amount >= 0) balance += amount;
        }

        public int getBalance() {
            return balance;
        }
        public void changePin( int confirmedPhoneNumber, int newPin){
            if (phoneNumber != confirmedPhoneNumber){
                System.out.printf("unable to set pin! %n%s%n", "Incorrect phone number.");
            }
              if (phoneNumber == confirmedPhoneNumber){
                    pin = newPin;
                }

            }

        public void withdraw(int amount, int pinNum) {
    //        System.out.println("Enter withdraw amount, then enter pin");

             if (pin == pinNum) {
                if (amount < 0) {
                    System.out.println("invalid withdrawal");
                }
                else if (amount <= balance) {
                    balance -= amount;
                }
                else if (amount > balance) {
                    System.out.println("above balance");
                }
            }
           if (pin != pinNum) {
                System.out.println("invalid pin");

            }
        }

    }

    public static class AccountInteractor {
        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Please set your pin ");
            Account accountOne = new Account(input.nextInt());

            System.out.printf("Welcome%n%s%n%s%n%s%n",
                    "press 1 to deposit",
                    "press 2 to withdraw",
                    "press 3 to check your balance");
            int press = input.nextInt();

            if (press == 1){
                System.out.println("Enter deposit amount: ");
            accountOne.deposit(input.nextInt());}
            else if (press == 2) {
                System.out.println("enter withdraw amount, then enter pin");
            accountOne.withdraw(input.nextInt(), input.nextInt());
            }
            else if (press == 3) {
            System.out.println( accountOne.getBalance());
        }


        }
    }
}
