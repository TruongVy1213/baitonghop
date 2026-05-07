package Composite;

public class Manager implements Payee{
    private String name;

    Manager(String name){
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("pay expenses Manager " + name + " amount: " + amount);
    }
}
