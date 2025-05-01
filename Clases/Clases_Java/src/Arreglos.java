public class Arreglos {
    int myNumber = 10;

    public static void main(String[] args) {
        //               0   1   2   3   4
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println("El primer elemento del arreglo es: " + myArray[0]);
        //Bucle for
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Elemento " + i + ": " + myArray[i]);
        }

        //Bucle foreach
        for (int number : myArray) {
            System.out.println("Elemento: " + number);
        }

        String[] diasDeClase = {"Lunes", "Martes", "Miercoles", "Viernes"};
        for (String dia : diasDeClase) {
            System.out.println("Dia de clase: " + dia);
        }

        //Bucle while
        int i = 0;
        while (i < diasDeClase.length) {
            System.out.println("Dia de clase: " + diasDeClase[i]);
            i++;
        }

    }

}

