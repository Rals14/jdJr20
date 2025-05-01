import java.util.HashMap;
import java.util.Map;

public class MapEjercicio2 {
    /*
     * Ejercicio 2 Intermedio: Contar Frecuencia de Palabras
     * Descripción: Crear un mapa para contar la frecuencia de palabras en una lista de frases y usar
     * el operador ternario para determinar si una palabra aparece más de una vez.
     * Usa estas frases: "hello world", "hello", "world hello", "hello world world"
     */
    public static void main(String[] args) {
        String [] frases = {
                "hello world",
                "hello",
                "world hello",
                "hello world world"
        };
        Map<String, Integer> wordCount = new HashMap<>();

        // Contar la frecuencia de palabras
        for (String frase : frases) {
            String[] words = frase.split(" ");
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Imprimir la frecuencia de palabras
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            String status = (count > 1) ? "aparece más de una vez" : "aparece una vez";
            System.out.println(word + " " + status + ": " + count);
        }


    }
}

