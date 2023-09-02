package school;

public class Teacher 
{
	private static int id = 0;
	private int teacherId;
	private String name;
	private String occupation;
	private int age;
	private double salary;

	public Teacher()
	{
		this.teacherId = ++id;
	}

	public Teacher(String name, int age, double salary, String occupation) {
		super();
		this.teacherId = ++id;
		this.name = name;
		this.occupation = occupation;
		this.age = age;
		this.salary = salary;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", occupation=" + occupation + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	
	
	
	
}
