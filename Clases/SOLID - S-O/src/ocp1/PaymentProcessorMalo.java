package ocp1;

public class PaymentProcessorMalo {

    public void pay(String type) {
        if (type.equals("efectivo")) {
            System.out.println("Pagado con efectivo.");
        } else if (type.equals("card")) {
            System.out.println("Pagado con tarjeta de crédito");
        }
        // Dev anterior: Si quiere más funcionalidades agregue más else-if
    }
}
