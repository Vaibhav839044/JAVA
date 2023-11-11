import java.util.*;
class swapping{
	
	public static void swappingfun(int a , int b){
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("With third variable.");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void main(String arg[]){
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a = sobj.nextInt();
		System.out.println("Enter a second a number: ");
		int b = sobj.nextInt();
		swappingfun(a,b);
		withoutSec(a,b);
	}
	
	public static void withoutSec(int a , int b){
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Without third variable.");
		System.out.println(a);
		System.out.println(b);
	}
	
	
}