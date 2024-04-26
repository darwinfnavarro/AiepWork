import java.util.HashSet;
import java.util.Set;

public class BankObservable implements Observable {

    Set <Observer> observerSet_dngd = new HashSet<>();

    protected double interestRate_dngd = 0;
    protected double amount_dngd = 0;


    @Override
    public void addObserver_dngd(Observer o) {
        observerSet_dngd.add(o);
    }

    @Override
    public void deleteObserver_dngd(Observer o) {
        observerSet_dngd.remove(o);
    }

    @Override
    public void notifyObserver_dngd() {

        for (Observer observer: observerSet_dngd){
            observer.update(interestRate_dngd, amount_dngd);
        }

    }

    public void setInterestRate_dngd(double interestRate) {
        this.interestRate_dngd = interestRate;
    }

    public double getTasaInteres() {
        return interestRate_dngd;
    }

    public void addNewAmount_dngd(double amount) {
        this.amount_dngd = amount;
        notifyObserver_dngd();
    }

}
