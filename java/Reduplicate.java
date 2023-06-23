import java.util.*;
public class Reduplicate
{
public static void main(String args[])
{
int n , i,j,count=0;
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
System.out.println("Duplicate elements ");

for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]!=a[j])
{
count=1;
}
if(count!=0)
{
System.out.println(a[]);
}

}
}
}
}

