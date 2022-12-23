package XmasSnack;

import java.util.Scanner;

public class SalaryCalculatorInteractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeSalaryCalculator cal = new EmployeeSalaryCalculator();

        System.out.println("Welcome to employee gross pay app.\n " +
                "press 1 to calculate.\n" +
                "press 2 to end ");
        int option = input.nextInt();

        while (option != 2 ){
            cal.calculateGrossPay();

            System.out.println("Welcome to employee gross pay app.\n " +
                    "press 1 to calculate.\n" +
                    "press 2 to end\n ");
             option = input.nextInt();
        }
        System.out.println("Thank you for using this app.");
    }
}
