import java.util.*;
public class reverse 
{
public static void main(String args[])
{
int n , i;
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
n=sc.nextInt();

int a[]= new int[n];
for(i =0; i<n ; i++)
{
System.out.println("enter array element ");
a[i]=sc.nextInt();
}
System.out.println("your array");

for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Reverse of the array ");
for(i=4;i>-1;i--)
{
System.out.println(a[i]);
}
}
}

