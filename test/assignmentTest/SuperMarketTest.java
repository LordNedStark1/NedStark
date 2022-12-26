//package assignmentTest;
//
//import Assignment.Store;
//import Assignment.SuperMarket;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class SuperMarketTest {
//    SuperMarket attendant;
//    Store storeKeeper;
//
//    @BeforeEach
//    void instances() {
//        attendant = new SuperMarket();
//        storeKeeper = new Store();
//    }
//
//    @Test
//    void storeBookCalculator() {
//        attendant.bookPriceCalculator(2);
//        assertEquals(200, attendant.bookPrice());
//
//    }
//
//    @Test
//    void storeBagCalculator() {
//        attendant.bagPriceCalculator(2);
//        assertEquals(4000, attendant.bagPrice());
//    }
//
//    @Test
//    void storeShoeCalculator() {
//        attendant.shoePriceCalculator(2);
//        assertEquals(2000, attendant.shoePrice());
//    }
//
//    @Test
//    void checkBookPriceTwice() {
//        attendant.bookPriceCalculator(2);
//        assertEquals(200, attendant.bookPrice());
//        attendant.bookPriceCalculator(2);
//        assertEquals(200, attendant.bookPrice());
//    }
//
//    @Test
//    void checkForMinusBookPriceCheck() {
//        attendant.bookPriceCalculator(10);
//        assertEquals(1000, attendant.bookPrice());
//        attendant.bookPriceCalculator(-5);
//        assertEquals(0, attendant.bookPrice());
//    }
//
//    @Test
//    void StoreTest() {
//        assertEquals(100, storeKeeper.actualBookPrice());
//        assertEquals(2000, storeKeeper.actualBagPrice());
//        assertEquals(1000, storeKeeper.actualShoePrice());
//    }
////    @Test
////    void menuOption(){
////        attendant.menuOptions()
////    }
////    @Test
////    void menuprompt(){
////       assertEquals("Welcome to: NED-STARK SUPERMARKET. "+
////               "We offer the best of quality and class.", attendant.menu());
////    }
//
//    @Test
//    void bagPriceCalculator() {
//        attendant.bagPriceCalculator(2);
//        assertEquals(4000, attendant.bagPrice());
//        attendant.bagPriceCalculator(1);
//        assertEquals(2000, attendant.bagPrice());
//        attendant.bagPriceCalculator(-5);
//        assertEquals(0, attendant.bagPrice());
//    }
//
//    @Test
//    void shoePriceCalculator() {
//        attendant.shoePriceCalculator(2);
//        assertEquals(2000, attendant.shoePrice());
//        attendant.shoePriceCalculator(1);
//        assertEquals(1000, attendant.shoePrice());
//        attendant.shoePriceCalculator(-5);
//        assertEquals(0, attendant.shoePrice());
//    }
//
//    @Test
//    void menuOptionSelection() {
//        attendant.menuOptions(1);
//        assertEquals("Book menu", attendant.bookMenu());
//        assertEquals(200, attendant.bookPrice());
//        attendant.menuOptions(2);
//        assertEquals("Bag menu", attendant.bagMenu());
//        assertEquals(4000, attendant.bagPrice());
//        attendant.menuOptions(3);
//        assertEquals("Shoe menu", attendant.shoeMenu());
//        assertEquals(2000, attendant.shoePrice());
//    }
//
//    @Test
//    void bookShoeBagPurchaseAndPayment() {
//        attendant.bagPurchase();
//        attendant.shoePurchase();
//        attendant.bookPurchase();
//        int payable = attendant.totalItemPurchase();
//        assertEquals(6200, payable);
//    }
//
//    @Test
//    void paymentMenu() {
//        attendant.bagPurchase();
//        attendant.shoePurchase();
//        attendant.bookPurchase();
//        int payable = attendant.totalItemPurchase();
//        assertEquals(0, attendant.paymentMenu());
//    }
//
//    @Test
//    void paymentHigher() {
//        attendant.bagPurchase();
//        attendant.shoePurchase();
//        attendant.bookPurchase();
//        int payable = attendant.totalItemPurchase();
//        assertEquals("Payment amount is above  item price", attendant.paymentMenu());
//    }
//}