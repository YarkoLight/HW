package HW;

public class Dog {
	
	private String name;
	private BREED breed;
	private int age;

	public Dog() {

	}

	public Dog(String name, BREED breed, int age) {

		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BREED getBreed() {
		return breed;
	}

	public void setBreed(BREED breed) {
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
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (breed != other.breed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void dogEquals(Dog dog1, Dog dog2, Dog dog3) {

		if ((dog1.getName().equals(dog2.getName())) || (dog1.getName().equals(dog3.getName()))) {
			System.out.println("Two dogs are presented with the same name");
		} else if (dog2.getName().equals(dog3.getName())) {
			System.out.println("Two dogs are presented with the same name");
		} else {
			System.out.println("In list is not presented any dogs with two same name");
		}

	}

	public void ageOfOldest(Dog dog1, Dog dog2, Dog dog3) {
		if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
			System.out.println("The oldest dog is " + dog1.getName() + " " + dog1.getBreed());
		} else if (dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is " + dog2.getName() + " " + dog2.getBreed());
		} else {
			System.out.println("The oldest dog is " + dog3.getName() + " " + dog3.getBreed());
		}
}

}
