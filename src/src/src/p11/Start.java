package p11;   //継承 p.186

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したphoneクラスのインスタンスを生成
		Phone p= new Phone();
		
		//フィールドとメソッドにアクセス
		p.phonenumber ="090-1234-5678";
		p.maker = "キヤノン";
		
		p.talk();
		p.takePictures();
	}

}
