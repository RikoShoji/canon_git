package kadai5;

public class ItemAction1 {

	public static void main(String[] args) {
		
		Item i1= new Item();
		Item i2 = new Item();
		
		i1.setName("絵本");
		i1.setPrice(1000);
		i2.setName("シャンプー");
		i2.setPrice(222);
		
		
		System.out.println("商品名:"+i1.getName());
		System.out.println("価格:" + i1.getPrice()+ "円");
		System.out.println("商品名:"+i2.getName());
		System.out.println("価格:" + i2.getPrice()+ "円");
		
		
		System.out.println("------");
		
		
		
	}

}