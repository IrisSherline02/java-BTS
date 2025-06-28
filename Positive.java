import java.util.Scanner;
class Positive
{
public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
 System.out.print("enter number: ");
 float num = scan.nextFloat();
if(num>0)
{
 System.out.println("the number is positive");
}
else if(num<0)
{
System.out.println("Negative number");
}
else
{
System.out.println("Invalid");
}
}
}