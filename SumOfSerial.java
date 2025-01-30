public class SumOfSerial {
  public static void main(String[] args) {
    // Non-recursive
    int sum = 0;
    for (int i = 1; i <= 99; i += 2) {
      sum += i;
    }
    System.out.println("Sum of 1, 3, 5, 7, ..., 99: " + sum);
  }
}
