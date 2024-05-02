package p30; //コレクションフレームワーク 01int型の配列と比較 p.267

import java.util.ArrayList;
import java.util.List;

public class Sample02 {

	public static void main(String[] args) {
	  //ArrayList<Integer>canon = new ArrayList<Integer>(); //intはNG.参照型のIntegerはOK
	  //ArrayList<Integer>canon = new ArrayList<>();
		List<Integer>canon = new ArrayList<>();
		
		canon.add(10);    //0号室
		canon.add(20);    //1号室
		canon.add(30);    //2号室
	
	    canon.add(2,400);
	    canon.remove(1); //1号室内(20)を消す
	
	for( int i = 0; i < canon.size(); i++) { //lengthではなくsize
		System.out.println(canon.get(i));
	}
	System.out.println("-----------");
	for (Integer data : canon) {
		System.out.println(data);
	}
	
	
}}

	 
	   