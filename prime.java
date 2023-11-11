import java.util.*;
class prime
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int n = sobj.nextInt();

		int cnt = 0;
		for(int i = 1;i<=n/2;i++)
		{
			if((n % i) == 0)
			{
				cnt++;
			}
		}
		if(cnt < 2)
		{
			System.out.println("Number is prime number.");
		}
		else
		{
			System.out.println("Number is not a prime number.");
		}
	}
}