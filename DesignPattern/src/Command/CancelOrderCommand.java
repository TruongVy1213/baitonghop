package Command;

public class CancelOrderCommand implements Command{
    private String item;
    private Receiver receiver;

    CancelOrderCommand(String item, Receiver receiver){
        this.item = item;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cancelOrder(item);
    }
}
