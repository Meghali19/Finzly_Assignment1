package school;

public class Student
{
	private String name;
	private static int number=0;
	private String occupation;
	private int rollNo;
	private int age;
	private int class1;
	
	public Student()
	{
		this.rollNo = ++number;
	}

	public Student(String name, int age, int class1, String occupation) {
		super();
		
		this.rollNo = ++number;
		this.name = name;
		this.occupation = occupation;
		this.age = age;
		this.class1 = class1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClass1() {
		return class1;
	}

	public void setClass1(int class1) {
		this.class1 = class1;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + " name=" + name + ", occupation=" + occupation + ", age=" + age
				+ ", class1=" + class1 + "]";
	}

	

}
