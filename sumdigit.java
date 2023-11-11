import java.util.*;
class sumdigit
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sobj.nextInt();
		int sum = 0 , idigit = 0;
		for(int i=0;i<=n;i++)
		{
			idigit = n % 10;
			sum = sum + idigit;
			n = n / 10;



		}
		System.out.println(sum);
	}
}