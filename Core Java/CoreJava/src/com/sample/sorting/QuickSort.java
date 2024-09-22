package com.sample.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 80, 30, 90, 40, 50, 70};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot position and partition the array
            int pivotIndex = partition(array, low, high);

            // Recursively apply quicksort to the left and right sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choose the last element as the pivot
        int i = low - 1;  // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] with array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element to the correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;  // Return the pivot index
    }
}
