package Adapter;

public class TruckPriceCalculator implements PriceCalculator{
    private double truckPrice;

    public TruckPriceCalculator(double truckPrice){
        this.truckPrice = truckPrice;
    }
    @Override
    public double calculatorPrice() {
        return truckPrice * 3;
    }
}
