package XmasSnack;

import java.util.Scanner;

public class XmasInteractor {
    public static void main(String[] args) {
        DaysOfChristmasAnother xmas =new DaysOfChristmasAnother();
        Scanner input = new Scanner(System.in);

        System.out.println("Days of christmas. press any key or press -1 to exit");
        String option = input.next();

        while (option != "-1"){
            xmas.switchSection();

            System.out.println("Days of christmas. press any key or press -1 to exit");
             option = input.next();
        }
    }
}
