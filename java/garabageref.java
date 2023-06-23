public class garbageref
{
public void finalize()
{
System.out.println("object garbage is collected ");
}
public static void main(String args[])
{
garbageref s1 = new garbageref();
garbageref s2 = new garbageref();
s1=null;
s2=s1; 
System.gc();
}
}
