package 自己紹介プログラム;

class Main {
	  public static void main(String[] args) {
		  
	    // 問題5: weightを追加
	    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

	    // フィールド用出力
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height+ "\n");
	    

	    // インスタンスメソッドの呼び出し（問題6～9）
	    person1.print();

	    // 人数の合計（問題10）
	    person1.printCount();
	  }
	}

