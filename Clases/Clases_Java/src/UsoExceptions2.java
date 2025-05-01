import javax.swing.*;

public class UsoExceptions2 {

    public static int capturarUnNumero (String valorSolicitado) {
        String stringData = JOptionPane.showInputDialog("Ingrese un número entero (" + valorSolicitado + "):");
        int number;
        try {
            number = Integer.parseInt(stringData);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Error: Debe escribir un número entero: " + nfe.getMessage());
            return capturarUnNumero(valorSolicitado);//capturarUnNumero(valorSolicitado);
        }
        return number;
    }

    public static void main(String[] args) {

        //String stringData = JOptionPane.showInputDialog("Ingrese un número entero:");
        double result = 0.0;
        int dividendo = 0, divisor = 0;
        dividendo = capturarUnNumero("dividendo");
        divisor = capturarUnNumero("divisor");
        //int[] intArray = {1, 2, 3};

        try {
            //divisor = Integer.parseInt(stringData);
            //result = 10 / divisor;
            result = dividendo / divisor;
            System.out.println("El resultad de la división es = " + result);
            //System.out.println(intArray[3]);

        }
        catch (ArithmeticException ae) {
            System.out.println("La division por zero no es posible (" + ae.getMessage() + ")");
            //main(args);
        }
//        finally {
//            System.out.println("Continua la ejecución de nuestra App.");
//        }


    }
}
