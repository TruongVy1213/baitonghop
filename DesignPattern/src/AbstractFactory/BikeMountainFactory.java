package AbstractFactory;

public class BikeMountainFactory extends BikeAbstractFactory{
    @Override
    public Frame CreateFrame() {
        return new MountainFrame();
    }

    @Override
    public Wheel CreateWheel() {
        return new MountainWheel();
    }
}
