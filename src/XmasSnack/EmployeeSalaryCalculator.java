package XmasSnack;

import java.util.Scanner;

public class EmployeeSalaryCalculator {


    Scanner input = new Scanner(System.in);

    public void calculateGrossPay(){
        System.out.println("Enter the number of hours worked: ");
        int hoursWorked = input.nextInt();
        if (hoursWorked < 40){
            System.out.println(" YOU ARE FIRED!!!");
        }
        else if (hoursWorked == 40 ){
            double grossPay = 40 * 100;
            System.out.println("The gross pay for 40 hours is "+ grossPay);
        }
        else if (hoursWorked > 40){
            int extraHours = hoursWorked - 40;
        double actualWorkHoursPay = 40 * 100;
        double extraHoursPay = extraHours * 150;
        double grossPay = actualWorkHoursPay + extraHoursPay;
            System.out.println("The pay for regular hours is $100.\n " +
                    "The pay for extra hours is $150. \n\n" +
                    "The extra hours worked is "+ extraHours + "\nThe gross pay is:  " + grossPay + "\n");
        }
    }
}
