public class VRGame extends Game {
    private boolean requireHeadset;

    public VRGame(String title, String platform, int releaseYear, boolean requireHeadset) {
        super(title, platform, releaseYear);
        this.requireHeadset = requireHeadset;
    }

    @Override
    public String viewGame() {
        return "Juego VR => " + super.toString() + String.format(" - Requires headset: %s\n", requireHeadset ? "Yes" : "No");
    }
}
