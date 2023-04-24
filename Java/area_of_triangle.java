import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first side of the rectangle");
		int a = scan.nextInt();
		System.out.println("Enter the second side of the rectangle");
		int b = scan.nextInt();
		// less variables used
		System.out.println("Area of the rectangle is "+ (a*b));
		Systme.out.println("Perimeter of the rectangle is " + 2*(a+b));

	}
}
