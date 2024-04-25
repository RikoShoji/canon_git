package kadai3;

import java.util.Scanner;

public class CalcPoints2 {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("購入金額：");
	int price = scan.nextInt();
	//直接代入するかキーボードで入力するか
	
	System.out.println("1:プレミア会員","2:無料会員");
	System.out.print("会員ランク:");
	int rank = scan.nextInt();
	
	String member = rank == 1 ? "プレミア会員" : "無料会員";
	boolean premier = (rank == 1);
	
	
	int point = getPoints (price, premier);
	System.out.println(member + "には" + point + "ポイント付与されます");
	}
	
	
	static int getPoints(int price, boolean premier) {
		double per = premier == true ? 0.2 : 0.1;
		
		
    int point = (int)(price * per);
    return point;
	
	
}
    
    }