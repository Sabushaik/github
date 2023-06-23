public class ref
{
public void finalize()
{
System.out.println("object garbage ");
}
public static void main(String args[])
{
ref s1 = new ref();
ref s2 = new ref();
s1=null;
s2=s1;
System.gc();
}
}
