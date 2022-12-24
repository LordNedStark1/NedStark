//package moveFiles;
//
//
//import chapterTwo.SwtichStatement;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AccountTest {
//
//    @Test
//    public void depositMoneyTest() {
//        //given that malik has an account
//      Accounts malikAccount = new Accounts();
//        //when malik deposit 23
//        malikAccount.deposit(23);
//        //check that the balance is 23
//        int balance  = malikAccount.getBalance();
//        assertEquals(23, balance);
//    }
//    @Test
//    public void depositTwiceTest(){
//        //given malik has an account;
//        SwtichStatement.Account malikAccount = new SwtichStatement.Account();
//        //given there is 300 in the account;
//        malikAccount.deposit(300);
//        int balance = malikAccount.getBalance();
//        assertEquals(300,balance);
//
//        //when i try to deposit 200;;
//
//        malikAccount.deposit(200);
//
//        //check that balance is 500
//        balance = malikAccount.getBalance();
//        assertEquals(500, balance);
//        }
//
//        @Test
//    public void depositNegativeAmount(){
//        //given i have an account with zero balance;
//        SwtichStatement.Account malikAccount = new SwtichStatement.Account();
//       //when i try to deposit negative amount (-2300)
//       malikAccount.deposit(-2300);
//       //check that balance is zero
//       int balance = malikAccount.getBalance();
//       assertEquals(0, balance);
//
//    }
//        @Test
//    public void withdraw(){
//        SwtichStatement.Account malikAccount =new SwtichStatement.Account(1234);
//        malikAccount.deposit(6000);
//        int balance = malikAccount.getBalance();
//        assertEquals(6000, balance);
//        malikAccount.withdraw(4000, 1234);
//        balance = malikAccount.getBalance();
//        assertEquals(2000, balance);
//        }
//
//        @Test
//    public void secondWithdraw (){
//        SwtichStatement.Account malikAccount =new SwtichStatement.Account(1234);
//        malikAccount.deposit(3500);
//        int balance = malikAccount.getBalance();
//        assertEquals(3500, balance);
//        malikAccount.withdraw(4000, 1234);
//        balance = malikAccount.getBalance();
//        assertEquals(3500, balance);
//        }
//
//        @Test
//    public void withdrawWithMinus(){
//        SwtichStatement.Account malikAccount =new SwtichStatement.Account(1234);
//        malikAccount.deposit(3500);
//        int balance = malikAccount.getBalance();
//        assertEquals(3500, balance);
//        malikAccount.withdraw(-2000,1234);
//        balance = malikAccount.getBalance();
//        assertEquals(3500, balance);
//        }
//    @Test
//    public void withdrawFromZeroBalance(){
//        SwtichStatement.Account malikAccount =new SwtichStatement.Account(1234);
//        int balance = malikAccount.getBalance();
//        assertEquals(0, balance);
//        malikAccount.withdraw(2000,1234);
//        balance = malikAccount.getBalance();
//        assertEquals(0, balance);
//    }
//        @Test
//    public void withdrawWithPin(){
//        SwtichStatement.Account malikAccount =new SwtichStatement.Account(9887);
//        malikAccount.deposit(500);
//        int balance = malikAccount.getBalance();
//        assertEquals(500, balance);
//        malikAccount.withdraw(300,3332 );
//        balance = malikAccount.getBalance();
//        assertEquals(500, balance);
//        }
//    @Test
//    public void pinChange(){
//        SwtichStatement.Account malikAccount = new SwtichStatement.Account( 5555, 5585);
//        malikAccount.changePin( 5585,5545);
//
//    }
//
//}
//
