package overrideAndOverload;
import java.util.Date;

public class Room 
{
	private int roomNumber;
	private static int capacity;
	private int pricePerNight;
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	
	public static int getCapacity()
	{
		return capacity;		
	}
	public static void setCapacity(int capacity)
	{
		Room.capacity = capacity;
	}
	
	public int getPricePerNight()
	{
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight)
	{
		this.pricePerNight = pricePerNight;
	}
	
	public Room(int roomNumber, int capacity, int priceperNight)
	{
		this.roomNumber = roomNumber;
		Room.capacity = capacity;
		this.pricePerNight = priceperNight;
	}
	
	public boolean checkAvailability()
	{
		if(capacity>0)
			return true;
		return false;
	}
	
	public void reservation()
	{
		if(checkAvailability())
		{
	        System.out.println("Your "+toString()+" is booked without checkin and checkout dates!!");
	        capacity --;   
		}
		else
	    {
	    	System.out.println("Sorry for inconvinience!! No room available");
	    }
	}
	
	public void reservation(Date checkin, Date checkout)
	{
		if(checkAvailability())
		{
			 System.out.println("Your "+toString()+" from "+checkin+ " to "+ checkout);	
			 capacity --;
		}
	   
	}
	
	@Override
	public String toString()
	{
		return "RoomNumber: "+roomNumber+" is booked with capacity of 1 persons at Price per night: "+pricePerNight;
	}
	
	
	
}
