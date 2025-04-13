package animal.main;

import model.Animal;

public class main {
	public static void main(String[] args) {
		// Animalクラスのインスタンスを生成し、フィールドに値を設定
		Animal lion = new Animal("ライオン", 2.1, 80);

		// 動物情報を出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}
