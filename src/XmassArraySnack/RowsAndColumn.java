package XmassArraySnack;

public class RowsAndColumn {
    public static void main(String[] args) {
        for (int column= 1; column<= 6; column++){
            for(int row = 1; row<= column; row++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int space = 6;
        for(int column= 1; column <=7; column++){
            for(int row =1; row<= space; row++){
                System.out.print(" ");
            }
            for (int asterisk = 1; asterisk<= column; asterisk++) {
                System.out.print(" *");
            }
            System.out.println();
            space--;
        }
//        int space2 =3;
            for (int column =1; column<= 5; column++){
                for(int row=1; row<= 4; row++){
                    System.out.print(" ");
                }
                for (int asterisk = 1; asterisk<= 3; asterisk++){
                    System.out.print(" *");
                }
                System.out.println();

            }

            int counter=1;
        do {
            System.out.printf("%d ", counter);
            ++counter;
        } while (counter <= 10);

        System.out.println("done");

    }
//        int space = 1;
//
//        for (int row =1; row<= 4; row++){
//            for(int columns =1; columns<= space; columns++ ){
//                System.out.print(" ");
//            }
//            for (int asterisk = 1; asterisk <= 5; asterisk++ ) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            space--;
//        }
//
//        int space = 3;
//        for (int column =1; column <= 4; column++){
//            for (int row =1; row <= space; row++){
//                System.out.print(" ");
//            }
//            for(int asterisk = 1; asterisk <= 1; asterisk += 2){
//                System.out.print("*");
//            }
//            System.out.println();
//            space--;
//        }
//                int space = 5;
//                for (int column = 1; column <=6; column++){
//                    for (int row = 1; row<= space; row++){
//                        System.out.print(" ");
//                    }
//                    for (int asterisk = 5; asterisk >= 1; asterisk--){
//                        System.out.print(" * ");
//                    }
//                    System.out.println();
//                    space --;
//                }
//    }
}
