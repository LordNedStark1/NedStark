package XmasSnack;

import java.util.Scanner;

public class DaysOfChristmasAnother {
Scanner input = new Scanner(System.in);
    public void switchSection(){
        System.out.println("Enter a of christmas from 1 - 12");
        for (int day = input.nextInt(); day <= 12; day++) {
            System.out.println("On the ");

            switch (day) {
                case 12:
                    System.out.println(" Twelve ");
                    break;
                case 11:
                    System.out.println(" Eleventh ");
                    break;
                case 10:
                    System.out.println(" Tenth ");
                    break;
                case 9:
                    System.out.println(" Nineth ");
                    break;
                case 8:
                    System.out.println(" Eight ");
                    break;
                case 7:
                    System.out.println(" Seventh ");
                    break;
                case 6:
                    System.out.println(" Sixth ");
                    break;
                case 5:
                    System.out.println(" Fifth ");
                    break;
                case 4:
                    System.out.println(" Forth ");
                    break;
                case 3:
                    System.out.println(" Third ");
                    break;
                case 2:
                    System.out.println(" Second ");
                    break;
                case 1:
                    System.out.println(" First ");
                    break;
            }
            System.out.println("Day of christmas my true love gave to me");

            switch (day) {
                case 1:
                    firstDay();
                    break;
                case 2:
                    secondDay();
                    break;
                case 3:
                    thirdDay();
                    break;
                case 4:
                    forthDay();
                    break;
                case 5:
                    fifthDay();
                    break;
                case 6:
                    sixthDay();
                    break;
                case 7:
                    seventhDay();
                    break;
                case 8:
                    eighthDay();
                    break;
                case 9:
                    ninethDay();
                    break;
                case 10:
                    tenthDay();
                    break;
                case 11:
                    eleventhDay();
                    break;
                case 12:
                    twelvethDay();
                    break;
            }
        }
    }
    public void firstDay(){
        System.out.println("And a partridge in a pear tree\n");
    }
    public void secondDay(){
        System.out.println("""                           
                Two Turtle Doves
                And a partridge in a pear tree
                """);    }
    public void thirdDay(){
        System.out.println("""             
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
    public void forthDay(){
        System.out.println("""
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);    }
    public void fifthDay(){
        System.out.println("""
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
    public void sixthDay(){
        System.out.println("""
                Six Geese a laying
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
    public void seventhDay(){
        System.out.println("""
                 Seven Swans a swimming
                Six Geese a laying
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);    }
    public void eighthDay(){
        System.out.println("""
                Eight Maids a milking
                Seven Swans a swimming
                Six Geese a laying
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
    public void ninethDay(){
        System.out.println("""
                 Nine Ladies Dancing
                Eight Maids a milking
                Seven Swans a swimming
                Six Geese a laying
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);

    }
    public void tenthDay(){
        System.out.println("""
                 Ten lords a-leaping Nine Ladies Dancing
                 Nine Ladies Dancing
                Eight Maids a milking
                Seven Swans a swimming
                Six Geese a laying
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
    public void eleventhDay(){
        System.out.println("""
                 Eleven Pipers piping
                 Ten lords a-leaping Nine Ladies Dancing
                 Nine Ladies Dancing
                Eight Maids a milking
                Seven Swans a swimming
                Six Geese a laying
                Five Golden Rings
                Four Calling Birds
                Three French Hens
                Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
    public void twelvethDay(){
        System.out.println("""
                 Twelve Drummers Drumming
                 Eleven Pipers piping
                Ten lords a-leaping
                Nine Ladies Dancing
                Eight Maids a milking
                Seven Swans a swimming
                Six Geese a laying
                Five Golden Rings
                 Four Calling Birds
                Three French Hens
                 Two Turtle Doves
                And a partridge in a pear tree
                """);
    }
}
