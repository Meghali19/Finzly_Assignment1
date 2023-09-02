package hospital;

public class Patient
{
	private String name;
	private String gender;
	private int age;
	private String disease;
	
	public Patient()
	{
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Patient(String name, String gender, int age, String disease) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", gender=" + gender + ", age=" + age + ", disease=" + disease + "]";
	}
	

}
