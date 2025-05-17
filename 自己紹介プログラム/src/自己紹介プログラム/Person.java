package 自己紹介プログラム;

class Person {
	// 問題1: インスタンスフィールドを定義
	  String name;
	  int age;
	  double height;
	  double weight;
	  
	  static int count = 0;
	  
	
	  
	// 問題2,3,4: コンストラクタ定義とインスタンスフィールドに値をセット
	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	 // 人数カウント増加（問題10）
	    this.count++;
	  }
	// 問題6,7: BMIを計算して返すメソッド
	  double bmi() {
	    return this.weight / (this.height * this.height);
	  }
	// 問題8,9: 情報を出力するメソッド
	  void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.printf("BMIは%.2fです\n\n", this.bmi());
	  }
	// 問題10: 人数の合計を出力するstaticメソッド
	  void printCount() {
	    System.out.println("合計" + count + "人です");
	  }
	}


