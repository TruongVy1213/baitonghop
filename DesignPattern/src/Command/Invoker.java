package Command;

public class Invoker {
    private Command command;

    Invoker(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
