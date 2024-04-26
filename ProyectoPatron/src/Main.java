public class Main {
    public static void main(String[] args) {

        BankObservable observable_dngd = new BankObservable();
        observable_dngd.addObserver_dngd(new Observer1());

        observable_dngd.setInterestRate_dngd(4.5);
        observable_dngd.addNewAmount_dngd(200000);

        observable_dngd.setInterestRate_dngd(8.3);
        observable_dngd.addNewAmount_dngd(50000);

        observable_dngd.setInterestRate_dngd(2.3);
        observable_dngd.addNewAmount_dngd(28492);

    }
}