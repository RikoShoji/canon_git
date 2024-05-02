package p29; //チェック例外と非チェック例外

public class Sample10 {

	public static void main(String[] args) {
	    
	    
		try {
			//throw new NumberFormatException();
			throw new Exception("エラーエラー");
		} catch(Exception e) {
			System.out.println("エラー!");
			System.out.println(e.getMessage());
			e.printStackTrace(); //エラー箇所の表示
		}finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	          
	
	}
	
}
	 
	   