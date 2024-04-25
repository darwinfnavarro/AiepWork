import java.util.HashSet;
import java.util.Set;

public class BankObservable implements Observable {

    Set <Observer> observerSet = new HashSet<>();


    @Override
    public void addObserver(Observer o) {

        observerSet.add(o);

    }

    @Override
    public void deleteObserver(Observer o) {

        observerSet.remove(o);

    }

    @Override
    public void notifyObserver() {

        for (Observer observer: observerSet){

            observer.update();

        }

    }
}
