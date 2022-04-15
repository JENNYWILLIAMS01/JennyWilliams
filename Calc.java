import java.util.Scanner;

public class Calc{
 public static void main(String[] args) {
  
   Scanner inputNum = new Scanner(System.in);

   System.out.print("Enter First num: ");
   int firstNumber = inputNum.nextInt();

   System.out.print("Enter Second num: ");
   int secondNumber = inputNum.nextInt();

   int addition = firstNumber + secondNumber;
   System.out.print("the sum is " + addition);

}



}