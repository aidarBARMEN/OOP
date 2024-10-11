package lab2;

public class Magazine extends LibraryItem{
	private int numberOfPages;
	private String personality;
	
	public Magazine(String title, String author, int publicationYear, String personality, int pages) {
		super(title, author, publicationYear);
		this.personality = personality;
		this.numberOfPages = pages;
	}
	public String toString() {
		return super.toString() + ", Personality we talk about is " + personality + ", Number of pages: " + numberOfPages;
	}

}
