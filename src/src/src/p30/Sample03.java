package p30; //コレクションフレームワーク 01int型の配列と比較 p.267

import java.util.HashSet;
import java.util.Set;

public class Sample03 {

	public static void main(String[] args) {
	    Set<Integer>canon = new HashSet<>(); //番号で管理されないタイプ　ランダム　順番保証されてない
		
		canon.add(10);    //0号室
		canon.add(20);    //1号室
		canon.add(30);    //2号室
		//canon.add(10);  重複したデータは格納されない(10と10)

	for (Integer data : canon) {
		System.out.println(data);
	}
	
	
}}

	 
	   