package Adapter;

public class UKCarPriceCalculator {
    private double UKPrice;

    public UKCarPriceCalculator(double UKPrice){
        this.UKPrice = UKPrice;
    }

    public double getPrice(){
        return UKPrice * 10;
    }
}
