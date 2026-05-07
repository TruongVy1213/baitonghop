package Bridge;

public class GreenColor implements ColorImplementation{
    @Override
    public void applyColor() {
        System.out.println("Green");
    }
}
