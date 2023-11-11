import java.util.*;
class largearray
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int n =sobj.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i<n;i++)
		{
			arr[i] = sobj.nextInt();
		}
        int max = arr[0];
		for(int i = 0;i<n;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}

			
		}

		System.out.println(max);


	}
}