import java.util.*;
public class Array 
{
public static void main(String args[])
{
int i , n;


Scanner obj = new Scanner (System.in);
System.out.println("enter the size of array");
 n = obj.nextInt();
int a[]= new int [n];

for (i =0; i<n;i++)
{
System.out.println("enter the element");
a[i]=obj.nextInt();
}
System.out.println("ARRAY ELEMENTS ");

for(i=0;i<n ; i++)
{
System.out.println(a[i]);
}

obj.close();

}


}
