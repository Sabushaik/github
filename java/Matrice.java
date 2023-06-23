import java.util.*;
public class Matrice
{
public static void main(String args[])
{
int n ,i,j,k,l,m;
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
System.out.println("--Second matrice--");

int b[][]= new int[n][n];
for(i =0; i<n ; i++)
{
for(j=0;j<n;j++)
{
System.out.println("enter array element ");
b[i][j]=sc.nextInt();
}
}
System.out.println("MATRICE");

for(i=0;i<n;i++)
{

for(j=0;j<n ;j++)
{
System.out.println("b["+i+"]["+j+"]=" +b[i][j]);
}
}
System.out.println("Sum of two matrices");
int c[][]= new int[n][n];

for(i=0;i<n;i++)
{

for(j=0;j<n ;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.println("c["+i+"]["+j+"]="+c[i][j]);
}
}

}
}