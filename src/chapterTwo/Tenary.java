package chapterTwo;

import java.util.Scanner;

public class Tenary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();
//        int number3 = input.nextInt();
//        int number4 = input.nextInt();
//            System.out.println("the random number is" + (number > 0 ? "Positive" :"Negative"));
        System.out.println("enter three numbers: ");
        int numOne= input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();
        int age = 36, height = 50;
        System.out.printf("%d%n%d%n%d%n%d%n%d%n", numOne, numTwo, numThree, age, height);
    }

    public static class Comparison {

        public int intAddition(int num1, int num2, int num3){
    //        int total = 0;
    //        for (number: number) {
    //            total += number;
            return  num1 + num2 + num3;
        }

        public int smallestNumber (int num1, int num2, int num3) {
            if (num1 < num2 && num1 < num3) {
                return num1;
            }
            else if (num2 < num1 && num2 < num3){
                return num2;
            }
            else{
                return num3;
            }
        }

        public int product(int num1, int num2, int num3) {
            return num1 * num2 * num3;
        }

        public int largestNumber(int num1, int num2, int num3) {
            if (num1 > num2 && num1 > num3) {
                return num1;
            }
            else if (num2 > num1 && num2 > num3){
                return num2;
            }
            else{
                return num3;
            }
        }

        public int average(int num1, int num2, int num3, int num4) {
            return (num1 + num2 + num3 + num4)/ 4;
        }
    }
}
