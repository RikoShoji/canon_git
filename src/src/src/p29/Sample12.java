package p29; //メソッドと例外 p.255

public class Sample12 {

	public static void main(String[] args) {
		try{
			System.out.println(tasu(1,-2));
	} catch(TasuException e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}
	
	public static int tasu(int x, int y) throws TasuException { //Exceptionでも可
		int result = x + y;
		if(result <= 0) {
			//何らかの例外をスローする
			throw new TasuException("加算結果が負の値になったよ");
		}
	    return result;
	}
	
	public static int waru(int x, int y) { //
		int result = x / y;
		
		return result;
	}
}
	 
	   