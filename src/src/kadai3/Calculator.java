package kadai3;

public class Calculator {
	public static void main(String[] args) {
		int a = add(3,7);
		System.out.println(a);
		
		int b = sub(3,7);
		System.out.println(b);
		
		double c = avg(3,7);
		System.out.println(c);	
			
	}
	
	//3と7をここ↓に受け渡して足し算しその結果を返して↑変数a(int a)に格納
	static int add (int x, int y) {
		return x + y;
	}
	
	static int sub (int x, int y) {	
	    return x - y;
	}
	
	static double avg (int x, int y) {
	    return (x + y) / 2.0;	//平均は合計を2で割ったもの
		    
	}
	}
