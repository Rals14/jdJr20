public class Main {
    public static void main(String[] args) {
        Cheff franco = new Cheff();

        Pizza pizzaHawaiana = franco.makePizza(new PizzaHawaianaBuilder());
        System.out.println(pizzaHawaiana.toString());
        Pizza pizzaVegetariana = franco.makePizza(new PizzaVegetarianaBuilder());
        System.out.println(pizzaVegetariana.toString());
    }
}
