package ChibuzoBuzoBuzo;

public class Account {
    private String name;
    private double balance;
    private int age;
    private long accountNumber;

    public void Account (String name, int age, int balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
    public void setAge(int age){
        this.age = age;
        if (age >= 18){
            this.age = age;
            System.out.println("valid age");
//            if (age < 18) {
//                System.out.println("underage");
//            }
        }
    }
    public int getAge (){
        return age;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name){
    this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double cash){
        if (cash > 0 ){
            balance += cash;
            System.out.println("valid deposit of " + cash );
        }
        else if (cash < 0 ) {
            System.out.println(" invalid");

        }
    }
    public void withdrawal (double amount){


         if (amount > balance){
            System.out.println("invalid withdrawal above balance  " + amount);
        }
        else if (balance < 0){
            System.out.println("invalid withdrawal, insufficient funds  "+ amount);

        }
       else if (balance > 0) {
             balance -= amount;
             System.out.printf("valid withdrawal of %.2f%n", amount);
         }
    }
}
