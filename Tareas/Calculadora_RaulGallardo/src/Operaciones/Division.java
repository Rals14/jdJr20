package Operaciones;

public class Division {
    public double division(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        double result = a / b;
        System.out.println("El resultado de la division es: " + result);
        return result;

    }
}
