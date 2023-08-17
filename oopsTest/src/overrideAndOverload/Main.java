package overrideAndOverload;
import java.util.Date;
public class Main
{
	public static void main(String[] args)
	{
	    Room room = new Room(101, 2, 1000);
	    System.out.println("Rooms Avalaible: "+Room.getCapacity());
	
	    room.reservation(new Date(), new Date());
	    System.out.println("Rooms Avalaible: "+Room.getCapacity());
	    
	    room.reservation();
	    System.out.println("Rooms Avalaible: "+Room.getCapacity());
	    
	    room.reservation();
	    System.out.println("Rooms Avalaible: "+Room.getCapacity());

	}
}
