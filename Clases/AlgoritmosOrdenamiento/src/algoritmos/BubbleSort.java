package algoritmos;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int penultimo = array.length - 1;

        for (int i = 0; i < penultimo; i++) {
            for (int j = 0; j < penultimo - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {5, 2, 1, 6, 4, 3};

        bubbleSort(array);
        System.out.print("Array ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
