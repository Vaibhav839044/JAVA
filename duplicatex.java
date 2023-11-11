//Write a java program to find duplicate elements in an array?

import java.util.*;

class duplicatex
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

		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}