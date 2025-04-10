//Write a program to read marks out of 100. Declare result as follows:  
//a.60 or more 1st class
//b.50-59 2nd class  
//c.40-49 pass  
//d.Less than 40 fail 
import java.util.Scanner;
public class fifteen {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks out of 100: ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            } else {
                if (marks >= 60) {
                    System.out.println("Result: First Class");
                } else if (marks >= 50) {
                    System.out.println("Result: Second Class");
                } else if (marks >= 40) {
                    System.out.println("Result: Pass");
                } else {
                    System.out.println("Result: Fail");
                }
            }
        }
    }
