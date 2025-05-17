package 自己紹介プログラム2;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;

	// 問題1：クラスフィールド「count」を定義
	public static int count = 0;

	// コンストラクタ
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 問題2：countに1を足す
		count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です\n");
	}

	// 問題4：クラスメソッド「printCount」を定義
	public static void printCount() {
		// 問題5：countを使って出力
		System.out.println("合計" + count + "人です");
	}
}
