import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first side of the rectangle");
		int a = scan.nextInt();
		System.out.print("Enter the second side of the rectangle");
		int b = scan.nextInt();
		int area=a*b;
		System.out.println("Area of the rectangle is "+area);

	}
}
