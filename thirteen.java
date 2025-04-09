//Write a program to sort element of an array
import java.util.Arrays;
public class thirteen {
        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 9};
            System.out.println("Original array: " + Arrays.toString(numbers));
            Arrays.sort(numbers);
            System.out.println("Sorted array (ascending): " + Arrays.toString(numbers));
        }
    }


