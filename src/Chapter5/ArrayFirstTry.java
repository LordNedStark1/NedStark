package Chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirstTry {
    public static void main(String[] args) {
//        int num [] = {76,24,36,48,59};
//
//       for (int count =0; count < num.length; count++)
//        System.out.println(num[count]);
//
//        Scanner sc = new Scanner(System.in);
//        int num = new int[];
//        for (int counter = 0; counter < num.lenght; counter++ );
//        System.out.println("Enter the numbers");
//         num = sc.nextInt();
        String friends[] = new String[5];
        String[] allFriends ={"ben", "ned", "john", "luke", "mark"};

        ArrayList <String> friendsList =new ArrayList<>();
        ArrayList <String> friendsList2 =
                new ArrayList<>(Arrays.asList("ben", "ned", " john","luke","mark", "loveth"));
        System.out.println(allFriends[4]);
        System.out.println(friendsList2.get(5));
        System.out.println(allFriends.length);
        System.out.println( friendsList2.size());
        friendsList2.add("haven");
        System.out.println(friendsList2.get(6));
//        friendsList2
                
    }
}
