package kadai5;

public class Item {
	private String name;
	private int price;
    
	Item(){	
	}
	
	Item(String name,int price){
		this.name = name;
		this.price = price;
	}
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
	
	void showInfo1(){
		System.out.println("商品名:" + name);
		System.out.println("価格:" + price + "円");
	}
	void showInfo2(){
		System.out.println("商品名:" + name);
		System.out.println("価格:" + price);
	
	}   
	  
	
	
	
    }
		
	
