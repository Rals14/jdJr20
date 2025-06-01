package ocp1;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentProcessor pagarConsumo = new PaymentProcessor();

        pagarConsumo.process(new CashPayment());
        pagarConsumo.process(new CardPayment());
        pagarConsumo.process(new CriptoPayment());
    }
}
