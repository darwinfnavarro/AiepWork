public class Main {
    public static void main(String[] args) {

        BankObservable observable= new BankObservable();
        observable.addObserver(new Observer1());
        observable.addObserver(new Observer1());
        observable.addObserver(new Observer1());

        observable.setTasaInteres(4.5);
        observable.setTasaInteres(8.3);



    }
}