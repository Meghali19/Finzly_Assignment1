package Country;

public class City 
{
	public City()
	{
	}
	
	private String stateName;
	private String name;
	private int area;
	
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	

	
	public City(String stateName, String name, int area) {
		super();
		this.stateName = stateName;
		this.name = name;
		this.area = area;
	}
	
	
	@Override
	public String toString() {
		return "City [stateName=" + stateName + ", name=" + name + ", area in km=" + area + "]";
	}
	
	
}
