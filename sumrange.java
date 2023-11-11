import java.util.*;
class sumrange
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a = sobj.nextInt();
		System.out.println("Enter a last number: ");
		int b = sobj.nextInt();
        int sum = 0;
		for(int i = a;i<=b;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}