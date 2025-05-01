import Exceptions.DivisionPorCeroException;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Crear una instancia de la clase Calculadora
        Calculadora calc = new Calculadora();

        String dividendo = JOptionPane.showInputDialog("Ingrese un número entero (dividendo):");
        String divisor = JOptionPane.showInputDialog("Ingrese otro número entero (divisor):");

        int intDividendo = Integer.parseInt(dividendo);
        int intDivisor = Integer.parseInt(divisor);

        try {
            double resultado = calc.division(intDividendo, intDivisor);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (DivisionPorCeroException e){
            JOptionPane.showMessageDialog(null,"Ocurrió una excepción: " + e.getMessage());
        }

    }
}
