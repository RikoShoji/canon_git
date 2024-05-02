package p29; //Exception

public class Sample09 {

	public static void main(String[] args) {
	
		try {
			System.out.println(10 / 2);
			System.out.println(Integer.parseInt("100"));
		} catch(Exception e) {
			System.out.println("エラー!");
		}finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	          
	
	}
	
}
	 
	   