package p13;//継承とカプセル化 p.189

public class Camera {
		//フィールド
	  protected String manuf; //メーカー
	
	    //コンストラクタ p.156
	  public Camera() { //デフォルト・コンストラクタ（引数なし）
		  System.out.println();
	}
	  
	  public Camera(int a) {
		  
	}
	    //アクセッサ・メソッド
	    public String getManuf() {
	       return manuf;
	    }
	    public void setManuf(String manuf) {
	       this.manuf = manuf;
	    }
	
		//メソッド
		void takePictures() {
			System.out.println("メーカー:"+ manuf);
			System.out.println("写真を撮る");
			
		
		
		
		
		}

}
