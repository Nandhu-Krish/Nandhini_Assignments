package week3day1;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println("Snap Taken");
	}
	public void clearCookies() {
		System.out.println("Cookies Cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge nw=new Edge();
		nw.openURL();
		nw.closeBrowser();
		nw.navigateBack();
		nw.takeSnap();
		nw.clearCookies();
		System.out.println(nw.browserName);
		System.out.println(nw.browserVersion);
	}

}
