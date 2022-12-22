package Assignment;

public class SuperMarketInteractionCenter {
    public static void main(String[] args) {
        SuperMarket attendants = new SuperMarket();
//        attendants.menuPrompt();
        System.out.println("Welcome to: NED-STARK SUPERMARKET.\n " +
                "We offer the best of quality and class.\n" +
                "press 1 to buy books \n" +
                "press 2 to buy bags\n" +
                "press 3 to buy shoes\n" +
                "press 4 to end\n");
        attendants.menuOptions();
    }
}
