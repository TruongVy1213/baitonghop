package AbstractFactory;

public class BikeFactory {
    private BikeFactory(){};

    public static BikeAbstractFactory getBike(BikeType type){
        switch (type){
            case ROAD : {
                return new BikeRoadFactory();
            }
            case MOUNTAIN: {
                return new BikeMountainFactory();
            }
            default:
                throw new IllegalArgumentException("Unexpected value: " + type);
        }
    }
}
