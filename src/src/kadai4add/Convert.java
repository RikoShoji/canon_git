package kadai4add;

public class Convert {
	static void reverse(int x) {
		for (int i = x; i > 0; i /= 10) {
			System.out.print(i % 10);
		}
	        System.out.println();
		
	    }
	
	static void reverse(double x) {
		char[] moji = String.valueOf(x).toCharArray();
		
		for (int i = moji.length - 1; i >= 0; i--) {
			System.out.print(moji[i]);
		}
		
		System.out.println();
	}
	
	static void reverse(String s) {

		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
	}
}
    	
    


