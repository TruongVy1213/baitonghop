package Adapter;

public class Client {
    public static void main(String[] args) {
        PriceCalculator car = new CarPriceCalculator(10);
        PriceCalculator truck = new TruckPriceCalculator(10);
        UKCarPriceCalculator uk = new UKCarPriceCalculator(10);
        PriceCalculator calc = new UKCarPriceAdapter(uk);

        System.out.println("Car price: " + car.calculatorPrice() + " USD");
        System.out.println("Truck price: " + truck.calculatorPrice() + " USD");
        System.out.println("UK Car price: " + calc.calculatorPrice() + " USD");
    }
}
