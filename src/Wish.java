class Wish
{
public static void main(String args[])
{
if(args.length==2)
{
String time=args[0];
String name=args[1];
//equalsIgnoreCase()--->it ignore the case sensitive just check the value
	if(time.equalsIgnoreCase("am"))
	{
		System.out.println("Good Morning.. "+name);
	}
		else if(time.equalsIgnoreCase("pm"))
		{
			System.out.println("Good Evening.. "+name);
		}
			else
			{
				System.err.println("Please enter a valid input to get O/P");
}
}
else
{
System.err.println("Please enter only 2 input to get O/P..");
}
}
}