package week3day1;

public class Safari extends Browser{
	
	public void readerMode() {
		System.out.println("Reader Mode");
	}
	public void fullScreen() {
		System.out.println("Maximized Screen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari nw=new Safari();
		nw.openURL();
		nw.closeBrowser();
		nw.readerMode();
		nw.fullScreen();
		System.out.println(nw.browserName);
		System.out.println(nw.browserVersion);
	}

}
