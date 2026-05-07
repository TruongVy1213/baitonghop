package Bridge;

public class Square extends Shape{
    public Square(ColorImplementation color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Square with: ");
        color.applyColor();
    }
}
