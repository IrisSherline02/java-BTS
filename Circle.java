import java.util.Scanner;
class Circle
{
 public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
System.out.println("enter the radius of the circle: ");
float r = scan.nextFloat();
float area = 3.14f*(r*r);
System.out.println("area of circle is" +area+ "sq units");
}
}