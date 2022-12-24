package chapterTwo;

public class AccountThree {
    private double balance;


    public  double getBalance() {
        return balance;
    }

    public  void deposit(double cash) {
        balance += cash;
    }


    public static void transfer(AccountThree userAccount1, double amountToTransfer, AccountThree userAccount2) {

        if (userAccount1.getBalance() > amountToTransfer) {
             userAccount1.withdraw(amountToTransfer) ;
             userAccount2.deposit(amountToTransfer) ;
            System.out.printf("%nAccount balance is: %.2f%nAccount1 balance is: %.2f %n",
                                userAccount1.getBalance(), userAccount2.getBalance());
        } else {
            System.out.println("Invalid transfer amount");
        }
    }

    private void withdraw(double amount) {
        balance -= amount;
    }


}