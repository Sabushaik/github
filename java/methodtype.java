public class methodtype
{
void msg()
{
System.out.println("hi bro");
}
void add(int a , int b)
{
System.out.println(a+b);
}
int sum( int a , int b)
{
int c ;
c=a+b;
return c;
}
public static void main(String args[])
{
methodtype s1 = new methodtype();
s1.msg();
s1.add(2,4);
int a=s1.sum(45,67);
System.out.println(a);
}
}
