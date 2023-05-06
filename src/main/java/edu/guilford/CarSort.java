package edu.guilford;

import java.util.Scanner;

public class CarSort 
{
    public static void main( String[] args )
    {
        // Creating an array of numCars based on the user's input
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cars would you like to enter?");
        int numCar = scan.nextInt();
        Cars[] carArray = new Cars[numCar];
        
        // Populate the array with the "numCars"
        for (int i = 0; i < numCar; i++) {
            carArray[i] = new Cars();
        }
        // Print the array of cars out (unsorted)
        System.out.println("Here are the cars (unsorted):");
        for (int i = 0; i < numCar; i++) {
            System.out.println(carArray[i]);
        }

        // Sort the array of cars by mileage 
        // Create an array of integers to hold the mileage values
        int[] mileage = new int[numCar];
        // Populate the array of integers with the mileage values
        for (int i = 0; i < numCar; i++) {
            mileage[i] = carArray[i].getMileage();
        }

        // Shuffle the array of integers
        shuffle(mileage); // this shuffle is redudnant, but it's here for the sake of consistency

        // Print the array of integers (unsorted)
        System.out.println("\nHere are the mileage values (unsorted):");
        System.out.println(showData(mileage));

            // Display the time on how long it takes to sort the array of integers
            long startTime = System.nanoTime();

            // Sort the array of integers with the selection sort algorithm from 
            // SortandSearch class
        SortAndSearch.selectionSort(mileage);

            // The end time
            long endTime = System.nanoTime();

        // Calculate the elapsed time in milliseconds and print out
        long elapsedTime = endTime - startTime;
        System.out.println("\nSelection sort took " + (elapsedTime / 1.e6) + " milliseconds");

        // // Print the array of integers with mileage values (sorted by the implementation of (0(n^2) method)
        System.out.println("Here are the mileage values (sorted using selection sort (O(n^2))):");
        System.out.println(showData(mileage));

        // Shuffle the array of integers again and this time, sort the array again with quicksort
            // and the implementation of the O(log2n) method
        shuffle(mileage);

            long startQuickTime = System.nanoTime();
        SortAndSearch.quickSort(mileage, 0, mileage.length - 1);
        long endQuickTime = System.nanoTime();
        long elapsedQuickTime = endQuickTime - startQuickTime;
        System.out.println("\nQuicksort took " + (elapsedQuickTime / 1.e6) + " milliseconds. (Data shuffled.)");

        // Print the sorted array of integers
        System.out.println("Here are the mileage values (sorted using quicksort (O(log2n))):");
        System.out.println(showData(mileage));

        shuffle(mileage);

        // Time how long it takes to find values in the array using linear search and
        // binary search

        // Get a random value from the array
        int randomValue = mileage[(int) (Math.random() * mileage.length)];

        // Time how long it takes to find the random value using linear search
        long startLinearTime = System.nanoTime();
        int indexLS = SortAndSearch.linearSearch(mileage, randomValue);
        long endLinearTime = System.nanoTime();
        long elapsedLinearTime = endLinearTime - startLinearTime;
        System.out.println("\nLinear search took " + (elapsedLinearTime / 1.e6) + " milliseconds. (Data shuffled.))");

        // Time how long it takes to find the random value using binary search
        long startBinaryTime = System.nanoTime();
        int indexBS = SortAndSearch.binarySearch(mileage, randomValue);
        long endBinaryTime = System.nanoTime();
        long elapsedBinaryTime = endBinaryTime - startBinaryTime;
        System.out.println("Binary search took " + (elapsedBinaryTime / 1.e6) + " milliseconds. (Data shuffled.)");

        // System.out.println("\nSelection sort took " + (elapsedTime / 1.e6) + " milliseconds");

        // System.out.println("\nQuicksort took " + (elapsedQuickTime / 1.e6) + " milliseconds. (Data shuffled.)");

        SortAndSearch.quickSort(mileage, 0, mileage.length - 1);

        // Time how long it takes to find values in the array using linear search and
        // binary search

        // Get a random value from the array
        randomValue = mileage[(int) (Math.random() * mileage.length)];

        // Time how long it takes to find the random value using linear search
        startLinearTime = System.nanoTime();
        indexLS = SortAndSearch.linearSearch(mileage, randomValue);
        endLinearTime = System.nanoTime();
        elapsedLinearTime = endLinearTime - startLinearTime;
        System.out.println(
                "\nLinear search took " + (elapsedLinearTime / 1.e6) + " milliseconds. (Data was already sorted.))");

        // Time how long it takes to find the random value using binary search
        startBinaryTime = System.nanoTime();
        indexBS = SortAndSearch.binarySearch(mileage, randomValue);
        endBinaryTime = System.nanoTime();
        elapsedBinaryTime = endBinaryTime - startBinaryTime;
        System.out.println("Binary search took " + (elapsedBinaryTime / 1.e6) + " milliseconds. (Data was already sorted.)");

    }
    // Create a method that will shuffle the data in the array
    public static void shuffle(int[] array) {
        // Loop over all elements in the array
        for (int i = 0; i < array.length; i++) {
            // Generate a random index between 0 and array.length - 1
            int randomIndex = (int) (Math.random() * array.length);
            // Swap the current element with the element at the random index
            swap(array, i, randomIndex);
        }
    }
    // Add a static method to swap to element in an array 
    private static void swap(int[] array, int i, int j) {
        // Store the value of the first element in a temp variable
        int temp = array[i];
        // Set the value of the first element to the value of the second element
        array[i] = array[j];
        // Set the value of the second element to the value of the temp variable
        array[j]= temp;
    }

    // Create a method that will show the data in the array in an organized way
    public static String showData(int[] array) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();
        // Loop over all elements in the array
        for (int i = 0; i < array.length; i++) {
            // Append the current element to the StringBuilder object
            sb.append(array[i]);
            // Append a comma and a space to the StringBuilder object
            sb.append(", ");
        }
    // remove the last comma and space if there isn't anymore elements 
        sb.delete(sb.length() - 2, sb.length());
        // Return the StringBuilder object as a String
        return sb.toString();
    }

}


        


