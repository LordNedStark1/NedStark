package Oop;

public class Dog extends Animal{
    private  String tail;


    public void bite(){
        System.out.println("Make noise and i bite you!!!!!!");
    }

    @Override
    public String makeSound(){
        return  "bark bark bark!!!!!";
}
}
