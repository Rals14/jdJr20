import Auxiliar.PedirNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia de la clase Calculadora, variables de números y de clase PedirNumeros
        Calculadora calc = new Calculadora();
        double a, b = 0;
        PedirNumeros pedir = new PedirNumeros();

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Seleccione la operacion:");
        System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Potencia\n6. Raíz Cudrada");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        a = pedir.pedirNumeros();

        // Si la opción es diferente de 6, se pide el segundo número
        if (opcion != 6) {
            b = pedir.pedirNumeros();
        }
        switch(opcion) {
            case 1:
                calc.sumar(a, b);
                break;
            case 2:
                calc.restar(a, b);
                break;
            case 3:
                calc.multiplicar(a, b);
                break;
            case 4:
                calc.dividir(a, b);
                break;
            case 5:
                calc.potenciar(a, b);
                break;
            case 6:
                calc.raizCuadrada(a);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}