//Algoritmo2: Realizar un programa que permita cargar 15 números en un array.
// Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.
public class ContadorDeNumeros {

    public int contadorDeNumeros(int[] numeros, int verificar) {
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == verificar) {
                contador++;
            }
        }
        return contador;
    }
}

