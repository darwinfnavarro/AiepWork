public class Main {
    public static void main(String[] args) {

        BankObservable bank_dngd = new BankObservable();
        
        bank_dngd.addObserver_dngd(new CreditObserver());

        bank_dngd.setInterestRate_dngd(15);

        bank_dngd.addNewAmount_dngd(50);
        bank_dngd.addNewAmount_dngd(375);
        bank_dngd.addNewAmount_dngd(500);

        bank_dngd.setInterestRate_dngd(4.5);

        bank_dngd.addNewAmount_dngd(10000);
        bank_dngd.addNewAmount_dngd(25000);


        bank_dngd.setInterestRate_dngd(7.35);

        bank_dngd.addNewAmount_dngd(5500);
        bank_dngd.addNewAmount_dngd(8730);

    }
}