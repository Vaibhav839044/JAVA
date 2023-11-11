class stringcompare{
	public static void main(String arg[]){
		String str1 = "shubham";
		String str2 = "vaibhav";
		System.out.println(str1.length() + str2.length());
		if(str1.compareTo(str2) > 0){
			System.out.println("Yes");
		}

		else{
			System.out.println("No");
		}

		str1 = (str1.substring(0,1).toUpperCase() + str1.substring(1));
	    str2 = (str2.substring(0,1).toUpperCase() + str2.substring(1));

	    System.out.println(str1+" "+str2);




		

        


        
	}
}




//a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  t  z

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26