import java.util.Scanner;
public class OddEven
{
 public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("enter an integer: ");
int number=scan.nextInt();
if(number%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}
}