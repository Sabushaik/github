
import java.util.*;
public class constructor 
{
int id;
String name;
constructor()//constructor 

{
System.out.println("Student constructor");
}
void display()
{
System.out.println(id+name);
}
public static void main(String args[])
{
constructor s1=new constructor();
s1.display();
}
}

