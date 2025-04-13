package main;

import java.util.Scanner;

import character.Player;

public class Main {
	public static void main(String[] args) {
		// 入力を受け付ける準備
		Scanner scanner = new Scanner(System.in);
		
		// 名前の入力を促す
		System.out.print("名前を入力してください：");
		
		// 入力された名前を取得
		String name = scanner.nextLine();
		
		// プレイヤーキャラを生成（サブクラス）
		Player player = new Player(name);
		
		
		System.out.println(); 

		// 挨拶と名前
		System.out.println("こんにちは 「" + player.getName() + "」 さん");
		
		// ステータス表示の見出し
		System.out.println("ステータス");
		
		// ランダムなHPを表示
		System.out.println("HP：" + player.getHp());
		
		// ランダムなMPを表示
		System.out.println("MP：" + player.getMp());
		
		// ランダムな攻撃力を表示
		System.out.println("攻撃力：" + player.getAttack());
		
		// ランダムな素早さを表示
		System.out.println("素早さ：" + player.getSpeed());
		
		// ランダムな防御力を表示
		System.out.println("防御力：" + player.getDefense());
		

		System.out.println(); 
		
		// 冒険へのメッセージ
		System.out.println("さあ冒険に出かけよう！"); 
		
		scanner.close(); 
	}
}
