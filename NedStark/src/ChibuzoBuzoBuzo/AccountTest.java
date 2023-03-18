package ChibuzoBuzoBuzo;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("John Paul");
        account.setAge(20);
        System.out.printf ("the age is : %d%n", account.getAge());
        System.out.printf("the account name is %s%n ", account.getName());
        account.setAccountNumber(0050156703);
        System.out.printf("your new accouont number is: %d%n", account.getAccountNumber());
        System.out.printf("the initial account balance is: %.2f%n ", account.getBalance());
        account.deposit(4500);
        System.out.printf( "new balance1 is ;  %.2f%n", account.getBalance());
        account.deposit(0);
        System.out.printf( "new balance2 is ;  %.2f%n", account.getBalance());
        account.deposit(-20);
        System.out.printf( "new balance3 is ;  %.2f%n", account.getBalance());
        account.withdrawal(3500);
        System.out.printf( "new balance4 is ;  %.2f%n", account.getBalance());
        account.withdrawal(2000);
        System.out.printf( "new balance5 is ;  %.2f%n", account.getBalance());
        account.withdrawal(-40);
        System.out.printf( "new balance6 is ;  %.2f%n", account.getBalance());
    }
}
