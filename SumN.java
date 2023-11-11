import java.util.*;

class SumN
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int n = sobj.nextInt();

		System.out.println(n*(n+1)/2);
	}
}