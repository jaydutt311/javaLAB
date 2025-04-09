//Write a program to display “Java is an object-oriented programming language” using command line arguments
 public class second {
         public static void main(String[] args) {
             if (args.length > 0) {
                 for (String arg : args) {
                     System.out.print(arg + " ");
                 }
             } else {
                 System.out.println("No command line arguments provided.");
             }
         }
     }
