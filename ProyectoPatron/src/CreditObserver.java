public class CreditObserver implements Observer {

    @Override
    public void update(double interestRate, double amount) {

        if(interestRate == 0 || amount == 0){
            return;
        }

        double totalInterest = amount * (interestRate/100);
        double total = amount + totalInterest;

        System.out.println("Nuevo credito registrado");

        System.out.println("Monto solicitado: " + amount);
        System.out.println("Tasa de interes: " + interestRate + "%");
        System.out.println("Interes total: " + totalInterest);

        System.out.println("Total a pagar: " + total);

        System.out.println("--------------------------------------");
    }
}
