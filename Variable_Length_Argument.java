
import java.util.*;

public class Main {
    public static void main(String[] args) {
        sum(1, 2, 3); // 6
    }
  /**
   * Calculates the sum of the given numbers.
   *
   * This method takes a variable number of integer arguments and computes their sum.
   *
   * @param numbers The integers to be summed.
   * @return The sum of the provided integers.
   *
   * @throws IllegalArgumentException If no numbers are provided.
  */
  public static int sum(int... numbers) {
      if (numbers.length == 0) {
          throw new IllegalArgumentException("At least one number must be provided.");
      }
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
      }
      return sum;
  }
}
