package Assignment;

public class BooleanInJava {
    private boolean isOn;
    public boolean isOn(int num){
        return isOn;    }

    public static void main(String[] args) {
//        String word = "yes";
//        int num = 37;
//        boolean check = num == 33;
//        if (check ==  false){
//            System.out.println("flow rivers of living waters.");
//            System.out.println(check);
//        }
//         check = word == "yes";
//        if(check == false){
//            System.out.println("we love money");
//            System.out.println(check);
//    }
//            boolean confirm = (1==1);
//            boolean reTest = (1!=1);
//            System.out.println( confirm);
//            System.out.println(reTest);

        boolean equal = ("house" == "ouse");
        boolean unEqual = (0 == 1);
//        System.out.println( equal );
    if (equal){
        System.out.println("Equal");}
    else if (!equal){
        System.out.println( "hello world");
    }
    int h = (int) 0.9;
        System.out.println(h);
        double g = 1.22598e-3;
        System.out.println(g);
        int counter = 1;
        while (counter <5) {
            long time = System.currentTimeMillis();
            System.out.println(time);
            counter ++;
        }
    }
}
