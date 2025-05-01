import java.util.HashMap;
import java.util.Map;

public class MapEjercicio1 {
//    Ejercicio 1: (Facil)
//    Uso de Map y Operador Ternario
//    Descripción: Crear un mapa de nombres y edades, y utilizar el operador ternario para determinar si una persona es mayor de edad.

    public static void main(String[] args) {
        // Crear un mapa de nombres y edades
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alejandro", 21);
        ages.put("Eduardo", 15);
        ages.put("Cristian", 18);

//        System.out.println("ages: " + ages);

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            // Usar operador ternario para determinar si es mayor de edad
            String status = (age >= 18) ? "es mayor de edad" : "no es mayor de edad";
            System.out.println(name + " " + status);
        }
    }
}
