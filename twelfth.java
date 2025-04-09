//Write a program to show the scope and lifetime of a variable.
public class twelth {
        static int globalVar = 100;
        public static void main(String[] args) {
            System.out.println("Inside main method");
            int localVar = 200;
            System.out.println("Global variable: " + globalVar);
            System.out.println("Local variable in main: " + localVar);
            {
                int blockVar = 300;
                System.out.println("Block-level variable: " + blockVar);
            }
            showScope();
        }
        static void showScope() {
            int localToShowScope = 400;
            System.out.println("Inside showScope method");
            System.out.println("Global variable (accessible): " + globalVar);
            System.out.println("Local to showScope(): " + localToShowScope);
        }
    }


