package kadai3;

public class CalcPoints1 {
	public static void main(String[] args) {
	int price = 1000;
	
	int p1 = getPoints(price, true);
	System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
	
	int p2 = getPoints(price, false);
	System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}
	
	static int getPoints(int price, boolean premier) {
		double per = premier == true ? 0.2 : 0.1;
		
		
		
    int point = (int)(price * per); //double同士の掛け算
    return point; //その結果を返す
	
	
}
    
    }