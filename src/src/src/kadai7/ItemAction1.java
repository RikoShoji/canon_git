package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction1 {

	public static void main(String[] args) {
		
	    List<Item> list = new ArrayList<>();
	    
	    list.add(new Item("ロボット掃除機",50000));
	    list.add(new Item("	ドラム式洗濯機",20000));
	    list.add(new Item("液晶テレビ",10000));
	    
	    for(Item i : list) {
	    	i.showInfo();
	    	System.out.println("---------");
	    }
	    

	}

}
