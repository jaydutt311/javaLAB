//Write a program to reverse the digits of a numbers.
import java.util.Scanner;
public class eighth {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            int reversed = 0;
            int original = number;
            int temp = Math.abs(number);
            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }
            if (original < 0) {
                reversed *= -1;
            }
            System.out.println("Reversed number: " + reversed);
        }
    }

