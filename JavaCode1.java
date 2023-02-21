import java.util.Scanner;
# comment
public class ReverseNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number to reverse: ");
    try {
      int num = scanner.nextInt();
      int reverse = 0;
      while (num != 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num /= 10;
      }
      System.out.println("Reverse of the number is: " + reverse);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
Module - 2
Module - 3
Module - 4
 Module - 86
