public class oops2
{
String name ;
String id ;
int roll ;
static String section = "CSE-04";
static String branch = " CSE E-01";
static String clg= "RGUKT NUZVID ";
void insert( String n , String i , int r , String c ,String br, String cl )
{
name = n;
id= i;
roll = r;
//section=c;
//branch=br;
//clg=cl;
}
void display()
{
System.out.println("name :- " +name);
System.out.println(" id :-" +id);
System.out.println("roll:- " +roll);
System.out.println("class :-" +section);
System.out.println(" branch:- " +branch);
System.out.println("college :-" +clg);
}
public static void main(String args[])
{
oops2 obj = new oops2();
obj.insert("sabu","N190511" , 28, section,branch,clg);
obj.display();
oops2 obj1 = new oops2();
obj1.insert("Nani" , "N190951" , 47 , section ,branch,clg);
obj1.display();

oops2 obj2 = new oops2();
obj2.insert("ALI" , "N190952" , 29,section ,branch,clg);
obj2.display();


}

}