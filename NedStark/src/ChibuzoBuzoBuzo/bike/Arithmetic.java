import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();

        int sum = one + two + three;
        int average = sum / 3;
        int product = one * two * three;

        if ( one > two ){
            System.out.println("this is the largest number " + one);
        }
        else if (two > three){
            System.out.println("lasgere");
        }
    }
}
