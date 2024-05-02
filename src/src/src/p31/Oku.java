package p31;//オーバーライドp.201～203 インターフェイスの実装

public class Oku implements Canon{

	@Override
	public void work() {
		System.out.println(Canon.COMPANY);
		System.out.println("SEです");
		
	}

	@Override
	public void salary() {
		System.out.println("25万円です");
		
	}


}
