package homeassignements;

public class HALibrary {
	
	String addBook(String bookTitle)
	{
		System.out.println("Book Added Successfully!");
		return(bookTitle);
	}
	
	void issueBook()
	{
		System.out.println("Book Issued Successfully!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HALibrary LibraryManagement = new HALibrary();
		LibraryManagement.addBook(null);
		LibraryManagement.issueBook();

	}

}
