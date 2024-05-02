package p29; //メソッドと例外 p.255

public class Sample11 {

	public static void main(String[] args) {
	    
		//try {
	
		//} catch(Exception e) {
			//System.out.println("エラー!");
			//System.out.println(e.getMessage());
			//e.printStackTrace(); //エラー箇所の表示
		//}finally {
			//System.out.println("例外処理終了");
		//}
		//System.out.println("終了");
	       try {
			System.out.println(waru(10,0));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}        //throws ArithmeticExceptionの時はthrows Exceptionはいらない
	public static int waru(int x, int y) throws Exception { //非チェック例外の時はthrowsいらない
		if (y==0) {
			throw new Exception("0で割れないよ！"); //0による徐算 throw new ExceptionはNG.19行目がExceptionnaraOK
		}    
	
		return x/y;
	}
}
	 
	   