// 1. Ejercicio Pracitco:Listar Dinosaurios
// En Jurassic Park, se desea implementar un sistema para listar los dinosaurios disponibles
// en cada recinto. El sistema debe usar arreglos para almacenar los nombres de los dinosaurios y
// aplicar diferentes tipos de datos y modificadores de acceso. Se utilizará un bucle for para
// iterar sobre los dinosaurios en cada recinto y mostrar sus nombres.
public class JurassicPark {
    static String[] dinosauriosCarnivoros = {"Tiranosaurio Rex", "Velociraptor", "Spinosaurus"};
    static String[] dinosauriosHerbivoros = {"Triceratops", "Brachiosaurus", "Stegosaurus"};
    static String[] dinosauriosVoladores = {"Pteranodon", "Quetzalcoatlus", "Archaeopteryx"};

    static void listarDinosaurios(String recinto){
        String[] dinosarios;

        //Validar recinto y capturar lista de dinosaurios
        if(recinto.equals("carnivoros")){
            dinosarios = dinosauriosCarnivoros;
        }else if(recinto.equals("herbivoros")){
            dinosarios = dinosauriosHerbivoros;
        }else if(recinto.equals("voladores")){
            dinosarios = dinosauriosVoladores;
        }else{
            System.out.println("Recinto no valido");
            return;
        }

        //Imprimir dinosaurios
        System.out.println("Dinosaurios en el recinto " + recinto + ":");
        for (String dinosaurio : dinosarios) {
            System.out.println("- " + dinosaurio);
        }

    }

    public static void main(String[] args) {
        //Listar dinosaurios en cada recinto
        listarDinosaurios("carnivoros");
        listarDinosaurios("herbivoros");
        listarDinosaurios("voladores");
    }
}
