import java.util.*;
class greatthree
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int a = sobj.nextInt();
		int b = sobj.nextInt();
		int c = sobj.nextInt();
		if(a > b && a > c)
		{
			System.out.println(a + " is the greatest number from the these three numbers.");
		}
		else if(b > a && b > c)
		{
			System.out.println(b + " is the gretest number these three numbers.");
		}
		else
		{
			System.out.println(c + " is the greatest number from these three numbers.");
		}
	}
}