package homework;

public class Dog {
	@MyAnnotation(params = "Dogs name")
	String name;
	@MyAnnotation(params = "Dogs breed")
	String breed;
	@MyAnnotation(params = "Dogs age")
	int age;
	
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "age" + age + "]";
	}

	
}
