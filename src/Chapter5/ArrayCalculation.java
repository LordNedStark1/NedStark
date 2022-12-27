package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculation {
   static int [] collect = new int[8];
    static int [] multipleNumbers= new int[8];
    static Scanner input = new Scanner(System.in);
   public static void fillinArray(){

       System.out.println("input 8 numbers");
       int number = input.nextInt();
       int number2 ;
       for (int i = 0; i < collect.length; i++){
           number2 = number%10;
           collect[collect.length -1 -i] = number2;
           number /= 10;

       }
       System.out.println(Arrays.toString(collect));
//       return collect;
   }
//    public static void multiplyEverySecondArrayNumber() {
//        int total;
//        for (int i = 0; i < collectingEverySecondNumber.length; i++) {
//
//        }
//        public static void multiplyEverySecondArrayNumber () {
//            fillinArray();
//
//            int num2;
//            for (int i = 1; i < collect.length; i += 2) {
//
//                num2 = collect[collect.length - 1 - i];
//                multipleNumbers[i] = num2;
//            }
//            System.out.println(Arrays.toString(multipleNumbers));
//
//        }
//    }
        public void displayTestingMethod () {

            if (collect[0] == 5) {
                System.out.println("it is a verve card");
            } else if (collect[0] == 3) {
                System.out.println("its a master card");

            } else if (collect[0] == 1 && collect[1] == 2) {
                System.out.println("its a new front");
            } else {
                System.out.println("not a valid card");
            }

        }
//    public static void decrementingConditionCheck(){
//
//        int num = input.nextInt();
//        int num2;
//       for(int i = 10; i> arrayNumbers.length; i--){
//       num2 = num % 10;
//           arrayNumbers[arrayNumbers.length-1 -i] = num2;
//       num = num / 10;
//              }
//    }

}
