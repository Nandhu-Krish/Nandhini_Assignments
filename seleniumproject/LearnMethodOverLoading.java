package week3day1;

public class LearnMethodOverLoading {
	

	public void driver(int noOfDriver) {
		System.out.println(noOfDriver);
		
	}
	public void driver (int taps, String name)
	{
		System.out.println(taps+" "+name);
		
	}
	public void driver (String url, boolean status, int count) {
		System.out.println(url+" "+count+" "+status);
	}
	
	//ex println - f3 for detailed code & frame(int),frame(webElement)
	
	public static void main(String[] args) {
		LearnMethodOverLoading lc=new LearnMethodOverLoading();
		lc.driver(5);
		lc.driver(2,"Chrome");
		lc.driver("https://www.testleaf.com", true, 1);
		
	}

}

