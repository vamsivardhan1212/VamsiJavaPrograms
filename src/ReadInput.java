//hpw to read the input using scanner class
import java.util.*;
class ReadInput
{
public static void main(String args[])
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter Your Name");
String name=inp.nextLine();
System.out.println("Enter Your id");
int id=inp.nextInt();
System.out.println("Enter Your marks");
float marks=inp.nextFloat();
System.out.println("Enter Your Grade");
char grade=inp.next().charAt(1);
System.out.println("Name is: "+name);
System.out.println("ID is: "+id);
System.out.println("marks is: "+marks);
System.out.println("Grade is: "+grade);
}
}





