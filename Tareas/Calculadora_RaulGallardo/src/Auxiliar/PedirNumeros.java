package Auxiliar;

import java.util.Scanner;

public class PedirNumeros {
        private final Scanner sc = new Scanner(System.in);
        double num;
        public double pedirNumeros() {
            // Este metodo se encarga de pedir un numero al usuario y validar que sea un numero
            while (true) {
                try {
                    System.out.println("Ingrese un numero: ");
                    num = sc.nextDouble();
                    return num;
                } catch (Exception e) {
                    System.out.println("Entrada incorrecta, intentelo nuevamente");
                    sc.nextLine();
                }
            }
        }
}
