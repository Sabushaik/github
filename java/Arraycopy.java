public class Arraycopy
{
public static void main(String args[])
{
int a[]={12,3,3,4,5};
int b[]=new int[5];
int i,j;

for(i =0; i<5;i++)
{
System.out.println("array " +a[i]);
b[i]=a[i];
}
System.out.println("---- Array copy-----");
for(j=0;j<5;j++)
{


System.out.println("b array " + b[j]);
}
}
}
