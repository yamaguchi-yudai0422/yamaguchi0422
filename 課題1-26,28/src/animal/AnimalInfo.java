package animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalInfo {

    // 学名マップ（対応する名前）
    private static final Map<String, String> scientificNames = new HashMap<>();

    static {
        scientificNames.put("ライオン", "パンテラ レオ");
        scientificNames.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificNames.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificNames.put("チンパンジー", "パン・トゥログロディテス");
        scientificNames.put("シマウマ", "チャップマンシマウマ");
        // インコはマップに登録しない（出力は「不明」）
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("コンソールに文字を入力してください");

        String input = scanner.nextLine(); // 入力を読み取る

        // カンマで動物ごとに分割
        String[] animalEntries = input.split(",");

        for (String entry : animalEntries) {
            // 各動物データを「:」で分解
            String[] parts = entry.split(":");
            if (parts.length != 3) {
                System.out.println("データ形式が正しくありません: " + entry);
                continue;
            }

            String name = parts[0];
            String length = parts[1];
            String speed = parts[2];

            String scientificName = scientificNames.getOrDefault(name, "不明");

            // 表示
            System.out.println();
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
        }

        scanner.close();
    }
}
