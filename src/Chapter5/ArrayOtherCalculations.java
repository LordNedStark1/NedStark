package Chapter5;

import java.util.Arrays;

public class ArrayOtherCalculations {
    static int [] collectingEverySecondNumber= {1,2,0,3,4,5,6,7,0};
    static int [] multipleOfNumbersArray ;


    public static void additionOfOther(){
        for (int i = 1; i < collectingEverySecondNumber.length; i+=2);
//        int number = collectingEverySecondNumber[collectingEverySecondNumber-1 - i];
    }

    public static void multiplyEverySecondArrayNumber() {
        multipleOfNumbersArray = new int[9];
        int calculateArray = 0;
        int calculateArrayTotal = 0;
        int multipliedNumber;
        for (int i = 0; i < collectingEverySecondNumber.length; i++) {
            multipliedNumber = collectingEverySecondNumber[i] * 2;
            if (multipliedNumber > 9) {
                multipliedNumber = (multipliedNumber % 10) + 1;
                multipleOfNumbersArray[i] = multipliedNumber;
            } else {
                multipleOfNumbersArray[i] = multipliedNumber;
            }
        }
        System.out.println(Arrays.toString(multipleOfNumbersArray));

        for(int i = 0; i< multipleOfNumbersArray.length; i++ ){
             calculateArray = multipleOfNumbersArray[i];
            calculateArrayTotal += calculateArray;
        }
        System.out.println(calculateArrayTotal);
    }


    public static void main(String[] args) {
        multiplyEverySecondArrayNumber();
    }
}
