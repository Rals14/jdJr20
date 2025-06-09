public class PizzaHawaianaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void hacerMasa() {
        pizza.setMasa("masa alta y suave");
    }

    @Override
    public void colocarIngredientes() {
        pizza.setIngredientes("piña y jamón");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
