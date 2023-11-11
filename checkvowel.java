//Check whether a character is a vowel or consonant
import java.util.*;

class checkvowel{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		char ch = sobj.next().charAt(0);
		
		checkvow(ch);
		
	}
	
	public static void checkvow(char c)
	{
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		}
		
		else{
			System.out.println("Invalid input");
		}
	}
}
		
		