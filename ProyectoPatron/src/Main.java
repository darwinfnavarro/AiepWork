public class Main {
    public static void main(String[] args) {

        BankObservable bank_dngd = new BankObservable();
        
        bank_dngd.addObserver_dngd(new CreditObserver());

        bank_dngd.setInterestRate_dngd(30);

        bank_dngd.addNewAmount_dngd(2000000);

        bank_dngd.setInterestRate_dngd(25.23);

        bank_dngd.setInterestRate_dngd(18.30);

        bank_dngd.setInterestRate_dngd(33.35);


    }
}