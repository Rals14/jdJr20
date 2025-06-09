public class PizzaVegetarianaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();
    @Override
    public void hacerMasa() {
        pizza.setMasa("masa delgada y tostada");
    }

    @Override
    public void colocarIngredientes() {
        pizza.setIngredientes("pimientos, cebolla, champiñones y aceitunas");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
