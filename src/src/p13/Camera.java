package p13;

public class Camera {

	public static void main(String[] args) {
		//フィールド
	  protected String manuf; //メーカー
	
	    //コンストラクタ
	  public Camera() {
		  System.out.println();
	}
	  
	  public Camera(int a) {
		  
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
