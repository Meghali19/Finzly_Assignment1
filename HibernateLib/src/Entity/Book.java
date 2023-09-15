package Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Book 
{
	private String title;
	private String author;
	private int pubyear;
	private String isbn;
	
	
	public Book(){}
	
	public Book(String authorname, String author, int pubyear, String isbn) {
		super();
		this.title = authorname;
		this.author = author;
		this.pubyear = pubyear;
		this.isbn = isbn;
	}
	
	
	@Id
	public String gettitle() {
		return title;
	}
	public void setTitle(String authorname) {
		this.title = authorname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPubyear() {
		return pubyear;
	}
	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [authorname=" + title + ", author=" + author + ", pubyear=" + pubyear + ", isbn=" + isbn
				+ "]";
	}

}
