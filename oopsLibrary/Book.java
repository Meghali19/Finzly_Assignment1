package oopsLibrary;

public class Book extends LibraryItem 
{
    private String author;
    public Book(String author, String title, int itemId)
    {
    	super(title, itemId);
    	this.author = author;
    }
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public void displayInfo()
	{
	    System.out.println(getTitle()+ " Book having ID "+getItemId()+" is written by Author "+author);	
	}
     
}
