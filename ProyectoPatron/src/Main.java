public class Main {
    public static void main(String[] args) {

        BankObservable bank_dngd = new BankObservable();

        CreditObserver creditOne = new CreditObserver();
        CreditObserver creditTwo = new CreditObserver();

        bank_dngd.addObserver_dngd(creditOne);

        bank_dngd.addObserver_dngd(creditTwo);
        bank_dngd.deleteObserver_dngd(creditTwo);

        bank_dngd.setInterestRate_dngd(30);

        bank_dngd.addNewAmount_dngd(2000000);

        bank_dngd.setInterestRate_dngd(25.23);

        bank_dngd.setInterestRate_dngd(18.30);

        bank_dngd.setInterestRate_dngd(33.35);




    }
}