package tdd;

public class AccountTwo {
    private double balance;
    private int pin;
    private int accountNumber;

    public AccountTwo(double initialDeposit, int pin){
        balance = initialDeposit;
        this.pin = pin;
    }
    public AccountTwo(int accountNumber){
        this.accountNumber = accountNumber;

    }

    public double getBalance() {
                return balance;
    }

    public void withdraw(double amount, int pin) {
        if ( this.pin == pin && amount > 0) {
            balance = balance - amount;
        }
        else {
            System.out.println(" invalid");
        }

    }

    public void deposit(int accountNumber,double amount) {
        if (this.accountNumber == accountNumber) {
            balance = balance + amount;
        }
        else{
            System.out.println(" invalid acctNum");
        }
    }


}
