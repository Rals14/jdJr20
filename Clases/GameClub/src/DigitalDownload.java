public class DigitalDownload extends Game{
    private double  fileSize; // Gb

    public DigitalDownload(String title, String platform, int releaseYear, double fileSize) {
        super(title, platform, releaseYear);
        this.fileSize = fileSize;
    }

    public String viewGame() {
        return "Juego Digital => " + super.toString() + String.format(" - File size: %.2f GB\n", fileSize);
    }
}
