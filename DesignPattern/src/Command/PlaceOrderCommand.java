package Command;

public class PlaceOrderCommand implements Command{
    private String item;
    private Receiver receiver;

    PlaceOrderCommand(String item, Receiver receiver){
        this.item = item;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.placeOrder(item);
    }
}
