package curriculum_B;

import java.util.Random;

public class Qes1_3 {

	public static void main(String[] args) {
		// 名前を入力
		String username = "abcd1234";

		// ユーザー名の文字数が10文字以上だった場合も処理
		if (username == null || username.trim().isEmpty()) {
			System.out.println("名前を入力してください");
		}
		// ユーザー名が半角数字以外の場合の処理
		else if (!username.matches("[a-zA-Z0-9]+")) {
			System.out.println("半角英数字のみで名前を入力してください");
		}
		// ユーザー名が0文字以下の場合の処理  
		else if (username.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}
		// ユーザー名が正常の値の場合の処理  
		else {
			System.out.println("ユーザー名「" + username + "」を登録しました");

			Random random = new Random();
			String[] hands = { "グー", "チョキ", "パー" };
			String name = username;
			int count = 0;

			System.out.println("じゃんけんゲーム開始！");

			while (true) {
				count++;
				int playerHand = random.nextInt(3);
				int computerHand = random.nextInt(3);

				System.out.println(name + "の手は「" + hands[playerHand] + "」");
				System.out.println("相手の手は「" + hands[computerHand] + "」");

				if ((playerHand == 0 && computerHand == 1) ||
						(playerHand == 1 && computerHand == 2) ||
						(playerHand == 2 && computerHand == 0)) {
					System.out.println("やるやん。次は俺にリベンジさせて");
					break;
				} else if (playerHand == computerHand) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				} else if (playerHand == 2 && computerHand == 1) { // チョキに負けた
					System.out.println("たかがじゃんけん、そう思ってないですか？　それやったら次も、俺が勝ちますよ");
				} else if (playerHand == 1 && computerHand == 0) { // グーに負けた
					System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");
				} else if (playerHand == 0 && computerHand == 2) { // パーに負けた
					System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
				}
			}

			System.out.println("勝つまでにかかった合計回数は" + count + "回です");

		}
	}
}