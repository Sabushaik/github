
import java.util.*;
public class leftrotation
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
System.out.println("rotation of the array");
for(i=3;i>0;i--)
{
last = a[0];
for(j=0;j<n-1;j++)
{
a[j]=a[j+1];
}
a[j]=last;
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

