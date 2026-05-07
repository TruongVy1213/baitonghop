package AbstractFactory;

public class MountainWheel implements Wheel{
    @Override
    public void create() {
        System.out.println("Tao banh xe leo nui");
    }
}
