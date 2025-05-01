import Operaciones.*;

// Clase calculadora que contiene los métodos para realizar las operaciones
public class Calculadora {
    // Variable para almacenar el resultado de la operación
    private double result = 0;
    // Decidí almacenar el resultado de la operación en una variable para poder usarlo en otras operaciones aunque en esta ocasión no es necesario

    public void sumar(double a, double b) {
        Suma suma = new Suma();
        result = suma.suma(a, b);
    }

    public void restar(double a, double b) {
        Resta restar = new Resta();
        result = restar.resta(a, b);
    }

    public void multiplicar(double a, double b) {
        Multiplicacion multiplicacion = new Multiplicacion();
        result = multiplicacion.multiplicacion(a, b);
    }

    public void dividir(double a, double b) {
        Division division = new Division();
        result = division.division(a, b);
    }

    public void potenciar(double a, double b) {
        Potencia potencia = new Potencia();
        result = potencia.potencia(a, b);
    }

    public void raizCuadrada(double a) {
        RaizCuadrada raiz = new RaizCuadrada();
        result = raiz.raizCuadrada(a);
    }
}
