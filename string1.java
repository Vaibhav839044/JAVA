import java.util.*;
class string1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter a character : ");
		char str = sobj.next().charAt(0);

		if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u' || str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U')
		{
			System.out.println(str + " is a vowel");
		}

		else
		{
			System.out.println(str + " is a consonant");
		}
	}
}