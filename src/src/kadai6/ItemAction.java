package kadai6;

public class ItemAction {

	public static void main(String[] args) {
		
		Item i1;
		Item i2;
		i1 = new Item();
		i2 = new Item();
	    
		i1.setName("ロボット掃除機");
		i2.setName("洗濯機");
		i1.setPrice(50000);
		i2.setPrice(20000);
		
		
		System.out.println("商品名:"+ i1.getName);
		System.out.println("洗濯機:" + i2.getName);
		System.out.println("価格:"+ i1.getPrice + "円");
		System.out.println("価格:" + i2.getPrice + "円");
		
		
	
	}

}
