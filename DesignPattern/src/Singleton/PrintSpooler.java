package Singleton;

public class PrintSpooler {
    private static PrintSpooler instance = null;

    private PrintSpooler(){
        init();
    }

    private void init(){
    }

    public static PrintSpooler getInstance(){
        if (instance == null){
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String name){
        System.out.println("printing: " + name);
    }
}
