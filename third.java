//Write a program to perform all the arithmetic operation by taking inputs from command line
 public class third {
 
     public static void main(String[] args) {
         int a = 25;
         int b = 10;
         //addition
         int sum = a + b;//datatype primitive
         System.out.println(sum);
 
         //subrection
         int diff = a - b;
         System.out.println(diff);
 
         //multiplication
         int mul = a * b;
         System.out.println(mul);
 
         //division
         int div = a / b;
         System.out.println(div);
 
         //quize
         int ans = (a*b)/(a-b);
         System.out.println(ans);
     }
 }
