package model;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (isCorrectEmail()) {
            this.email = email;
        }
    }
    public static boolean isCorrectEmail(){
        return false;
    }
}
