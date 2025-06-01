abstract class Game {
    private String title;
    private String platform;
    private int releaseYear;

    public Game() {
    }

    public Game(String title, String platform, int releaseYear) {
        this.title = title;
        this.platform = platform;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return String.format(" - %s, platform: %s, release year: %d\n", title, platform, releaseYear);
    }

    public abstract String viewGame(); // Abstract method to be implemented by subclasses
}
