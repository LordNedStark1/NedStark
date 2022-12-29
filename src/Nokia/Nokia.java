package Nokia;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Nokia {
    Scanner scan = new Scanner(System.in);

    public void menu() {
        System.out.println("""
                welcome to te menu
                press 1 for phonebook, 2 of msg
                 3 for call register, 4 to chat""");
        int menuOption = scan.nextInt();

        switch (menuOption) {
            case 1:
                phoneBook();
                break;
            case 2:
                message();
                break;
            case 3:
                callRegister();
                break;
            case 4:
                chat();
            default:
                System.out.println("please try again");
                menu();
        }
    }
    public void showCallDuration(){
        System.out.println("""
                press 1 for last call, 2 for all calls
                3 for received calls, 4 for dialled calls
                5 to clear list, 6 to go back to call register""");

        int callDurationOption = scan.nextInt();
        switch (callDurationOption){
            case 1:
                System.out.println("last call duration");
                System.out.println("press 1 to go back");
                int back = scan.nextInt();
                if(back==1 ) {
                    showCallDuration();
                }
                break;
            case 2:
                System.out.println("all calls duration");
                System.out.println("press 1 to go back");
                 back = scan.nextInt();
                if(back==1 ) {
                    showCallDuration();
                }
                break;
            case 3:
                System.out.println("received calls duration ");
                System.out.println("press 1 to go back");
                back = scan.nextInt();
                if(back==1 ) {
                    showCallDuration();
                }
                break;
            case 4:
                System.out.println("dialled calls duration");
                System.out.println("press 1 to go back");
                back = scan.nextInt();
                if(back==1 ) {
                    showCallDuration();
                }
                break;
            case 5:
                System.out.println("clear timer");
                System.out.println("press 1 to go back");
                back = scan.nextInt();
                if(back==1 ) {
                    showCallDuration();
                }
                break;
            case 6:
                callRegister();
                break;
            default:
                System.out.println("invalid option");
                showCallDuration();
        }
    }

    public void phoneBook() {
        System.out.println("press 1 for search, 2 for service nos.\n" +
                " 3 to add name 4 to erase" +
                "5 to go back to menu");
        int phoneBookOption = scan.nextInt();

        switch (phoneBookOption) {
            case 1:
                System.out.println("Search");
                System.out.println("press 1 to go back, and 2 for menu");
                int option= scan.nextInt();
                switch (option){
                    case 1-> phoneBook();
                    case 2-> menu();
                }
                break;
            case 2:
                System.out.println("Service Nos. ");
                System.out.println("press 1 to go back, and 2 for menu");
                 option= scan.nextInt();
                switch (option){
                    case 1-> phoneBook();
                    case 2-> menu();
                }
                break;
            case 3:
                System.out.println("Add name");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option){
                    case 1-> phoneBook();
                    case 2-> menu();
                }
                break;
            case 4:
                System.out.println(" Erase");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option){
                    case 1-> phoneBook();
                    case 2-> menu();
                }
                break;
            case 5:
                menu();
            default:
                System.out.println("please try again");
                phoneBook();
        }
    }

    public void message() {
        System.out.println("press 1 to write msg, 2 for inbox,\n" +
                " 3 for templates, 5 to go back to menu");
        int msgOption = scan.nextInt();

        switch (msgOption) {
            case 1:
                System.out.println("write msg");
            System.out.println("press 1 to go back, and 2 for menu");
           int option= scan.nextInt();
            switch (option){
                case 1-> message();
                case 2-> menu();
            }
            break;
            case 2:
                System.out.println("Inbox");
            System.out.println("press 1 to go back, and 2 for menu");
            option= scan.nextInt();
            switch (option){
                case 1-> message();
                case 2-> menu();
            }
            break;
            case 3:
                System.out.println("outbox");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option){
                    case 1-> message();
                    case 2-> menu();
                }
                break;
            case 4:
                System.out.println("Templates");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option){
                    case 1-> message();
                    case 2-> menu();
                }
                break;
            case 5:
                menu();
                break;
            default: {
                System.out.println("please try again");
                message();
            }

        }
    }

    public void callRegister() {
        System.out.println("press 1 for missed calls\n" +
                " 2 for received calls\n" +
                " 3 for dialed numbers, 4 for erase call list\n" +
                "5 to show all calls, 6 to go back to menu");

        int callRegOption = scan.nextInt();

        switch (callRegOption) {
            case 1:
                System.out.println("missed calls");
                System.out.println("press 1 to go back, and 2 for menu");
               int option= scan.nextInt();
                switch (option){
                    case 1-> message();
                    case 2-> menu();
                }
                break;
            case 2:
                System.out.println("received calls");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option) {
                    case 1 -> message();
                    case 2 -> menu();
                }
                break;
            case 3:
                System.out.println("dialed numbers");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option) {
                    case 1 -> message();
                    case 2 -> menu();
                }
                break;
            case 4:
                System.out.println("erase call list");
                System.out.println("press 1 to go back, and 2 for menu");
                option= scan.nextInt();
                switch (option) {
                    case 1 -> message();
                    case 2 -> menu();
                }
                break;
            case 5:
                showCallDuration();
                break;
            case 6: menu();
            break;
            default: { System.out.println("please try again");
            callRegister();
            }
        }
    }
    public void chat(){
        System.out.println("press 1 to chat, 2 to go to menu");
        int chatOption = scan.nextInt();
        switch (chatOption) {
            case 1:
                System.out.println("Chat");
                System.out.println("press 1 to go back, and 2 for menu");
                int option= scan.nextInt();
                switch (option) {
                    case 1 -> message();
                    case 2 -> menu();
                }
                break;
            case 2:
                menu();
            default:
                System.out.println("please try again");
                chat();
        }
    }
}