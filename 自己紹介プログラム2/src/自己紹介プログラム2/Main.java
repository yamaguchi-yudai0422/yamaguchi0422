package 自己紹介プログラム2;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// 問題3：countを直接使って出力
		System.out.println("合計" + Person.count + "人です\n");

		// 問題6：クラスメソッドを呼び出し
		Person.printCount();
	}
}
