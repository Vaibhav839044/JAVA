//Find Smallest Element in an Array 

import java.util.Scanner;
class array3{
	public static void main(String arg[]){
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int n = sobj.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++){
			arr[i] = sobj.nextInt();
		}
		
		int b = checkmax(arr);
		System.out.println("Largest element is : "+b);
	}
	
	public static int checkmax(int brr[])
	{
		int large = 0;
		for(int i = 0;i<brr.length;i++){
			for(int j = 0;j<brr.length;j++){
				if(brr[i] < brr[j]){
					large = brr[j];
				}
			}
		}
		return large;
	}
	
	
}
		