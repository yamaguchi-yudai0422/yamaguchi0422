package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numStudents;
		// 生徒の人数を入力（2以上）
		while (true) {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			if (scanner.hasNextInt()) {
				numStudents = scanner.nextInt();
				if (numStudents >= 2) {
					break;
				} else {
					System.out.println("生徒の人数は2以上で入力してください。");
				}
			} else {
				System.out.println("有効な整数を入力してください。");
				scanner.next(); // 無効な入力をクリア
			}
		}

		// 教科のリスト
		String[] subjects = { "英語", "数学", "理科", "社会" };
		int numSubjects = subjects.length;

		// 成績を格納する2次元配列 [生徒数][教科数]
		double[][] scores = new double[numStudents][numSubjects];

		// 各生徒の成績を入力
		for (int i = 0; i < numStudents; i++) {
			System.out.println("\n" + (i + 1) + "人目の成績を入力してください:");
			for (int j = 0; j < numSubjects; j++) {
				while (true) {
					System.out.print(subjects[j] + "の点数: ");
					if (scanner.hasNextDouble()) {
						double score = scanner.nextDouble();
						if (score >= 0 && score <= 100) {
							scores[i][j] = score;
							break;
						} else {
							System.out.println("点数は0～100の範囲で入力してください。");
						}
					} else {
						System.out.println("有効な数値を入力してください。");
						scanner.next(); // 無効な入力をクリア
					}
				}
			}
		}

		// 各生徒の平均点を計算して出力

		double totalSum = 0; // 全体の平均計算用
		for (int i = 0; i < numStudents; i++) {
			double sum = 0;
			for (int j = 0; j < numSubjects; j++) {
				sum += scores[i][j];
			}
			double average = sum / numSubjects;
			totalSum += sum;
			System.out.printf("%d人目の平均点: %.2f\n", i + 1, average);
		}

		// 各教科の平均点を計算して表示

		double subjectSum = 0; // 全体の平均計算用
		for (int j = 0; j < numSubjects; j++) {
			double subjectTotal = 0;
			for (int i = 0; i < numStudents; i++) {
				subjectTotal += scores[i][j];
			}
			double subjectAvg = subjectTotal / numStudents;
			subjectSum += subjectAvg;
			System.out.printf("%sの平均点は%.2f点です\n", subjects[j], subjectAvg);
		}

		// 全体の平均点を計算して出力
		double overallAverage = subjectSum / numSubjects;
		System.out.printf("全体の平均点: %.2f", overallAverage);

		scanner.close();
	}
}
