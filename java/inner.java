public class inner 
{
private int a;
public class inner2
{
void innermsg()
{
System.out.println("hi ra hari");
}
}
void outermsg()
{
System.out.println("balupu thagginchu ra");

}
public static void main(String args[])
{
inner s1 = new inner();


inner.inner2 s2= s1.new inner2();
s2.innermsg();
s1.outermsg();
}
}
