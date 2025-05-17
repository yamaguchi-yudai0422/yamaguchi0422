
class Person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

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

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	//インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
