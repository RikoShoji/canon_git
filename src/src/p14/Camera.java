package p14;

public class Camera {

//フィールド
	  protected String manuf; //メーカー
	
//コンストラクタ
	  public Camera() {
		  
	}
	  
	  public Camera(int a) {
		  this.manuf = manuf;
	}
//アクセッサ・メソッド
	    public String getManuf() {
	       return manuf;
	    }
	    public void setManuf(String manuf) {
	       this.manuf = manuf;  
	    }
	
//メソッド
		public void takePictures() {
			System.out.println("メーカー:"+ manuf);
			System.out.println("写真撮影中");
			
		}

}
