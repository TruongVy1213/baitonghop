package Bridge;

public class Rectangle extends Shape{
    public Rectangle(ColorImplementation color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Rectangle with: ");
        color.applyColor();
    }
}
