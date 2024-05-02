package p18; //オーバーライド p.201

public class Start {

	public static void main(String[] args) {
//		Human[] canon = new Human[2];
//		
//		canon[0] = new Oku();
//		canon[1] = new Kudo();
		
		Human[] canon = {
				new Oku(),
				new Kudo()
		};
		
		canon[0].eat();
		canon[1].eat();
		
		System.out.println("--------------------");
		
		//配列とfor文 p.106
		for (int i = 0; i < canon.length; i++) {
			canon[i].eat();
		}
		
		System.out.println("--------------------");
		                        //    int       data :   ary
		//拡張for文 p.110       //    String   name  : canon
		for (Human h : canon) { //for(要素の型 変数名:配列変数名){ 処理 }
			h.eat();
		}
	}

}
	   
	   