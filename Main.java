import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
System.out.print("Enter marks: ");
int mark = scan.nextInt();

if(mark<0||mark>100)
{
System.out.print("Mark is Invalid");
}
else
{
char grade;
if(mark>=90)
{System.out.println("grade is S");
}
else if(mark>=80)
{System.out.println("grade is A");
}
else if(mark>=70)
{System.out.println("grade is B");
}
else if(mark>=60)
{System.out.println("grade is C");
}
else if(mark>=50)
{System.out.println("grade is D");
}
else
{System.out.println("grade is F");
}
}
}
}
