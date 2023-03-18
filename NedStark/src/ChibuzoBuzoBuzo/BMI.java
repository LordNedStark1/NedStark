package ChibuzoBuzoBuzo;


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kilogram: ");
    double weight = input.nextDouble();

        System.out.println("Enter height in meters:");
    double height = input.nextDouble();

    double BMI = weight / (height *height);

        System.out.printf(" BMI is : %.4f%n", BMI);
    }
}

