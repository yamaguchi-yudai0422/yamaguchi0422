package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("12345678901 ");
        String username = scanner.nextLine();
        
        if (username == null || username.trim().isEmpty()) {
            System.out.println("名前を入力してください");
        } else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }
        
        scanner.close();
    }
}
