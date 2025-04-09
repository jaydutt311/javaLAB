//Write a program to show the use of type conversion.
public class tenth {
        public static void main(String[] args) {
            String strNumber = "50";
            int intNumber = Integer.parseInt(strNumber);
            System.out.println("String to int: " + strNumber + " → " + intNumber);
            String strDouble = "25.75";
            double doubleNumber = Double.parseDouble(strDouble);
            System.out.println("String to double: " + strDouble + " → " + doubleNumber);
            int num = 100;
            String numStr = Integer.toString(num);
            System.out.println("int to String: " + num + " → \"" + numStr + "\"");
            double dbl = 123.456;
            String dblStr = Double.toString(dbl);
            System.out.println("double to String: " + dbl + " → \"" + dblStr + "\"");
            int smallNum = 10;
            double widerNum = smallNum; // Automatically converts int to double
            System.out.println("int to double (automatic): " + smallNum + " → " + widerNum);
        }
    }
