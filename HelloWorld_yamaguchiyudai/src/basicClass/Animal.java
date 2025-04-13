package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力
		Dog dog1 = new Dog();
		System.out.println(dog1.getName());

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力
		
		// もう1つインスタンスを作成
		Dog dog2 = new Dog();
		
		// 動物の数を出力
		System.out.println(Dog.getCount());

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		LocalDateTime now = LocalDateTime.now();
		String formattedDateTime = now.format(formatter);
		System.out.println(formattedDateTime);
	}
}
