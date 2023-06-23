public class sabu 
{
public void finalize()
{
System.out.println("garbage is collected ");
}
public static void main(String args[])
{
sabu s1 = new sabu();
s1=null;
new sabu();
System.gc();
}
}