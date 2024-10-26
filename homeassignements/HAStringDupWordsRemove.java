package homeassignements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HAStringDupWordsRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words=text.split(" ");
		int wordscount=words.length;
		System.out.println(wordscount);
		

		
		
		String result = " ";
		//int count=0;
		for (int i = 0; i < words.length; i++) {
			//System.out.print(words[i]);
			//count=1;
			for (int j = i+1; j < words.length; j++) {
				
			if(words[i].equals(words[j])) {
	
				words[j]="remove";
				//System.out.print(words[j]);
				}
			}
			}
		for(String allwords:words) {
			if(allwords!="remove") {
				result=result+allwords+" ";
				
			}
		}
		System.out.println(" Duplicates removed: "+result);
		/*List<String> unique=new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			unique.add(words[i]);
		}
		System.out.println(unique);
		Collections.sort(unique);
		System.out.println(unique);
		for (int i = 0; i < unique.size()-1; i++) {
			if(unique.get(i)==unique.get(i+1))
			{
				System.out.println("Duplicate words are: "+unique.get(i+1));
			}
		}*/
		
	}
}


