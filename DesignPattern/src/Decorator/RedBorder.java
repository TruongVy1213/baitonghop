package Decorator;

public class RedBorder extends ShapeDecoration{

    RedBorder(Component component){
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        color();
    }

    public void color(){
        System.out.println("RED");
    }
}
