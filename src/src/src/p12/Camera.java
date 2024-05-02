package p12;

public class Camera {
		//フィールド
	  private String maker; //メーカー
	
	    //コンストラクタ
	  public Camera() {
		  System.out.println("Cameraコンストラクタ1");
	}
	  
	  public Camera(int a) {
		  System.out.println("Cameraコンストラクタ2");
	}
	    //アクセッサ・メソッド
	    public String getMaker() {
	       return maker;
	    }
	    public void setMaker(String maker) {
	       this.maker = maker;
	    }
	
		//メソッド
		public void takePictures() {
			System.out.println("メーカー:"+ maker);
			System.out.println("写真を撮る");
		}

}
