package Adapter;

public class CarPriceCalculator implements PriceCalculator{
    private double carPrice;

    public CarPriceCalculator(double carPrice){
        this.carPrice = carPrice;
    }
    @Override
    public double calculatorPrice() {
        return carPrice * 2;
    }
}
