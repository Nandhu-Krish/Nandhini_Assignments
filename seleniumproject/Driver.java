package week3day1;

public class Driver {

	public void loadUrl(String url, boolean status) {
		System.out.println(url+" "+status);
		
	}
	public void loadUrl (String url)
	{
		System.out.println(url);
		
	}
	
	
	public static void main(String[] args) {
		Driver lc=new Driver();
		lc.loadUrl("https://www.amazon.com", true);
		lc.loadUrl("https://www.flipkart.com");
		
	}
	
}
