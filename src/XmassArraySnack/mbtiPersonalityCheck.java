package XmassArraySnack;

import java.util.Scanner;

public class mbtiPersonalityCheck {
    private int yes;
    private int no;

    Scanner input = new Scanner(System.in);
//    MbtiQuestionSection mbtiTest = new MbtiQuestionSection();

    public void yesNo() {
        System.out.println("true or false");
        boolean option = input.nextBoolean();
        if (option) {
            yes++;
        } else if (!option) {
            no++;
        }else{
            yesNo();
        }
    }

    public String question0(){
        return "you regularly make new friends" ;
    }
    public String question1(){
        return "(1) spend a lot of your free time explaining various random topics that pique your interest";

    }
    public String question2(){

        return  "(2) seeing other people cry can easily make you feel like you want to cry too";
    }
    public String question3(){
        return "(3) you often make a backup plan for a backup plan ";
    }
    public String question4(){
        return "(4) you usually stay calm, even under alot of pressure";
    }
    public String question5(){
        return "(5) At social events, you rarely try to introduce yourself to new\n" +
                " people and mostly talk to the ones you already know";
    }
    public String question6(){
        return "(6) you prefer to completely finish one project before starting another";
    }
    public String question7(){
        return "(7) you are very sentimental";
    }
    public String question8(){
        return "(8) you like to use organizing tools like schedules and list";
    }
    public String question9(){
        return "(9) A small mistake can cause you to doubt your overall abilities and knowledge";
    }
    public String question10(){
        return "(10) You feel comfortable just walking up to someone you find interesting and strike up a conversation";
    }

    public void menu(){
      System.out.println("Welcome to MBTI personality test.\n " +
              "Press 1 to take test \n" +
              "or press 2 to end");
  }

    public void mbtiQuestions() {

        String variable[] = new String[19];

        variable[0] = question0();//yesNo();
        variable[1] = question1();//yesNo();
        variable[2] = question2();//yesNo();
        variable[3] = question3();yesNo();
        variable[4] = question4();yesNo();
        variable[5] = question5();yesNo();
        variable[6] = question6();yesNo();
        variable[7] = question7();yesNo();
        variable[8] = question8();yesNo();
        variable[9] = question9();yesNo();
        variable[10] = question10();//yesNo();


        for (int i = 0; i < 10; i++) {

        }
    }

    public void yesNoTotal(){
        System.out.println("total of yes is " +yes);
        System.out.println("total of no is "+ no);
        if (yes>no){
            System.out.println("you are an introvert");
        } else if (no>yes) {
            System.out.println("you are an extrovert");
        }else{
            System.out.println("you are balanced");
        }
    }


//       while (option == "2"){
//        break;
//        System.exit();
//    }
//        while(option != "1"){
//        mbti.menu();
//        option = input.next();
//    }




//        System.out.println("Enter a number to answer. ");
//            System.out.println("number " + i + " is " + variable[i]);
//    public void otherMethod() {
//        String[] checkout = new String[5];
//        System.out.println("Enter a number to answer. ");
//        for (int i = 0; i < variable.length; i++) {
//            System.out.println("number " + i + " is " + variable[i]);
//            System.out.println("enter the number  " + i);
//            variable[i] = input.next();
//        }
//        for (int i = 1; i < checkout.length; i++) {
//            System.out.println("number " + i + " is " + checkout[i]);
//        }
//        String [] answer= new String[19];
//        answer[0] = input.next();



}
