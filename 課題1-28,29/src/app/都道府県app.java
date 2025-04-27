package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.都道府県;

public class 都道府県app {

    private static final 都道府県[] PREFECTURES = {
        new 都道府県("北海道", "札幌市", 83424),
        new 都道府県("青森県", "青森市", 9646),
        new 都道府県("岩手県", "盛岡市", 15275),
        new 都道府県("宮城県", "仙台市", 7282),
        new 都道府県("秋田県", "秋田市", 11638),
        new 都道府県("山形県", "山形市", 9323),
        new 都道府県("福島県", "福島市", 13784),
        new 都道府県("茨城県", "水戸市", 6097),
        new 都道府県("栃木県", "宇都宮市", 6408),
        new 都道府県("群馬県", "前橋市", 6362),
        new 都道府県("埼玉県", "さいたま市", 3798)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("番号をカンマ区切りで入力してください（例：8,5,9）：");
        String[] indicesInput = scanner.nextLine().split(",");

        System.out.println("昇順なら asc、降順なら desc を入力してください：");
        String order = scanner.nextLine().trim().toLowerCase();

        List<都道府県> selected = new ArrayList<>();

        for (String idxStr : indicesInput) {
            try {
                int idx = Integer.parseInt(idxStr.trim());
                if (idx >= 0 && idx < PREFECTURES.length) {
                    selected.add(PREFECTURES[idx]);
                } else {
                    System.out.println("無効な番号: " + idx);
                }
            } catch (NumberFormatException e) {
                System.out.println("数値ではありません: " + idxStr);
            }
        }

        // 面積順にソート
        selected.sort((a, b) -> {
            if (order.equals("asc")) {
                return Double.compare(b.getArea(), a.getArea());
            } else {
                return Double.compare(a.getArea(), b.getArea());
            }
        });

        // 表示
        System.out.println();
        for (都道府県 p : selected) {
            System.out.println("都道府県名：" + p.getName());
            System.out.println("県庁所在地：" + p.getCapital());
            System.out.println("面積：" + p.getArea() + "km2");
            System.out.println();
        }

        scanner.close();
    }
}
