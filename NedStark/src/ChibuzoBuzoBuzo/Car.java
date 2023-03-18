package ChibuzoBuzoBuzo;

public class Car {
    private String model;
    private String year;
    private double price;
    private double discountPrice;
    private double discount;

    public Car ( String model,  String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
        if (price > 0){
            this.price = price;

        }

    }
    public void setModel(String name){
        this.model = model;
    }
    public String getModel (){
        return model;
    }
}
