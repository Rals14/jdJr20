public class StreamingGame extends Game{
    private String streamingUrl;

    public StreamingGame(String title, String platform, int releaseYear, String streamingUrl) {
        super(title, platform, releaseYear);
        this.streamingUrl = streamingUrl;
    }

    public String viewGame() {
        return "Juego en streaming: " + super.toString() + String.format(" - URL: %s", streamingUrl);
    }
}
