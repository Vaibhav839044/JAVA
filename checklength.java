import java.util.*;
class checklength{
	public static void main(String args[]){
		Scanner sobj = new Scanner(System.in);
		//String str = new String();
		System.out.println("Enter a string : ");
		
		String str = sobj.nextLine();
		checklen(str);
	}
	
	public static void checklen(String s)
	{
		int j = 0;
		for(int i = 1;i<=s.length();i++)
		{
			j++;
		}
		System.out.println("Length of the string is: "+j);
	}
		
}
		
		