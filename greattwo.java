import java.util.*;
class greattwo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int a = sobj.nextInt();
		int b = sobj.nextInt();

		if(a > b)
		{
			System.out.println(a +"Greater than "+ b);
		}

		else
		{
			System.out.println(b + " is greater than "+ a);
		}
	}
}