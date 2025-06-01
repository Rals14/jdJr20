import enums.Condition;

public class PhysicalCopy extends Game{
    private Condition condition;

    public PhysicalCopy(String title, String platform, int releaseYear, Condition condition) {
        super(title, platform, releaseYear);
        this.condition = condition;
    }

    public String viewGame() {
        return "Juego fisico => " + super.toString() + String.format(" - Condition: %s\n", condition);
    }
}