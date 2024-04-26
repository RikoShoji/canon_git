package p12;

public class Camera {

	public static void main(String[] args) {
		//フィールド
	  private String manuf; //メーカー
	
	    //コンストラクタ
	  public Camera() {
		  System.out.println("Cameraコンストラクタ1");
	}
	  
	  public Camera() {
		  System.out.println("Cameraコンストラクタ2");
	}
	    //アクセッサ・メソッド
	    public String getManuf() {
	       return manuf;
	     
	    public String setManuf(String manuf) {
	       this.manuf = manuf;
	    }
	
		//メソッド
		void takePictures() {
			System.out.println("メーカー:"+ manuf);
			System.out.println("写真を撮る");
			
		
		
		
		
		}

}
