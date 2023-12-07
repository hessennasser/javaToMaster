
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(reversArray(arr)));
    }

    /**
    * Reverses the order of elements in an integer array.
    *
    * This method takes an integer array as input and returns a new array
    * containing the elements of the input array in reverse order.
    *
    * @param arr The input integer array to be reversed.
    * @return A new array with elements in reverse order.
    */
    public static int[] reversArray(int arr[]) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        return reversedArr;
    }
    
    /**
    * Prints the elements of an integer array.
    *
    * This method takes an integer array as input and prints its elements
    * in a formatted way, enclosed in square brackets.
    *
    * @param arr The input integer array to be printed.
    */
    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ,", arr[i]);
        }
        System.out.print("\b\b]");
    }

    /**
    * Calculates the occurrences of a specific number in an integer array.
    *
    * @param arr    The array of integers.
    * @param number The target number to count occurrences.
    */
    public static void calcOccurrences(int[] arr, int number) {
        int occurrences = 0;
        for (int i = 0; i < arr.length; i++) {
            occurrences += arr[i] == number ? 1 : 0;
        }
        System.out.printf("%d occurs %d times\n", number, occurrences);
    }
    
    /**
    * Finds the minimum and maximum values in an integer array.
    *
    * @param arr The array of integers.
    * @return An array containing the minimum and maximum values (index 0: minimum, index 1: maximum).
    */
    public static int[] findMinAndMax(int[] arr) {
        int[] result = new int[2];
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        result[0] = min;
        result[1] = max;
        return result;
    }
}
