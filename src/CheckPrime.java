
public class CheckPrime {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
				int count=0;
		for(int pos=2;pos<num;pos++)
		{
			if(num%pos==0)
			{
				count++;
				//if count is increment then it is not a prime that means the number can be divided with other
				System.out.println(count);
			}
		}
		if(count==0)
		{
			System.out.println("It is Prime Number: "+num);
		}
		else
		{
			System.out.println("It is Not a Prime Number: "+num);
		}

	}

}
