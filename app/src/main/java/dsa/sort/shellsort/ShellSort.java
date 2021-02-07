package dsa.sort.shellsort;

public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        sort(intArray);
        printArray(intArray);
    }

    public static void sort(int[] intArray) {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }
    }

    public static void printArray(int[] intArray) {
        // Print intArray
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }
}
