package edu.guilford;

public class SortAndSearch {
    // Create a selectionSort methods that will take an array 
    // of integers as a parameter and sort the array using
    // a selection sort algorithm

    public static void selectionSort(int[] array) {
        // Loop over all elements in the array
        for (int i = 0; i < array.length; i++) {
            // Find the index of the smallest element
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    // set the current element to the smallest element
                    smallestIndex = j;
                }    
            }
            // Swap the smallest element with the current element
            swap(array, i, smallestIndex);
        }
    }
    // make quickSort method that puts the array
     // of integers in the parameter of the method and 
    // uses a quick sort algorithm to sort the array
     public static void quickSort(int[] array) {
            quickSort(array, 0, array.length - 1);
    }
    // Create a recursive quickSort method that takes an array of integers
    // as a parameter and sorts the array using a quick sort algorithm
    public static void quickSort(int[] array, int start, int end) {
        // Check to see if the array has more than one element
        if (start < end) {
            // Partition the array
            int pivotIndex = partition(array, start, end);
            // Sort the left half
            quickSort(array, start, pivotIndex - 1);
            // Sort the right half
            quickSort(array, pivotIndex + 1, end);
        }
    }
    // Create a partition method that takes an array of integers 
    // as the parameter and partitions the array while using the quick
    // sort algorithm
    private static int partition(int[] array, int start, int end) {
    // The pivot will be set as the last element in the array
    int pivot = array[end];
    // Set the pivot index as the first element in the array
    int pivotIndex = start;
    // Loop over all elements in the array
    for (int i = start; i < end; i++) {
        // Check to see if the current element is less than the pivot
        if (array[i] < pivot) {
            // Swap the current element with the pivot index
            swap(array, i, pivotIndex);
            // Increment the pivot index
            pivotIndex++;
        }
    }
    // Swap the pivot with the element from the pivot index
    swap(array, end, pivotIndex);
    // Return the pivot index
    return pivotIndex;
}
    // Create a method that will swap two elements in an array
        private static void swap(int[] array, int i, int j) {
    // Make a temp variable to store the value of the first element
    int temp = array[i];
    // Set the value of the first element to the value of the second element
    array[i] = array[j];
    // Set the value of the second element to the value of the first element
    array[j] = temp;
}

  // Create the binarySearch method that will be used as the search algorithm
    public static int binarySearch(int[] array, int target) {
        // Set the start index to 0
        int start = 0;
        // Set the end index to the last element in the array
        int end = array.length - 1;
        // Loop over all elements in the array
        while (start <= end) {
            // Set the middle index
            int middle = (start + end) / 2;
            // Check to see if the target is the middle element
            if (target == array[middle]) {
                // Return the index of the target
                return middle;
            }
            // Check to see if the target is less than the middle element
             if (target > array[middle]) {
              // set the start index to the middle index plus one
                start = middle + 1;
            } else {
                // set the end index to the middle index minus one
                end = middle - 1;   
            
            }
        }

        // Return -1 if the target is not found
        return -1;
    }
  
  // Make the linearSearch method that will also be used as the search algorithm
    public static int linearSearch(int[] array, int target) {
        // Loop over all elements in the array
        for (int i = 0; i < array.length; i++) {
            // Check to see if the current element is the target
            if (array[i] == target) {
                // Return the index of the target
                return i;
            }
        }
        // Return -1 if the target is not found in the array
        return -1;
    }
}