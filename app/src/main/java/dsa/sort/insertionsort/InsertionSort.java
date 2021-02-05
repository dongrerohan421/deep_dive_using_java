package dsa.sort.insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        sort(intArray);
        printArray(intArray);
    }

    public static void sort(int[] intArray) {
        // firstUnsortedIndexstarts from index 1 because 0th element is already sorted
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
    }

    public static void printArray(int[] intArray) {
        // Print intArray
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }
}
