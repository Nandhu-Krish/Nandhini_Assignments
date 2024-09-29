package week3day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Incognito Mode");
	}
	public void clearCache() {
		System.out.println("Cache Cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser lc = new Browser();
		Chrome nw=new Chrome();
		nw.openURL();
		nw.closeBrowser();
		nw.navigateBack();
		nw.openIncognito();
		nw.clearCache();
		System.out.println(nw.browserName);
		System.out.println(nw.browserVersion);
	}

}
