import java.util.*;
class sumnatural
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int n = sobj.nextInt();
		int sum = 0;

		for(int i = 0;i<=n;i++)
		{
			sum = sum + i;

		}

		System.out.println(sum);
	}
}