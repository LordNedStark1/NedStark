package XmassArraySnack;

import java.util.Scanner;

public class MbtiPersonalityCheckMain {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mbtiPersonalityCheck mbti = new mbtiPersonalityCheck();

        mbti.menu();
        int option = input.nextInt();

        while (option == 1) {
            mbti.mbtiQuestions();
            mbti.yesNoTotal();

            mbti.menu();
             option = input.nextInt();
        }
    }
}
