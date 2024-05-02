package kadai6;

public class Item {
	// フィールド
	private String name;
	private int price;
	// コンストラクタ
    public Item() { //()内ない引数なしのコンストラクタ
		
	}
	public Item(String name, int price) {
		this.name = name;
		this.price = price;  //ここのコンストラクタを生かす
	}
	
	// ゲッターセッター
	public String getName() {  //取得
		return name;
	}
	public void setName(String name) {  //設定
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
	    this.price = price;
	}
	
	
	// 情報出力用showInfoメソッド
	void showInfo() {
		System.out.println("商品名:" + name);     //呼び出されたら
		System.out.println("価格:"+ price + "円");
	}
	  
	
	
	
}
