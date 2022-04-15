import java.util.Scanner;

public class FeetToMeters{
 public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);

   System.out.println("Enter a number in feet:");
   double feet = input.nextDouble();

   double result = feet * 0.305;
   System.out.print("Your answer is " + result);


}


}