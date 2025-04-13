package 処理用;

import 実行用.実行;

public class 処理 {
	public static void main(String[] args) {
		// 実行のインスタンスを生成
		実行 実行 = new 実行();
		
		// 挨拶メッセージを出力
		実行.printGreetings();
		
		// 現在の日時を出力
		実行.printCurrentDateTime();
	}
}
