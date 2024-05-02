package p30; //コレクションフレームワーク Map HashMap オプション問題

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample05 {

	public static void main(String[] args) {
	    Map<String, Integer>canon = new HashMap<>(); //キーと値のペアで扱うMap
		
		canon.put("KUDO",20);    
		canon.put("ENDO",30);    
		
		System.out.println(canon.get("OKU"));
		System.out.println(canon.get("KUDO"));
		System.out.println(canon.get("ENDO"));
		
		Set<String> list = canon.keySet();
		
		for(String key : list) {
			System.out.println(key + "..."+ canon.get(key));
		}
	//for (String data : canon) {
		//System.out.println(data);
	}
	
	
}

	 
	   