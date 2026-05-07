package Composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee,Operations {
    private List<Payee> members = new ArrayList<>();

    @Override
    public void payExpenses(int amount) {
        for (Payee payee : members){
            payee.payExpenses(amount);
        }
    }

    @Override
    public void addMembers(Payee payee) {
        members.add(payee);
    }

    @Override
    public void deleteMember(Payee payee) {
        members.remove(payee);
    }
}
