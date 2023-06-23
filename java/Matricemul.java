import java.util.*;
public class Matricemul
{
public static void main(String args[])
{
int n ,i,j,k,l,m;
Scanner sc = new Scanner(System.in);
System.out.println("enter  no of rows");
n=sc.nextInt();
System.out.println("enter the no of columns ");
l=sc.nextInt();
int a[][]= new int[n][l];
for(i =0; i<n ; i++)
{
for(j=0;j<l;j++)
{
System.out.println("enter array element ");
a[i][j]=sc.nextInt();
}
}
System.out.println("MATRICE");

for(i=0;i<n;i++)
{

for(j=0;j<l ;j++)
{
System.out.println("a["+i+"]["+j+"]=" +a[i][j]);
}
}
System.out.println("--Second matrice--");

int b[][]= new int[n][l];
for(i =0; i<n ; i++)
{
for(j=0;j<l;j++)
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
System.out.println("prouct of two matrices");
int mul[][]= new int[l][n];

for(i=0;i<l;i++)
{

for(j=0;j<n ;j++)
{
mul[i][j]=0;
for(k=0;k<l;k++)
{
mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<l;j++)
{
System.out.println("mul["+i+"]["+j+"]=" +mul[i][j]);
}
}
}
}