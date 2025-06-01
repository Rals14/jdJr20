package ocp1;

public class CriptoPayment implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pagado en criptomoneda");
    }
}
