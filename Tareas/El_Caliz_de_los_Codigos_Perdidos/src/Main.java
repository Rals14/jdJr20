import Utils.BinarySearch;
import Utils.MergeSort;
import Utils.RandomNumbersArray;
import Utils.Timer;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Timer timer2 = new Timer();
        MergeSort merge = new MergeSort();

        // Generate array of random numbers
        System.out.println("Generating an array of random numbers...");
        int[] numbers = RandomNumbersArray.randomNumbers(100, 1000, 9999);

        //Order the array with the MergeSort algorithm
        System.out.println("Sorting the array with MergeSort algorithm...");
        timer.start();
        MergeSort.mergeSort(numbers, 0, numbers.length - 1);
        timer.stop();

        // Print the time taken to sort the array
        double orderTime = timer.getElapsedTime();

//        // Print the sorted array
//        System.out.println("Sorted array:");
//        merge.printArray(numbers);

        // Ask the user to enter the magic key
        System.out.println("Enter the magic key to reveal the secret message:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int userInput = scanner.nextInt();

        // Check if the user input matches the magic key

        timer2.start();
        int result = BinarySearch.binarySearch(numbers, userInput);
        timer2.stop();
        double searchTime = timer2.getElapsedTime();
        if (result == -1) {
            System.out.println("Bad luck, that was not a magic key, but you can keep trying.");
        } else {
            System.out.println("You find the magic key: " + numbers[result] + " You are the chosen one!");
        }

        System.out.println("\n--- Performance Analysis ---");
        System.out.println("Time taken to sort the array: " + orderTime + " nanoseconds");
        System.out.println("Complexity of MergeSort: O(n log n)");
        System.out.println("Time taken to search the array: " + searchTime + " nanoseconds");
        System.out.println("Complexity of BinarySearch: O(log n)");


    }
}
