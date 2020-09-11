
public class PrintSpace {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num>=100 && num<=9999)
		{
			String input=args[0];
			int length=input.length();
			for(int pos=0;pos<length;pos++)
			{
				char ch=input.charAt(pos);
				System.out.print(ch+" ");
			}
		}
		else
		{
			System.err.println("Please enter the number with in range:");
		}

	}

}
