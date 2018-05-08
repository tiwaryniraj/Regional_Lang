import java.util.Scanner;

class SumOfTwoNumbers {

 public static void main(String args[]) {
     
  Scanner input = new Scanner(System.in);
  System.out.println("Enter first number");
  int x = input.nextInt();
  
  System.out.println("Enter second number");
  int y = input.nextInt();
  
  int sum = x + y;
  System.out.println("Sum is : " + sum);
     
 }

}
