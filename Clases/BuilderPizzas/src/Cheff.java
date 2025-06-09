public class Cheff {

    public Pizza makePizza(PizzaBuilder builder) {
        builder.hacerMasa();
        builder.colocarIngredientes();
        return builder.getPizza();
    }


}
