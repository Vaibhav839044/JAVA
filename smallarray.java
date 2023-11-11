import java.util.*;
class smallarray
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int n = sobj.nextInt();

		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sobj.nextInt();
		}

		int min = arr[0];
		for(int i = 0;i<n;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}

		System.out.println("Smallest element is: "+min);
	}
}