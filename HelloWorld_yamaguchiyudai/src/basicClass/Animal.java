package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
		Dog dog1 = new Dog();

		System.out.println(dog1.getName());

		// Q2：Dogクラスを呼び出して引数で犬の数を渡す
		Dog dog2 = new Dog(3); // ← ここで犬の数を明示的に渡す

		// 動物の数を出力
		System.out.println(dog2.getCount());

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		LocalDateTime now = LocalDateTime.now();
		String formattedDateTime = now.format(formatter);
		System.out.println(formattedDateTime);
	}
}
