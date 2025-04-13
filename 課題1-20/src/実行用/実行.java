package 実行用;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 実行 {
	// フィールドの定義
	private String message1;
	private String message2;
	private String message3;

	// コンストラクタ
	public 実行() {
		// 挨拶メッセージを設定
		this.message1 = "こんにちは！ここは日本です！";
		this.message2 = "この寿司はうまい";
		this.message3 = "寿司は和食です";
	}

	// 挨拶メッセージを出力
	public void printGreetings() {
		System.out.println(this.message1);
		System.out.println(this.message2);
		System.out.println(this.message3);
	}

	// 現在の日時を出力
	public void printCurrentDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formattedDateTime = now.format(formatter);
		System.out.println("今の現在日時は" + formattedDateTime + "です");
	}
}
