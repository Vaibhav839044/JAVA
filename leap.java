import java.util.*;
class leap
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int year = sobj.nextInt();

		if(((year % 400) == 0 ))
		{
			System.out.println("This is leap year.");

		}
		else if((year % 4) == 0 && (year % 100) != 0)
		{
			System.out.println("This is leap year.");
		}
		
		else
		{
			System.out.println("This is not a leap year.");
		}
		
		
	}
}