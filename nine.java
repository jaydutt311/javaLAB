//Write a program to show the use of typecasting
import java.util.Scanner;
public class ningth {
        public static void main(String[] args) {
            int intVal = 100;
            double doubleVal = intVal;
            System.out.println("Implicit Typecasting:");
            System.out.println("Integer value: " + intVal);
            System.out.println("Converted to double: " + doubleVal);
            double originalDouble = 123.456;
            int castedInt = (int) originalDouble;
            System.out.println("\nExplicit Typecasting:");
            System.out.println("Original double value: " + originalDouble);
            System.out.println("Converted to integer: " + castedInt);
        }
    }
