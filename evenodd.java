import java.util.*;
class evenodd
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int n = sobj.nextInt();
		if((n % 2) == 0)
		{
			System.out.println("Even number");
		}

		else
		{
			System.out.println("Odd number");
		}
	}
}