package Utils;

public class Timer {
    private long startTime;
    private long endTime;

    // Initializes the timer
    public void start() {
        startTime = System.nanoTime();
    }

    // Stops the timer
    public void stop() {
        endTime = System.nanoTime();
    }

    // Returns the elapsed time in nanoseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // Prints the elapsed time in nanoseconds
    public void printElapsedTime() {
        System.out.println("Elapsed time: " + getElapsedTime() + " nanoseconds");
    }
}
