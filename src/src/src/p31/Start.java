package p31;     //テスト出ます List interface p.267 

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Canon can = new Canon();
		//Canon[] list = new Canon[2]; //配列とfor文 p.106
		List <Canon> list = new ArrayList<>();   
		//list[0] = new Oku();
		//list[1] = new Kudo();
		
		list.add(new Oku());  //0
		list.add(new Kudo()); //1
		
		for (Canon c : list) {
			c.work();
			c.salary();  // ポリモーフィズムp.207 多様性がアルネ！
		}
	    
	    
	   
	 
	   }
	}
	   
	   