package aufgabe1;

public class Publication {
	private String title;
	private int year;
	
	public Publication(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	public String getInfo() {
		return title + ", published in " + year;
	}
}
