import java.util.Scanner;
class Star15{
	public static void main(String[] args){
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please provide number of rows to print... ");
	int myrows = scanner.nextInt();
	System.out.println("\nThe star pattern is... ");
	
	for (int m = 1; m <= myrows; m++)
	{
		for (int n=1; n<=m; n++)
		{
			if( n == 1 || n == m || m == myrows)
				System.out.print("*");
			else
				System.out.print(" ");
		}
	System.out.println();
	}
}
}