public class Observer1  implements Observer{

    @Override
    public void update(double tasaInteres) {

        System.out.println("Credito creado con tasa de interes del " + tasaInteres + "%");

    }
}
