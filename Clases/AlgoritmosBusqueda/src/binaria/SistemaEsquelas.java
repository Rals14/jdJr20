package binaria;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaEsquelas {

    public static void main(String[] args) {
        // Crear un objeto de la clase Esquela

        Esquela[] esquelas = {
            new Esquela("123456789", 50, "Exceso de velocidad"),
            new Esquela("987654321", 100, "Conducir en estado de ebriedad"),
            new Esquela("111111111", 75, "Pasarme un semáforo en rojo"),
            new Esquela("222222222", 30, "Estacionarse en lugar prohibido"),
        };

        // Ordenar las esquelas por licencia
        Arrays.sort(esquelas, (Esquela e1, Esquela e2) -> e1.licencia.compareTo(e2.licencia));


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese licencia a verificar por esquela:");
        String licencia = sc.nextLine();

        int resultado = buscarEsquelaPorLicencia(esquelas, licencia);
        if (resultado != -1){
            System.out.println("Licencia: " + esquelas[resultado].licencia);
            System.out.println("Monto: " + esquelas[resultado].monto);
            System.out.println("Razón: " + esquelas[resultado].razon);
        }else{
            System.out.println("No se encontró ninguna esquela con la licencia ingresada.");
        }

    }

    private static int buscarEsquelaPorLicencia(Esquela[] esquelas, String licencia) {
        //indices del array
        int inicio = 0;
        int fin = esquelas.length - 1;

        while(inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            int comparacion = esquelas[mitad].licencia.compareTo(licencia);

            if (comparacion == 0) {
                // Esquela encontrada
                return mitad;
            } else if (comparacion < 0) {
                // Buscar en la mitad derecha
                inicio = mitad + 1;
            } else {
                // Buscar en la mitad izquierda
                fin = mitad - 1;
            }
        }

        return -1;
    }
}
