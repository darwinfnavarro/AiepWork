import java.util.HashSet;
import java.util.Set;

public class BankObservable implements Observable {

    Set <Observer> observerSet = new HashSet<>();

    protected double tasaInteres = 3.1;



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

            observer.update(tasaInteres);

        }

    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
        notifyObserver();
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
}
