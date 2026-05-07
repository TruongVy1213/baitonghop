package Facade;

public class Client {
    public static void main(String[] args) {
        System.out.println("Guest 1:");
        VacationFacade.getIntance().option2();
        System.out.println("______________________________________");
        System.out.println("Guest 2:");
        VacationFacade.getIntance().option3();
    }
}
