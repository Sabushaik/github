import java.util.*;
public class TMatrice
{
public static void main(String args[])
{
int n ,i,j,k,l,temp=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter  no of rows");
n=sc.nextInt();

int a[][]= new int[n][n];
for(i =0; i<n ; i++)
{
for(j=0;j<n;j++)
{
System.out.println("enter array element ");
a[i][j]=sc.nextInt();
}
}
System.out.println("MATRICE");

for(i=0;i<n;i++)
{

for(j=0;j<n ;j++)
{
System.out.println("a["+i+"]["+j+"]=" +a[i][j]);
}
}

System.out.println("transpose matrix");

for(i=0;i<n;i++)
{

for(j=0;j<i ;j++)
{
temp=a[i][j];
a[i][j]=a[j][i];
a[j][i]=temp;
}
}
for(i=0;i<n;i++)
{

for(j=0;j<n ;j++)
{
System.out.println("tra["+i+"]["+j+"]=" +a[i][j]);
}
}


}
}
