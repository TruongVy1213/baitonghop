package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        BikeAbstractFactory factory = BikeFactory.getBike(BikeType.MOUNTAIN);

        Frame frame = factory.CreateFrame();
        frame.create();
        Wheel wheel = factory.CreateWheel();
        wheel.create();
    }
}
