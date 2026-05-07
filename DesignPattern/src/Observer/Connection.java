package Observer;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Subject{
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update(status);
        }
    }
}
