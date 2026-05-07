package Command;

public class Receiver {
    public void placeOrder(String item){
        System.out.println("Order place for: " + item);
    }

    public void cancelOrder(String item){
        System.out.println("Order cancel for: " + item);
    }
}