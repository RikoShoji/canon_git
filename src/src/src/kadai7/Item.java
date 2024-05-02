package kadai7;

public class Item {
		private String name;
		private int price;
		//コンストラクタ
		public Item(){
			
		}
        public Item(String name, int price){
        	this.name = name;
        	this.name = name;
        }
      //セッタ＆ゲッタ
    	public String getName() {
    		return name;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}

    	public int getPrice() {
    		return price;
    	}

    	public void setPrice(int price) {
    		this.price = price;
    	}
    	
    	//showInfoメソッド
    	public void showInfo() {
    		System.out.println("商品名：" + name);
    		System.out.println("価格：" + price + "円");
    	
	}

}
