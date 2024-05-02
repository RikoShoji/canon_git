package kadai7;

import java.util.ArrayList;
import java.util.List;

public class StringCart1 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("ロボット掃除機");
		list.add("ドラム洗濯機");
		list.add("液晶テレビ");
        
		for(String s : list) {
			System.out.println(s);
		}
	}

}
