package p29; //Exception

public class Sample08 {

	public static void main(String[] args) {
	
		try {
			System.out.println(10 / 2);
			System.out.println(Integer.parseInt("100"));
		} catch(ArithmeticException e) {
			System.out.println("0で割れないよ!");
		}
		catch(NumberFormatException e){
			System.out.println("数値に変換されないよ！");
			
		}finally {
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	          
	
	}
	
}
	 
	   