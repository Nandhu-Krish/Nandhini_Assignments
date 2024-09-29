package week3day1;

import java.util.Iterator;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String literal
		String name="TestLeaf";
		
		//String object
		String comName=new String("Testleaf");
		
		//Length of the string
		int charCount=name.length();
		System.out.println("Number of chars : "+charCount);
		
		//equals - case sensitive and content match
		if(name.equals(comName)) {
			System.out.println("Its Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
		//equalsIgnoreCase - without case sensitive and content match only
		if(name.equalsIgnoreCase(comName)) {
			System.out.println("Its Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
		//b/w == and .equals()
		//== -> memory address of string value
		if(name==comName) {
			System.out.println("Its == ");
		}else {
			System.out.println("Not == ");
		}
		
		
		String n="TestLeaf";
		if(name==n) {
			System.out.println("Its == ");
		}else {
			System.out.println("Not == ");
		}
		
		
		//Contains - sequence of character and case sensitive
		boolean contains=n.contains("Leaf");
		System.out.println(contains);
		
		
		//charAt(index)
		char charAt=n.charAt(5);
		System.out.println(charAt);
		
		//toCharArray
		String value="Selenium";
		
		char[] ch=value.toCharArray();
		
		for(int i=0; i<value.length();i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		//IMPORTANT reverse string
		String data="Java";
		
		//ER avaJ
		char[] ch1 = data.toCharArray();
		for (int i=ch1.length-1; i>=0; i-- ) {
			System.out.print(ch1[i]);
			
		}
		
		
	}

}
