import java.util.Scanner;

/**
 * This class contains a method to calculate the average value of elements in an array of integers.
 * It takes user input for the array elements and outputs the average value.
 */
public class Problem2 {

    /**
     * Main method to read user input, create the array, call the calculateAverage method, and output the result.
     * Time Complexity: O(n)
     * - The for loop iterates over each element of the array once.
     * - The worst-case time complexity occurs when the array has n elements.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();

        // Create an array to store items
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the method to calculate the average value of array elements
        double average = calculateAverage(arr);

        // Output the result
        System.out.println(average);
    }

    /**
     * Method for calculating the average value of array elements.
     * Time Complexity: O(n)
     * - The for loop iterates over each element of the array once.
     * - The worst-case time complexity occurs when the array has n elements.
     *
     * @param arr The array of integers for which the average value needs to be calculated.
     * @return The average value of the elements in the array.
     */
    public static double calculateAverage(int[] arr) {
        int sum = 0;

        // Sum all elements of the array
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average value
        double average = (double) sum / arr.length;

        // Return the average value
        return average;
    }
}
