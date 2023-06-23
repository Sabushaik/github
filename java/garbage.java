public class garbage 
{
public void finalize()
{
System.out.println("object garbage is collected ");
}
public static void main(String args[])
{
garbage s1 = new garbage();
garbage s2 = new garbage();
s1=null;
s2=null; 
System.gc();
}
}
