package Singleton;

public class Client {
    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();

        spooler.print("file1");
        spooler.print("file2");
    }
}
