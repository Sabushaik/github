import java.util.*;
public class somer
{
static void display()
{
int n;
String name;

Scanner sc = new Scanner(System.in);
System.out.println("Name of the student:" );
name=sc.next();
System.out.println("  id number ");
n=sc.nextInt();
System.out.println("-----");
System.out.println("Name :-"+name);
System.out.println("ID:-"+n);
System.out.println("---------");                                                   
}

public static void main(String args[])
{
int i; 
for(i=1;i<=4;i++)
{
display();
}
}
}

