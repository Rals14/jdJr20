package ocp1;

public class CardPayment implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pagado con tarjeta");
    }
}
