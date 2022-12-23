package Chapter4;

import java.util.Scanner;

public class AdditionAndSubtractionApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AddSubtractAppDev program = new AddSubtractAppDev();

        program.entryPoint();
        int option = input.nextInt();
        while (option != 0 ){
            program.menu();
            program.entryPoint();
             option = input.nextInt();
        }

    }
}
