package XmasSnack;

import java.util.Scanner;

public class SalaryCalculatorInteractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeSalaryCalculator cal = new EmployeeSalaryCalculator();

        System.out.println("Welcome to employee gross pay app.\n");
        System.out.println("press 1 to calculate.\n" +
                "press any other key to end ");
        String option = input.next();

        while (option.equals("1")) {
            cal.calculateGrossPay();

            System.out.println("\npress 1 to calculate.\n" +
                    "press any other key to end ");
             option = input.next();
        }
        System.out.println("Thank you for using this app.");
    }
}
