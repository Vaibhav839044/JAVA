import java.util.*;
class sumelements
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

		int sum = 0;

		for(int j = 0;j<arr.length;j++)
		{
			sum = sum + arr[j];

		}

		System.out.println(sum);
	}
}