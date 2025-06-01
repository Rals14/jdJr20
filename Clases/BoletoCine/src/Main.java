public class Main {
    public static void main(String[] args) {
        String palabraControl = "";
        int[][] asientosDisponibles = new int[5][3];

        Matrices matrices = new Matrices();
        asientosDisponibles = matrices.matrizAleatorio(asientosDisponibles, 0, 50);
        System.out.println(matrices.printMatriz(asientosDisponibles));

        Teclado teclado = new Teclado();
        int pelicula, horario, boletos;

        //Proceso de venta de entradas
        while(!palabraControl.equalsIgnoreCase("finish")){

            //Capturamos la pelicula, horario y boletos a comprar
            pelicula = teclado.kbdInt("Ingrese el numero de la pelicula que desea ver: ");
            horario = teclado.kbdInt("Ingrese el horario de la pelicula: ");
            boletos = teclado.kbdInt("Ingrese la cantidad de boletos que desea comprar: ");

            if(pelicula >= 0 || pelicula <= 4) {
                if(horario >= 0 || horario <= 2) {
                    if(boletos <= asientosDisponibles[pelicula][horario]) {
                        //Proceso de venta de boletos
                        System.out.println("Venta de boletos exitosa");
                    }else{
                        System.out.println("Cantidad de boletos no valida");
                    }
                }else{
                    System.out.println("Horario no valida");
                }
            }else{
                System.out.println("Pelicula no valida");
            }
            //Continuar o salir (escribir finish)
            palabraControl = teclado.kbdString("\nPara continuar de [ENTER]\nPara salir escriba [finish] + [ENTER]");
        }
    }
}
