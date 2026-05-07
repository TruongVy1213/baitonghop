package Bridge;

public class RedColor implements ColorImplementation{
    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}
