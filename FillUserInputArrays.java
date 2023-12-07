import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple program that demonstrates array manipulation and input validation.
 */
public class Main {

    /**
     * The main entry point of the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of elements
        int n = getValidInput("How many elements? {Max is 20 and Min is 1}: ", 1, 20, input);

        // Create an array of integers and fill it
        int[] numbers = new int[n];
        fillArrayIntegers(numbers, input);

        // Print the array of integers using printArrayNumbers method
        printArrayNumbers(numbers);

        // Create an array of Points and fill it
        Point[] points = new Point[n];
        fillArrayPoints(points, input);

        // Print the array of Points
        printArrayPoints(points);
    }

    /**
     * Prompts the user for a valid input within the specified range.
     *
     * @param prompt  The message prompting the user for input.
     * @param min     The minimum allowed value.
     * @param max     The maximum allowed value.
     * @param scanner The Scanner object for input.
     * @return The valid user input.
     */
    private static int getValidInput(String prompt, int min, int max, Scanner scanner) {
        int userInput;
        do {
            System.out.print(prompt);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }

    /**
     * Fills an array of integers with user input.
     *
     * @param numbers The array to be filled.
     * @param input   The Scanner object for input.
     */
    private static void fillArrayIntegers(int[] numbers, Scanner input) {
        System.out.println("Enter integers for the array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * Fills an array of Points with user input for x and y coordinates.
     *
     * @param points The array of Points to be filled.
     * @param input  The Scanner object for input.
     */
    private static void fillArrayPoints(Point[] points, Scanner input) {
        System.out.println("Enter x and y coordinates for each point:");
        for (int i = 0; i < points.length; i++) {
            System.out.print("Point " + (i + 1) + ": ");
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

    /**
     * Prints the elements of an array of integers.
     *
     * @param numbers The array of integers to be printed.
     */
    private static void printArrayNumbers(int[] numbers) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * Prints the elements of an array of Points.
     *
     * @param points The array of Points to be printed.
     */
    private static void printArrayPoints(Point[] points) {
        System.out.println("The elements are: ");
        for (Point point : points) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
    }
}
