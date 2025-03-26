package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
	// 変数の初期化と代入
		
    //バイト型
        byte byteVal = 10;
        
       //短整数型
        short shortVal = 100;
        
       //整数型
        int intVal = 1000;
        
       //長整数型
        long longVal = 10000;
        
       //単精度浮動小数点数型
        float floatVal = 9.5f;
        
       //倍精度浮動小数点数型
        double doubleVal = 10.5;
        
       //文字型
        char charVal = 'a';
        
       //文字列型
        String stringVal = "ハロー";
        
       //ブーリアン型
        boolean boolVal = true;
	

     // 計算
        
       // 11110
        int num1 = 11110; 
        
       // 20
        int num2 = 20;
        
       // a+ハロー+true
        int charNum = charVal; 
       
       // 11110 + 20 + 97 = 11130
        int totalSum = num1 + num2 + charNum;
        
       // 10 * 100 * 1000 * 10000 = 10000000000
        long product = (long) byteVal * shortVal * intVal * longVal; 
        
       // 10.5 / 100 = 0.105
        double division = doubleVal / 100; // 10.5 / 100 = 0.105
        
       // 10 - 100 = -90
        int subtraction = byteVal - shortVal; // 10 - 100 = -90

     // 結果を出力
       // 11110 
        System.out.println(num1);
        
       // 20
        System.out.println(num2);
        
       // aハローtrue
        System.out.println(charVal + stringVal + boolVal);
        
       // 11130
        System.out.println(totalSum);
        
       // 10000000000
        System.out.println(product);
        
       // 0.105
        System.out.println(division);
        
       // -90
        System.out.println(subtraction);
	
        
	
	// ハローJAVA2023	
        
        String num3 = "20";
        int num4 = 23;
        System.out.println("ハローJAVA"+(num3 + num4));
        
    // 変数の宣言と代入
        
       // 名前
        String name = "山田太郎";
        
       // 年齢
        int age = 18;
        
       // 身長
        double height = 170.5;
        
       // 体重
        double weight = 62.2;
       
       // 好きな食べ物
        String favoriteFood = "寿司";
        

        // 結果を出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
 
       // BMI計算
        double bmi = weight / (height * height);
        
       // 結果を出力
        System.out.println("BMIは" + bmi + "です");
        
       // 鈴木一郎
        String name2= "鈴木一郎";
        
       // 年齢
        int age2= 48;
        
       // 身長
        double height2= 337.0;
        
       // 体重
        double weight2= 128.4;
        
       // 好きな食べ物
        String favoriteFood2= "オムライス";

       // 結果を出力
        System.out.println("初めまして" + name2+ "です");
        System.out.println("年齢は" + age2+ "歳です");
        System.out.println("身長は" + height2+ "cmです");
        System.out.println("体重は" + weight2+"kgです");
        System.out.println("好きな食べ物は" + favoriteFood2 + "です"); 
        
       // 25歳以上ならtrueと出力される
        boolean isover25 = age2>= 25 ? true : false;
       
       //結果を出力
        System.out.println(isover25);
        
       // 年齢　身長　体重を文字列に変換
        String ageStr = String.valueOf(age2);
        String heightStr = String.valueOf(height2);
        String weightStr = String.valueOf(weight2);
        
       // 連結
        String combined = String.valueOf(age2 + "歳") + String.valueOf(height2 + "cm") + String.valueOf(weight2+"kg");
        
       // 結果を出力
        System.out.println(combined);
        

        
       // 年齢と身長を整数型に変換する
        int age2Int = Integer.parseInt(ageStr);
        int height2Int = (int) Double.parseDouble(heightStr);
        
       // 結果を出力
         System.out.println("年齢は"+age2Int + "歳です");
         System.out.println("身長は"+height2Int + "cmです");

       // 年齢が25 もしくは ⭐身長が160以上の場合、true を出力
         boolean result = (age2Int == 25) || (height2Int >= 160);

        // 結果を出力
         System.out.println(result);
	}
	
}
        
	


