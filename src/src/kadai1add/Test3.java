package kadai1add;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("国語の点数を入力してください:");
	  int japanese = scan.nextInt();
	  System.out.println("数学の点数を入力してください:");
	  int math = scan.nextInt();
	  System.out.println("英語の点数を入力してください:");
	  int english = scan.nextInt();
	  
	  String maxSubject = "英語";
      int maxScore = english;
	  
      if(math > maxScore) {
    	  maxSubject ="数学";
    	  maxScore = math;
      }
      
      if(japanese> maxScore) {
    	  maxSubject ="国語";
    	  maxScore = japanese;
      }
      	  
	  System.out.println("最高点は"+maxSubject+"で+"+maxScore+ "点です");
	
