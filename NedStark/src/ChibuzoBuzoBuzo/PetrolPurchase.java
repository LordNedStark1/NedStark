package ChibuzoBuzoBuzo;

public class PetrolPurchase {
    private String location;
    private String petrol;
    private int quantityPurchasedInLitre;
    private double pricePerLitre;
    private double percentageDiscount;

    public void setLocation (String location){
        this.location = location;
    }
    public String getLocation (){
        return location;
    }
    public void setPetrol (String petrol){
        this.petrol = petrol;
    }
    public String getPetrol (){
        return petrol;
    }
    public void setPricePerLitre (double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre (){
        return pricePerLitre;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount (){
        return percentageDiscount;
    }



    public void PetrolPurchase( String location, String petrol, int quantityPurchasedInLitre, double pricePerLitre, double percentageDiscount){
        this.location = location;
        this.petrol = petrol;
        this.quantityPurchasedInLitre = quantityPurchasedInLitre;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;

    }

}
