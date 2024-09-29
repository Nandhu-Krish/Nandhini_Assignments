package week3day1;

public class EdgeDriver extends ChromeDriver {
	
	public void launchBrowser() {
		System.out.println("www.google.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver ed = new EdgeDriver();
		ed.launchBrowser();
		}

}
