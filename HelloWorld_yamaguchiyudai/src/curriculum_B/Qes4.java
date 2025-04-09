package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		// 九九の計算
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				// 0埋めして 出力
				System.out.printf("│%02d×%02d=%02d│", i, j, i * j);
			}

			// 段ごとに改行
			System.out.println();

		}
	}
}
