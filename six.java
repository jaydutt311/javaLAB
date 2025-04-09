//Write a program to compute the sum of digits of a given integer.
import java.util.Scanner;
public class sixth {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            int sum = 0;
            int temp = Math.abs(number);
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            System.out.println("Sum of digits of " + number + " is: " + sum);
        }
    }

