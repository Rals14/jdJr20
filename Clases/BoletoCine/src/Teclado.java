import java.util.Scanner;

public class Teclado {
    //Captura de enteros del teclado

    public int kbdInt(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = sc.nextInt();
        return valor;
    }

    //Captura de textos del teclado
    public String kbdString(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        String palabra = sc.nextLine();
        return palabra;
    }
}
