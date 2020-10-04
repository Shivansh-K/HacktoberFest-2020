import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Units Used :");
		float unit=s.nextFloat();
		float amt;
		float tax;
		float total;
		if(unit<51)
		{ amt=(float)0.50*unit;
		  tax=(float)0.2*amt;
		  total=amt+tax;
		  System.out.println("The Total Electricity Bill is : " +total);
		}
		else if(unit<151)
		{amt=(float)0.75*unit;
		  tax=(float)0.2*amt;
		  total=amt+tax;
		  System.out.println("The Total Electricity Bill is : " +total);
		}
		else if(unit<251)
		{amt=(float)0.75*unit;
		  tax=(float)1.20*amt;
		  total=amt+tax;
		  System.out.println("The Total Electricity Bill is : " +total);
		}
		else if(unit>250)
		{amt=(float)0.75*unit;
		  tax=(float)1.50*amt;
		  total=amt+tax; 
		  System.out.println("The Total Electricity Bill is : " +total);
		}
		
}
}	
	
