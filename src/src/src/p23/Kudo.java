package p23;//オーバーライドp.201～203 インターフェイスの実装

public class Kudo implements Canon{

	@Override
	public void work() {
		System.out.println(COMPANY);
		System.out.println("経理です");
		
	}

	@Override
	public void salary() {
	    System.out.println("28万円です");
		
	}

	

}