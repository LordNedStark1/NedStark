//package tdd;
//
//import java.util.Scanner;
//
//public class RunWayLength {
//    private double total;
//
//
//    public RunWayLength() {
//    }
//
//
//    public void CalculateRunWayLength(int velocity, double acceleration) {
//        double length = (velocity * velocity) / (2 * acceleration);
//        total = length;
//    }
//
//    public double getAnswer() {
//
//        return total;
//    }
//
//    static Scanner input = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String num;
//        int a =0;
//        int b=  0;
//        System.out.println("press 1 to continue, then choose chose a or b");
//        int na =input.nextInt();
//        while (na ==1){
//        num = input.next();
//        switch (num) {
//            case "a":
//                a++;
//                break;
//            case "b":
//                b++;
//                break;
//        }
//            System.out.println("press 1 to continue, then choose chose a or b");
//             na =input.nextInt();
//        }
//            System.out.println(" a count "+a+ "\n b count " + b );
//        }
//
//        int[][] array = {{1, 2, 3, 4}, {9, 8, 7, 6}, {5, 4, 3, 6},{6, 5, 4, 3}};
//
//        for (int column = 0; column < 4; column++){
//            for (int row =0; row <4; row++){
//                System.out.print(array[column][row]+"  ");
//            }
//            System.out.println();
//        }
//
//
//    }
//}
//
