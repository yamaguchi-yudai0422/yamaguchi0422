package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // ユーザー入力を直接取得
		scanner.close();

		// "、" で分割
		String[] products = input.split("、");

		Random random = new Random();

		for (String product : products) {
			// 空白を削除
			product = product.trim();
			// 空の要素を無視
			if (product.isEmpty())
				continue;
			//入力された値の処理    
			int stock;
			switch (product) {
			case "テレビ":
			case "ディスプレイ":
				// 0〜11のランダムな値
				stock = 11 - random.nextInt(12);
				//テレビ、ディスプレイ
				System.out.println(product + "の残り台数は" + stock + "台です");
				break;
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				// 0〜11のランダムな値
				stock = random.nextInt(12);
				//テレビ、ディスプレイ、パソコン、冷蔵庫、扇風機、洗濯機、加湿器の出力
				System.out.println(product + "の残り台数は" + stock + "台です");
				break;
			default:
				//他の値が入力された場合の出力
				System.out.println("『" + product + "』は指定の商品ではありません");
				break;
			}
		}
	}
}
