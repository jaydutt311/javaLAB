//Write a program to perform the Stack operations using class & objects. 
import java.util.Scanner;
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // isEmpty operation
    public boolean isEmpty() {
        return (top == -1);
    }

    // Display stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack myStack = new Stack(size);
        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    myStack.push(val);
                    break;
                case 2:
                    int popped = myStack.pop();
                    if (popped != -1)
                        System.out.println("Popped value: " + popped);
                    break;
                case 3:
                    int top = myStack.peek();
                    if (top != -1)
                        System.out.println("Top element: " + top);
                    break;
                case 4:
                    myStack.display();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 5);
    }
}
