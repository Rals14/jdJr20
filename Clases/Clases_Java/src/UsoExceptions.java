import javax.swing.*;

public class UsoExceptions {

    public static void main(String[] args) {

        String stringData = JOptionPane.showInputDialog("Ingrese un número entero:");
        int result = 0, divisor = 0;
        int[] intArray = {1, 2, 3};

        try {
            divisor = Integer.parseInt(stringData);
            result = 10 / divisor;
            System.out.println("result = " + result);
            System.out.println(intArray[3]);

        }
        catch (ArithmeticException ae) {
            System.out.println("La division por zero no es posible (" + ae.getMessage() + ")");
            main(args);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Error: Debe escribir un número entero: " + nfe.getMessage());
            main(args);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice del arreglo fuera del rango: " + e.getMessage());
        }
        finally {
            System.out.println("Continua la ejecución de nuestra App.");
        }


    }
}
