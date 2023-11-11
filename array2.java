//Find smallest element in an array

import java.util.*;
class array2{
	public static int checkmin(int brr[]){
		int small = 0;
		for(int j = 0;j<brr.length;j++){
			
			for(int k = 0;k<brr.length;k++){
				if(brr[j] > brr[k]){
					small = brr[k];
				}
			}
		}
		
		return small;
	}
	public static void main(String arg[]){
		System.out.println("Enter a number of elements: ");
		Scanner sobj = new Scanner(System.in);
		int n = sobj.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++){
			arr[i] = sobj.nextInt();
		}
		
		int b = checkmin(arr);
		System.out.println("Smallest element is : "+b);
		
	}
}
					
		