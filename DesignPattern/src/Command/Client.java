package Command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        //Tao command
        Command placeOrder = new PlaceOrderCommand("Laptop", receiver);
        Command cancelOrder = new CancelOrderCommand("Laptop", receiver);

        //Tao nut & gan command
        Invoker placeOrderButton = new Invoker(placeOrder);
        Invoker cancelOrderButton = new Invoker(cancelOrder);

        // Người dùng nhấn nút
        placeOrderButton.click();
        cancelOrderButton.click();
    }
}
