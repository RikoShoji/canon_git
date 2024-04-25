package kadai4;

public class Item {
 //フィールド(名前と価格)を定義
    String name; //商品名
    int price;   //価格
  
    void showinfo() {
    	int tax = (int) (price*0.1);
 
    	System.out.println("名前" + name);
    	System.out.println("価格(税抜)" + price);
    	System.out.println("価格(税込)" + (price + tax) + "円");
    	
    	}
    	
    	
    	
    }
    
    

