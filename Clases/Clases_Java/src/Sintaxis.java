import java.util.Scanner;

public class Sintaxis {
    public static void main(String[] args) {
        //Comentario
        /*
        Otro comentario
         */

        //Declaración de variable
        int myAge;
        myAge = 10;
        myAge = 16;

        float decimal = 3.0f;
        double biggerdecimal = 3.014694523;

        String miEdad = "22";
        boolean esOnce = miEdad.equals("22"); //Comparar cadenas, siempre devuelve un boolean
//        System.out.println(esOnce);

        int number = 10;
        boolean esIgual = (number == 10); //Comparar numeros, siempre devuelve un boolean
//        System.out.println("esIgual =" + esIgual);
//        System.out.println("esOnce =" + esOnce);

        //Uso de scanner para capturar datos del usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.nextLine();

        System.out.println("Tu nombre es: " + nombre);

        //Ejemplo 2
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();
        sc.nextLine(); //Limpiar el buffer, cuando primero capturas texto y luego con el mismo scanner capturas numeros
        System.out.println("Tu edad es: " + edad);
        //Preguntas interactivas
        //Uso de if

    }
}
