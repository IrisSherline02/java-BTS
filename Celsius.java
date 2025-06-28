import java.util.Scanner;

class Celsius
{
public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
System.out.print("enter the temperature in celsius ");
//float celsius =36.9f;
float celsius = scan.nextFloat();
double Fahrenheit=(celsius*1.8) +32;
System.out.print(Fahrenheit+" F");
}
}