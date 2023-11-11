import java.util.*;
class reversenum
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int num  = sobj.nextInt();

		int idigit = 0 , irev = 0;
		while(num != 0)
		{
			idigit = num % 10;
			irev = (irev * 10) + idigit;
			num = num / 10;
		}

		System.out.println("Revrese of the number is "+ irev);
	}
}