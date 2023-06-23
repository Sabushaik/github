
import java.util.*;
public class rightrotation
{
public static void main(String args[])
{
int i,j,last=0, n;


Scanner obj = new Scanner (System.in);
System.out.println("enter the size of array");
 n = obj.nextInt();
int a[]= new int [n];

for (i =0; i<n;i++)
{
System.out.println("enter the "  +i+ " element"); 
a[i]=obj.nextInt();
}
System.out.println("ARRAY ELEMENTS ");

for(i=0;i<n ; i++)
{
System.out.println(a[i]);
}
for(i=0;i<3;i++)
{

last =a[n-1];
for(j=n-1;j>0;j--)
{
a[j]=a[j-1];
}
a[0]=last;
}
System.out.println("After rotation");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
