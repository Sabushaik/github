public class instance
{
public class inner
{
void innermsg()
{
System.out.println("enter ");
}
}
void outer()
{
System.out.println("outer");
inner n = new inner();
n.innermsg();
}
public static void main(String args[])
{
instance w1 = new instance();
w1.outer();
}
}
