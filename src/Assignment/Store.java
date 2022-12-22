package Assignment;

public class Store {
    private static int singleBookPrice = 100;
    private static int singleBagPrice = 2000;
    private static int singleShoePrice = 1000;

    public int actualBookPrice() {
        return singleBookPrice;
    }

    public int actualBagPrice() {
        return singleBagPrice;
    }

    public int actualShoePrice() {
        return singleShoePrice;
    }
}
