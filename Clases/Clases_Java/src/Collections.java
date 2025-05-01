import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> names = new ArrayList<>();


        //agregar datos al ArrayList
        names.add("Juan");
        names.add("Pedro");
        names.add("Maria");
        System.out.println("names: " + names);
        names.remove("Juan");
        System.out.println("names: " + names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Mauricio");
        names2.addAll(names);
        System.out.println(names2);

        names2.set(0, "Nelson");
        System.out.println("names2=" + names2);

        //
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        names.add(palabra);
        System.out.println("names: " + names);


        //3. Map
        Map<String, Integer> marketList = new HashMap<>();
        marketList.put("Bolsa de cebollas", 1);
        marketList.put("Manzanas", 3);
        System.out.println("marketList: " + marketList);
        System.out.println(marketList.get("Manzanas"));
        marketList.remove("Bolsa de cebollas");
        System.out.println("marketList: " + marketList);
    }
}
