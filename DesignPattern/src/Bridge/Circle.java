package Bridge;

public class Circle extends Shape{
    public Circle(ColorImplementation color){
        super(color);
    }
    @Override
    public void draw() {
        System.out.print("Circle with: ");
        color.applyColor();
    }
}
