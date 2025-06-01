package ocp1;

public class CashPayment implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Pagado en efectivo");
    }
}
