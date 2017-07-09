import java.util.Scanner;

public class leapyearornot
{
    public static void main(String args[])
    {
       int yr;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Please Enter Year : ");
       yr = scan.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("Leap Year");
       }
       else if(yr%100 == 0)
       {
           System.out.print("Not a Leap Year");
       }
       else if(yr%400 == 0)
       {
           System.out.print("Leap Year");
       }
       else
       {
           System.out.print("Not a Leap Year");
       }
    }
}
