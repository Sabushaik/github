import java.util.*;
public class BAR
{
public static void main(String args[])
{
int i , n,j=0;
int t=0;

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
t=a[0];
System.out.println("Biggest element ");
for(i=0;i<n ;i++)
{
if(a[i]>t)
t=a[i];
}

System.out.println(t);

}
}
