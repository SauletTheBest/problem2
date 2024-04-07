import java.util.Scanner;

public class Problem2 {
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

    // Method for calculating the average value of array elements
    public static double calculateAverage(int[] arr) {
        int sum = 0;

        // Суммируем все элементы массива
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average value
        double average = (double) sum / arr.length;

        // Return the average value
        return average;
    }
}
