package lineal;

public class InventarioMedicinas {

    public static void main(String[] args) {

        String[] medicamentos = {
                "Paracetamol - Para dolores de cabeza, fiebre y malestar general.",
                "Ibuprofeno - Para inflamaciones, dolor musculares y fiebre.",
                "Amoxicilina - Antibiótico para infecciones bacterianas.",
                "Loratadina - Alivia alergias y resfriados comunes.",
                "Aspirina - Para dolor de cabeza, fiebre y prevención de coagulos.",
        };

        //Palabra clave para buscar en la descripción del medicamento
        String keyword = "fiebre";

        //Mostrar medicamentos que contienen la palabra clave
        buscarMedicamentos(medicamentos, keyword);

    }

    public static void buscarMedicamentos(String[] medicamentos, String keyword) {
        boolean isPresent = false;
        System.out.println("Medicamentos que contienen la palabra clave '" + keyword + "':");
        for (String medicamento : medicamentos) {
            if (medicamento.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(medicamento);
                isPresent = true;
            }
        }

        if (!isPresent) {
            System.out.println("No se encontraron medicamentos que contengan la palabra clave '" + keyword + "'.");
        }
    }
}
