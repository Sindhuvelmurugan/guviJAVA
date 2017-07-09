import java.util.Scanner;
 
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int d, e, f;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      d = in.nextInt();
      e = in.nextInt();
      f = in.nextInt();
 
      if ( d > e && d > f )
         System.out.println("First number is largest.");
      else if ( e > d && e > f )
         System.out.println("Second number is largest.");
      else if ( f > d && f > e )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}
