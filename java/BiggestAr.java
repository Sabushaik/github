import java.util.*;
public class BiggestAr
{
public static void main(String args[])
{
int i , n;
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
System.out.println("Biggest element ");
for(i=0;i<n ;i++)
{
for(int j=i+1;j<n-1;j++)
{
if(a[i]>a[j]);
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println(a[j]);

}
}
