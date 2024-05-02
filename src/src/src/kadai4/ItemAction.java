package kadai4;

public class ItemAction {

	public static void main(String[] args) {
       Item item1, item2;
       
       item1 = new Item();
       item2 = new Item();
       
	   item1.name = "絵本";
	   item1.price = 1000;
	   item2.name = "シャンプー";
	   item2.price = 222;

	   System.out.println("名前:" + item1.name);
	   System.out.println("価格:" + item1.price + "円");
	   System.out.println("名前:" + item2.name);
	   System.out.println("価格(税抜):" + item2.price + "円");
	   System.out.println("価格(税込):" + item2.price + "円");
	   
	   item2.showinfo();
	   
	}

}
