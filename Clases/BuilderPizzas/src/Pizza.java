public class Pizza {
    private String masa;
    private String ingredientes;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String toString() {
        return "Pizza con masa: " + masa + " e Ingredientes " + ingredientes;
    }
}
