package Decorator;

public class Client {
    public static void main(String[] args) {
        Component circle1 = new RedBorder(new Circle());
        Component circle2 = new RedBorder(new Bold(new Circle()));
        Component circle3 = new Bold(new Circle());
        circle1.draw();
        circle2.draw();
        circle3.draw();
    }
}