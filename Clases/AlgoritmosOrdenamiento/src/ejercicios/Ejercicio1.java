package ejercicios;

public class Ejercicio1 {

    public static void bubbleSort(String[] array) {
        int penultimo = array.length - 1;

        for (int i = 0; i < penultimo; i++) {
            for (int j = 0; j < penultimo - i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    // Swap array[j] and array[j + 1]
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] entrada = {"Java", "Programación", "Ordenamiento", "Array", "Datos"};

        bubbleSort(entrada);
        System.out.print("Array ordenado: ");
        for (String word : entrada) {
            System.out.printf("%s(%d) ", word, word.length());
        }
    }

}
