package Composite;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        System.out.println("Group:");
        var group = new SalesTeam();
        Manager manager1 = new Manager("Hao");
        Salesperson salesperson1 = new Salesperson("Phong",manager1);
        group.addMembers(salesperson1);
        group.addMembers(manager1);
        group.payExpenses(1000);

        System.out.println("team 1");
        var team1 = new SalesTeam();
        Manager manager2 = new Manager("A");
        Salesperson salesperson2 = new Salesperson("H", manager2);
        team1.addMembers(salesperson2);
        team1.addMembers(manager2);
        team1.deleteMember(manager2);
        team1.payExpenses(2000);

    }
}
