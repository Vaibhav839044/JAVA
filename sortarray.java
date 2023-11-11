import java.util.*;

class sortarray
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
		int temp = 0;

		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i + 1; j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;



				}
			}
		}

		for(int i= 0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}