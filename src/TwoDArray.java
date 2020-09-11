
public class TwoDArray {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6},{10,20,30}};
		//outer for loop
		//til the outer for loop condition is true then it will check the inner for loop condition
		//this for loop allow to create a new line to print the o/p
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<=2;col++)
			{
				//this statement to print the array values
				System.out.print(arr[row][col]+"   ");				
			}
			//this statement to move the cursor next line
System.out.println();
			
		}

	}

}
