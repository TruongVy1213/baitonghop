package Adapter;

public class UKCarPriceAdapter implements PriceCalculator{
    private UKCarPriceCalculator ukCalculator;

    public UKCarPriceAdapter(UKCarPriceCalculator ukCalculator){
        this.ukCalculator = ukCalculator;
    }

    @Override
    public double calculatorPrice() {
        return ukCalculator.getPrice();
    }
}
