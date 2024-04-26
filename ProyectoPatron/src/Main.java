public class Main {
    public static void main(String[] args) {

        BankObservable bank_dngd = new BankObservable();
        
        bank_dngd.addObserver_dngd(new CreditObserver());

        bank_dngd.setInterestRate_dngd(4.5);
        bank_dngd.addNewAmount_dngd(200000);

        bank_dngd.setInterestRate_dngd(8.3);
        bank_dngd.addNewAmount_dngd(50000);

        bank_dngd.setInterestRate_dngd(2.3);
        bank_dngd.addNewAmount_dngd(28492);

    }
}