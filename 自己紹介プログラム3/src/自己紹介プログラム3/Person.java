package 自己紹介プログラム3;

class Person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	// Main.javaに合わせてlastName → firstNameの順に
	Person(String lastName, String firstName, int age, double height, double weight) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public String fullName() {
		return this.lastName + this.firstName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

}