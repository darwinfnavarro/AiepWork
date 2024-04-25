public class Main {
    public static void main(String[] args) {

        BankObservable observable= new BankObservable();
        observable.addObserver(new Observer1());
        observable.addObserver(new Observer1());
        observable.addObserver(new Observer1());

        observable.notifyObserver();

        System.out.println(observable.observerSet);


    }
}