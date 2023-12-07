
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
    }}
