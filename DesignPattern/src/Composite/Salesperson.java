package Composite;

public class Salesperson implements Payee{
    private String name;
    private Manager manager;

    Salesperson(String name, Manager manager){
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("pay expenses Salespeson " + name + " amount: " + amount);
    }
}
