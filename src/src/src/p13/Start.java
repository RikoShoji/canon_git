package p13;//継承とカプセル化 p.189

public class Start {

		public static void main(String[] args) {
			//Cameraクラスを継承したphoneクラスのインスタンスを生成
			Phone p= new Phone("090-1234-5678","キヤノン");
			
			//フィールドとメソッドにアクセス
			//p.setphonenumber ="090-1234-5678";
			//p.setmanuf = "キヤノン";
			
			p.talk();
			p.takePictures();
		
	}

}
