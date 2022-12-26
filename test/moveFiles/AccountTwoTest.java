package moveFiles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.AccountTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTwoTest {
    AccountTwo account;
    AccountTwo ben;
    AccountTwo ned;
    @BeforeEach
    void instance() {
        account = new AccountTwo(2000, 555);
        ben = new AccountTwo(1234);
        ned = new AccountTwo(1234);

    }
    @Test
   public void openingAccount() {
        // given
//        when
        double balance = account.getBalance();
    // check

        assertEquals(2000,balance);
    }
    @Test
   public void Withdraw(){
        account.withdraw(1500, 555);
        assertEquals(500,account.getBalance());
    }
    @Test
    void wrongPin(){
        account.withdraw(1500, 3333);
        double balance = account.getBalance();
        assertEquals(2000, balance);
    }
    @Test
    void accountNumber(){
        ben.deposit(1234, 3000);
       double balance = ben.getBalance();
        assertEquals (3000,balance);

    }
    @Test
    void transferToAnotherObject(){
        ben.deposit(1234, 6000);
        assertEquals(6000,ben.getBalance());
//        ben.transfer(ned.deposit(1234,3000));
        assertEquals(3000, ben.getBalance());
        assertEquals(3000, ned.getBalance());
    }

}
