package exam09;

public class Exam2 {

	public static void main(String[] args) {
		//int[] ary;
		//ary = new int[5];
		//ary[0] = 1;
		//ary[1] = 5;
		//ary[2] = 4;
		//ary[3] = 3;
		//ary[4] = 2;
		int[] ary = {1, 5, 4, 3, 2};
		
		// 拡張for文とif文を利用して奇数の値だけを出力する 
		for(int data : ary) {
		     if(data % 2 !=0) {
			System.out.println(data);
			continue;
		     }
		System.out.println(data);
	}

}
	}
