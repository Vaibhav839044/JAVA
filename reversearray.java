import java.util.*;
class reversearray
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		int n = sobj.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i<n;i++)
		{
			arr[i] = sobj.nextInt();

		}


		for(int i = n - 1;i >= 0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}