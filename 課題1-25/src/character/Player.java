package character;

import java.util.Random;

// サブクラス：プレイヤー用のステータス生成機能を追加
public class Player extends Character {

	// コンストラクタ：名前とランダムステータスを設定
	public Player(String name) {

		// スーパークラスのコンストラクタを呼び出す
		super(name);
		generateRandomStatus();
	}

	// ランダムステータスを生成
	private void generateRandomStatus() {
		Random random = new Random();
		setHp(random.nextInt(1000));
		setMp(random.nextInt(1000));
		setAttack(random.nextInt(500));
		setSpeed(random.nextInt(1000));
		setDefense(random.nextInt(100));
	}
}
