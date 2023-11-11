import java.util.*;
class primerange
{
	public static void checkprime(int n)
	{
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
			System.out.println(n);
			
		}
	}
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int a = sobj.nextInt();
		int b = sobj.nextInt();
       
		for(int i = a;i<=b;i++)
		{
			checkprime(i);
		}
	}
}