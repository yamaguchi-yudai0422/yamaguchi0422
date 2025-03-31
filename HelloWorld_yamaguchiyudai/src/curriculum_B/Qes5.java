package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		// iは001から015まで、jは001から009まで
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 9; j++) {
            	
        // 0埋めして表示
            	 System.out.printf("│%03d×%03d=%03d│", i, j, i * j);
            }
            
        // 段ごとに改行
            System.out.println();
		}
      }
	}

