package AbstractFactory;

public class RoadWheel implements Wheel{
    @Override
    public void create() {
        System.out.println("Tao banh xe duong bo");
    }
}
