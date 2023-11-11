//Find Second Smallest Element in an Array

import java.util.Scanner;
class array4{
	public static void main(String arg[]){
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int n = sobj.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++){
			arr[i] = sobj.nextInt();
		}
		int b = checkSecondLargest(arr);
		System.out.println("Second smallest element is: "+b);
	}
	
	public static int checkSecondLargest(int brr[]){
		int small = 0;
		
		for(int i = 0;i<brr.length;i++){
			for(int j = 0;j<brr.length;j++){
				if(brr[i] > brr[j]){
					small = brr[j];
				}
			}
		}
		
		int secsmall = 0;
		for(int k = 0;k<brr.length;k++){
			for(int m = 0;m<brr.length;m++){
				if(brr[k] > brr[m] && brr[m] != small)
				{
					secsmall  = brr[m];
				}
			}
		}
		return secsmall;
	}
		
}
		
		