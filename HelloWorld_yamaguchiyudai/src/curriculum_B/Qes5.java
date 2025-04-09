package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		// iは001から020まで、jは001から009まで
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 20; j++) {
            	
        // 0埋めして表示
            	 System.out.printf("│%03d×%03d=%03d│", j, i, i * j);
            }
            
        // 段ごとに改行
            System.out.println();
		}
      }
	}

