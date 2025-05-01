import java.util.Scanner;

public class Clausulas {
    public static void main(String[] args) {

        //Preguntas interactivas
        // Uso de if - else - else if
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de dato ingresará? \n1. Numeros\n2. Palabras");
        int option = sc.nextInt();
        sc.nextLine();
//        if(option == 1) {
//            System.out.println("Digite el número: ");
//            int number = sc.nextInt();
//            System.out.println("El número es: " + number);
//        } else if (option == 2) {
//            System.out.println("Ingrese la palabra: ");
//            String palabra = sc.nextLine();
//            System.out.println("La palabra es: " + palabra);
//        }else{
//            System.out.println("No es una opcion valida");
//        }

        switch (option) {
            case 1:
                System.out.println("Digite el número: ");
                int numero = sc.nextInt();
                System.out.println("El número es: " + numero);
                break;
            case 2:
                System.out.println("Digite el palabra: ");
                String palabra = sc.nextLine();
                System.out.println("La palabra es: " + palabra);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
