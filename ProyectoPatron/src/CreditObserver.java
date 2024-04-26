public class CreditObserver implements Observer {

    @Override
    public void update(double interestRate, double amount) {

        if(interestRate == 0 || amount == 0){
            return;
        }

        System.out.println("Nuevo credito registrado");
        System.out.println("Tasa de interes: " + interestRate + "%");
        System.out.println("Monto solicitado: " + amount);

        double total = amount + (amount * (interestRate/100));
        System.out.println("Total a pagar: " + total);

        System.out.println("--------------------------------------");
    }
}
