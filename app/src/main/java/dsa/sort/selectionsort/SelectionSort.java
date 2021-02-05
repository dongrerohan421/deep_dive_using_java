package dsa.sort.selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        sort(intArray);
        printArray(intArray);
    }

    public static int[] sort(int[] intArray) {
        // To sort intArray - Time Complexity: O(n*n)
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        return intArray;
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] intArray) {
        // Print intArray
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }
}
