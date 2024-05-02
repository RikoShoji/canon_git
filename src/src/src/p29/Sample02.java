package p29; //Stringクラス(java.lang.String)p.236

public class Sample02 {

	public static void main(String[] args) {
		String s = "ABCXYZCBA";//012345
		
		System.out.println(s); 
		System.out.println(s.length()); //文字の長さ
		System.out.println(s.charAt(2)); //2号室の文字
		System.out.println(s.substring(3)); //3号室以降の文字列
		System.out.println(s.substring(2,5)); //2～4号室以降の文字列
		System.out.println(s.indexOf("C")); //部屋番号の確認
		System.out.println(s.indexOf("D")); //部屋番号の確認
		System.out.println(s.lastIndexOf("C")); //部屋番号の確認
		System.out.println(s.startsWith("ABC")); //指定した文字で始まっている
		System.out.println(s.startsWith("XYZ")); //指定した文字で始まっている
		System.out.println(s.endsWith("CBA")); //指定した文字で終わっている
		System.out.println(s.endsWith("XYZ")); //指定した文字で終わっている
		System.out.println(s.startsWith("XYZ", 3)); //指定した文字で始まっている
		System.out.println(s.startsWith("XYZ", 2)); //指定した文字で始まっている
	   }           
	
	}
	 
	   