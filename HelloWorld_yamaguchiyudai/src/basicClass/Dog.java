package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義
    private String name;

    // Q2：フィールドに動物の数の変数を定義
    private static int count = 0;  // staticでインスタンス間で共有

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタ
    public Dog() {
        this.name = "マックス" ;
        count++;  // 新しいインスタンスを作成するたびに動物の数を増やす
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタ
    public Dog(int count) {
        Dog.count = count;  // 引数で渡された数を動物の数に設定
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 動物の数を取得するメソッド
    public static int getCount() {
        return count;
    }
}


