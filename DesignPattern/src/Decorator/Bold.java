package Decorator;

public class Bold extends ShapeDecoration{

    Bold(Component component){
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        bold();
    }

    void bold(){
        System.out.println("bold");
    }
}
