package AbstractFactory;

public class BikeRoadFactory extends BikeAbstractFactory{
    @Override
    public Frame CreateFrame() {
        return new RoadFrame();
    }

    @Override
    public Wheel CreateWheel() {
        return new RoadWheel();
    }
}
