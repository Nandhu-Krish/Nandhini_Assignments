package homeassignements;

public class HAOddIndexUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		
		char[] testchary=test.toCharArray();
		
		for (int i = 0; i < testchary.length; i++) {
			if(i%2==0) {
				
				
				System.out.print(testchary[i]);
			}else {
				char j=Character.toUpperCase(testchary[i]);
				System.out.print(j);
			}
	}
	}
}
