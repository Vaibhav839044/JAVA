import java.util.*;
class palindrome
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sobj.nextInt();

		int irev = 0 , idigit = 0;
		int temp = num;
		while(temp != 0)
		{
			idigit = temp % 10;
			irev = (irev * 10) + idigit;
			temp = temp / 10;
		}

		if(irev == num)
		{
			System.out.println("Number is palindrome number.");
		}

		else
		{
			System.out.println("Number is not palindrome number.");
		}






	}
}