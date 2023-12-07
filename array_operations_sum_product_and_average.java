/**
 * A simple program that demonstrates basic array operations: sum, product, and average.
 */
public class Main {

    /**
     * The main entry point of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        // Print the sum, product, and average of the array
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Product: " + product(numbers));
        System.out.println("Average: " + average(numbers));
    }

    /**
     * Calculates the sum of the elements in the given array.
     *
     * @param numbers The array of integers.
     * @return The sum of the elements in the array.
     */
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /**
     * Calculates the product of the elements in the given array.
     *
     * @param numbers The array of integers.
     * @return The product of the elements in the array.
     */
    public static int product(int[] numbers) {
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }

    /**
     * Calculates the average of the elements in the given array.
     *
     * @param numbers The array of integers.
     * @return The average of the elements in the array.
     */
    public static double average(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
