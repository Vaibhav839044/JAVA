//Sort first half in ascending order and second half in descending 

import java.util.*;

class arrangearray
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

		Arrays.sort(arr);


		for(int i = 0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}
}