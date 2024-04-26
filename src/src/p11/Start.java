package p11;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したphoneクラスのインスタンスを生成
		phone p= new Phone();
		
		//フィールドとメソッドにアクセス
		p.phonenumber ="090-1234-5678";
		p.manuf = "キヤノン";
		
		p.talk();
		p.takePictures();
	}

}
