package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("数字を入力してください");
		int data = scan.nextInt();
		
		//三項演算子でチェック
		String judge1 = data >= 0 ? "正" : "負";
		String judge2 = data % 2 == 0 ? "偶数" : "奇数";
		
		System.out.println ( data +"は" + judge1 + "の" + judge2 + "です");
		
	
		
		
	}

}
