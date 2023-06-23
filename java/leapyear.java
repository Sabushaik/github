import java.util.*;
public class leapyear 
{
public static void main(String args[])
{
int n , year , temp ;
Scanner sc = new Scanner(System.in);
System.out.println("enter the year ");
n=sc.nextInt();
if((n%4 ==0 && n%100 != 0) || n%400==0)
{

System.out.println("yes leap year ");
}
else 
{
System.out.println("not a leap year ");
}
}
}


