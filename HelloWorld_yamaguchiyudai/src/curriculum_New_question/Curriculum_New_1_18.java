package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printMessage(String message, int version) {
		System.out.println(message + " " + version);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] arr) {

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiply(double a, double b) {
		System.out.println(a + b);
	}

	// Q5：ランダムな整数（1～100）を生成し、配列に格納・出力して返す
	public static int[] generateRandomArray(int count) {
		Random rand = new Random();
		int[] result = new int[count];

		for (int i = 0; i < count; i++) {
			int value;
			do {
				value = rand.nextInt(100) + 1; // 1〜100
			} while (value == 0);
			result[i] = value;
			System.out.print(value + " ");
		}
		System.out.println();
		return result;
	}

	// Q6：配列の平均値を計算して出力
	public static double average(int[] array) {
		double sum = 0;
		for (int num : array) {
			sum += num;
		}
		double avg = sum / array.length;
		System.out.println(avg);
		return avg;
	}

	// Q7：平均値が50以上ならtrue、未満ならfalseを出力
	public static Object isAboveFifty(double value) {
		if (value >= 50) {
			System.out.println("ture");
			return value;
		} else {
			System.out.println("false");
			return false;
		}
	}

	//出力
	public static void main(String[] args) {

		// Q1：Hello JavaSE 11 と出力
		printMessage("Hello JavaSE", 11);

		// Q2：5と6の乗算結果を出力
		multiply(5, 6);

		// Q3：整数配列を渡して出力
		int[] array = { 1, 2, 3, 4, 5 };
		printArray(array);

		// Q4：オーバーロードで小数の和を出力
		multiply(3.3, 4.7);

		// Q5：1〜100のランダム整数を5個生成・出力・返却
		int[] randomArray = generateRandomArray(3);

		// Q6：Q5の戻り値（配列）の平均値を出力
		double avg = average(randomArray);

		// Q7：Q6の平均値が50以上かを判定・出力
		isAboveFifty(avg);
	}

}
