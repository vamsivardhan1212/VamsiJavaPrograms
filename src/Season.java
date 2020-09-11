import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		//int season=Integer.parseInt(args[0]);
		//int value=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check the Season.");
		int season=sc.nextInt();
		switch(season)
		{
		case 1:
			System.out.println("It is a Summer Season 1");
			break;
		case 2:
			System.out.println("It is a Summer Season 2");
			break;
		case 3:
			System.out.println("It is a Summer Season 3");
			break;
		case 4:
		case 5:
		case 6:
		//case 7:
				System.out.println("It is a Rainy Season");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("It is a Spring Season");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("It is a Winter Season");
			break;
			default:
				System.out.println("It is a Invalid Season");
		}

	}

}
