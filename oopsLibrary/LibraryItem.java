package oopsLibrary;

public class LibraryItem
{
	private String title;
	private int itemId;
	
	public LibraryItem(String title, int itemId) 
	{
		super();
		this.title = title;
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public void displayInfo()
	{
		System.out.println("Item "+title+" having ID "+itemId);
	}
	
	

}
