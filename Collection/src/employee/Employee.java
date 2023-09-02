package employee;

public class Employee 
{
	private static int count=0;
	private int empId;
	private String name;
	private int age;
	private String position;
	private double salary;
	
	public Employee()
	{		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, String position, double salary) {
		super();
		this.empId = ++count;
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [empId=" + empId + ", name=" + name + ", age=" + age + ", position=" + position + ", salary="
				+ salary + "]";
	}
		

}
