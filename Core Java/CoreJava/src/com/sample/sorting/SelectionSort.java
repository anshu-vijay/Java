package com.sample.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		 int[] array = {64, 25, 12, 22, 11};
	        selectionSort(array);
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	}
	
	public static void selectionSort(int[] array) {
        

        // Loop over each element in the array
        for (int i = 0; i < array.length; i++) {
            int minIndex = i; // Assume the current position is the minimum

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}
