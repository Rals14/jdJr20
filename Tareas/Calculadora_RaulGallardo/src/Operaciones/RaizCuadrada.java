package Operaciones;

public class RaizCuadrada {
    public double raizCuadrada(double a) {
        if (a < 0){
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        double result = Math.sqrt(a);
        System.out.println("La raíz cuadrada es: " + result);
        return result;
    }
}
