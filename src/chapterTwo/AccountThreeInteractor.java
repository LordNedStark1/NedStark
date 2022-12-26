package chapterTwo;

public class AccountThreeInteractor {
    public static void main(String[] args) {
        AccountThree man =new AccountThree();
        AccountThree woman =new AccountThree();

        man.deposit(4000);
        System.out.println("man balance  "+man.getBalance());

        woman.deposit(100);
        System.out.println("woman balance  " +woman.getBalance());

        AccountThree.transfer(man, 100, woman);

        System.out.println("man new balance " +man.getBalance());
        System.out.println("woman new balance  " +woman.getBalance());

        AccountThree.transfer(man, 1000, woman);

        System.out.println("man new balance " +man.getBalance());
        System.out.println("woman new balance  " +woman.getBalance());

        AccountThree.transfer(woman, 1100, man);

        System.out.println("man new balance " +man.getBalance());
        System.out.println("woman new balance  " +woman.getBalance());
    }
}
