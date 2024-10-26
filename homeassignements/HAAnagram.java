package homeassignements;

import java.util.Arrays;

public class HAAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		
		int t1char = text1.length();
		//System.out.println(t1char);
		
		int t2char = text2.length();
		//System.out.println(t2char);
		
		if(t1char==t2char) {
			//System.out.println("anagaram");
			char[] t1chary = text1.toCharArray();
			char[] t2chary = text2.toCharArray();
			Arrays.sort(t1chary);
			Arrays.sort(t2chary);
			
			//System.out.println(t1chary);
			//System.out.println(t2chary);
			
			String t1 = new String(t1chary);
			String t2 = new String(t2chary);
					
			
			if(t1.equals(t2))
			{
				System.out.println("The given strings are Anagram!");
			}else
			{
				System.out.println("The given strings are not an Anagram!");
			}
			
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram!");
		}
	}

}
