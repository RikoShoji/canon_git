package exam13;

public class Employee {
	private String name;
	private int age;

	Employee() {

	}

	Employee(String name, int age) {
		this.name = name;
		this.age = age;

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

	void introduce() {
		System.out.println(name + "さんは" + age + "歳です");

	}
}
