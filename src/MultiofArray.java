
public class MultiofArray {

	public static void main(String[] args) {
		int arr1[][]={{1,2,3},{3,5,7},{1,2,3}};
		int arr2[][]={{1,2,3},{1,2,3},{1,2,3}};
		int arr3[][]=new int[3][3];
				for(int row=0;row<3;row++)
				{
					for(int col=0;col<3;col++)
					{
						arr3[row][col]=arr1[row][col]*arr2[row][col];
						System.out.print(arr3[row][col]+ " ");
						
					}
					System.out.println();
					}
				
		
		

	}

}
