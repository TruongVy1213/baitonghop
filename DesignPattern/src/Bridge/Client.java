package Bridge;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(new GreenColor());
        Shape shape2 = new Rectangle(new RedColor());
        Shape shape3 = new Rectangle(new BlueColor());

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
