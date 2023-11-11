import java.util.*;
class secondsmall
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

		int min = arr[0];

		for(int i = 0;i<n;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}

		int secmin = arr[0];

		for(int j = 0;j<n;j++)
		{
			if(secmin > arr[j] && arr[j] != min)
			{
				secmin = arr[j];
			}
		}

		System.out.println(secmin);
	}
}