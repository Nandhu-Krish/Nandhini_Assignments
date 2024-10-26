package homeassignements;

public class HAReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester";
		String[] words=text.split(" ");
		int wordscount=words.length;
		System.out.println(wordscount);
		
		for (int i = 0; i < wordscount; i++) {
			//System.out.print(words[i]);
					
			if(i%2==0) {
				
				System.out.print(words[i]);
				System.out.print(" ");
					
				}else {
					String rword = words[i];
					char[] revwords = rword.toCharArray();
					for (int j=revwords.length-1; j>=0; j-- ) {
					System.out.print(revwords[j]);
			
			}System.out.print(" ");
				}
			}
		}
	}


	
/* ODD LENGTH WORDS REVERSE IN STRING



public static void main(String[] args) {

   // Define a string 'text' with a sentence
   String text = "I am a softwares tester";
   System.out.println("Original text: " + text); // Display the original text
   
   // Reverse the words with odd lengths in the string and display the modified string
   System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
   
}

// Method to reverse words with odd lengths in a string
public static String test(String str) {
   // Split the string into words using space as a delimiter
   String[] str_words = str.split(" ");
   
   // Iterate through each word in the array
   for (int i = 0; i < str_words.length; i++) {
       // Check if the length of the word is odd
       if ((str_words[i].length()) % 2 != 0) {
           // Reverse the word using StringBuilder and update the array element
           StringBuilder reverser = new StringBuilder(str_words[i]);
           str_words[i] = reverser.reverse().toString();
           
       }
   }
   
   // Join the modified words to form a string and return the result
   return String.join(" ", str_words);
}*/

