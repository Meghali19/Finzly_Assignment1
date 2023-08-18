package oopsLibrary;

public class Dvd extends LibraryItem 
{
	private int duration;
    public Dvd(int duration, String title, int itemId)
    {
    	super(title, itemId);
    	this.duration = duration;
    }
	public int getDuration() {
		return duration;
	}
	public void setAuthor(int duration) {
		this.duration = duration;
	}
	
	@Override
	public void displayInfo()
	{
	    System.out.println(getTitle()+ " DVD having ID "+getItemId()+" is of "+duration+" hrs");	
	}

}
