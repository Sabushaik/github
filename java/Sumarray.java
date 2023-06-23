
import java.util.*;
public class Sumarray
{
public static void main(String args[])
{
int i , t=0,n;

Scanner sc = new Scanner(System.in);

System.out.println("enter the size of array");
n=sc.nextInt();
int a[]= new int[n];

for(i=0;i<n;i++)
{
System.out.println("enter the data ");
a[i]=sc.nextInt();

}
System.out.println("your array ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n;i++)
{
t=t+a[i];
}

System.out.println("sum of array elements ");
System.out.println(t);
}
}

