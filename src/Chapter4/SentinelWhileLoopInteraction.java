package Chapter4;

import java.util.Scanner;

public class SentinelWhileLoopInteraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SentinelWhileLoop program = new SentinelWhileLoop();

        program.entryPoint();
        int option = input.nextInt();
        while (option != 0 ){
            program.menu();
            program.entryPoint();
             option = input.nextInt();
        }

    }
}
