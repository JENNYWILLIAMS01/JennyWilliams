import java.util.Scanner;

public class PoundsToKilogram{
 public static void main(String[] args) {
  
   Scanner input=new Scanner(System.in);

   System.out.println("oma,enter a number in pounds:");
   double pounds = input.nextDouble();

   double result = pounds * 0.454;
   System.out.print("Your answer is " + result);

}



}