//Find Largest element in an array :

import java.util.*;
class array{

	public static int checklargest(int arr[]){
		int max = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 1;j<arr.length;j++){
				if(arr[i] < arr[j]){
					arr[i] = arr[j];
					max = arr[i];
				}
			}
		}

		return max;
	}
	public static void main(String arg[]){
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int n = sobj.nextInt();

		int arr[] = new int[5];
		for(int i = 0;i<n;i++){
			arr[i] = sobj.nextInt();
		}

		int b = checklargest(arr);
		System.out.println("Largest element in the array is: "+b);

	}
}