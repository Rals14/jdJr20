package Utils;

public class RandomNumbersArray {
    public static int[] randomNumbers(int size, int min, int max) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return randomNumbers;
    };

    public static int magicKey(int[] numbers) {
       int index = (int) Math.floor(Math.random()* numbers.length);
        return numbers[index];
    };
}
