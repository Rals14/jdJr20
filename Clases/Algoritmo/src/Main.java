public class Main {
    public static void main(String[] args) {
        Algoritmo1 mayusculas = new Algoritmo1();
        //Problema 1
        System.out.println("Bienvenido al mejor Bootcamp de Java: "+ mayusculas.enMayusculas("jd 20"));
        //Problema 2
        ContadorDeNumeros contador = new ContadorDeNumeros();
        MisArrays misArrays = new MisArrays();
        int[] array = misArrays.arregloAleatorioEnteros(0, 5, 15);
//        System.out.println("El arreglo generado es: "+ java.util.Arrays.toString(array));
        System.out.println("El arreglo generado es: " + misArrays.arrayToString(array));
        System.out.println("El número 3 se repitió: " + contador.contadorDeNumeros(array, 3) + " veces");

    }
}
