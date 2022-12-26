package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculation {
   static int [] collect = new int[5];

   public static int[] fillinArray(){

       Scanner input = new Scanner(System.in);

//        int collect[] = {1,2,3,4,5,};
       System.out.println("input 5 numbers");
       int number = input.nextInt();
       int number2 = 0;
       for (int i = 0; i < collect.length; i++) {
           number2 = number%10;
           collect[collect.length - 1 - i] = number2;
           number /= 10;
       }
       return collect;
   }

    public static void main(String[] args) {

        int[] numbers = fillinArray();
        System.out.println(Arrays.toString(collect));

        if (collect[0] == 5){
            System.out.println("it is a verve card");
        } else if (collect[0]== 3) {
            System.out.println("its a master card");

        } else if (collect[0]== 1 && collect[1] == 2) {
            System.out.println("its a new front");
        } else {
            System.out.println("not a valid card");
        }

    }
}
