package week3day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name in Reverse Order - (Nandhini) :");
		//IMPORTANT reverse string
		String name="Nandhini";
		
		//ER avaJ
		char[] na = name.toCharArray();
		for (int i=na.length-1; i>=0; i-- ) {
			System.out.print(na[i]);
			
		}
		
	}

}
