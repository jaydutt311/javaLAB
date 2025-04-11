//Write a program to check whether a year is a leap year or not.
import java.util.Scanner;
public class sixteen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            boolean isLeap = false;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeap = true;
            }
            if (isLeap) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
