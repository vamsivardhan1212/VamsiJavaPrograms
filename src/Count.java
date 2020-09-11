
public class Count {

	public static void main(String[] args) {
		if(args.length==2)
		{
			String input=args[0];
			//charAt(0) which returns the 0 index position of given string ex: my input is abc then it return a because a has stored in 0 position
			char ch=args[1].charAt(0);
			int length=input.length();
			int count=0;
			for(int pos=0;pos<length;pos++)
			{
				if(input.charAt(pos)==ch)
				{
					count++;
				}
			}
			System.out.println(ch+" Occurs "+count+" Times of Given String");
		}
		else
		{
			System.err.println("Please enter only 2 Input to get Output..");
		}

	}

}
