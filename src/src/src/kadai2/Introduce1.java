package kadai2;

public class Introduce1 {
	public static void main (String [] args) {
	introduce("田中太郎",25); //田中太郎は25歳
	
	System.out.println("--------------");
	
	introduce("鈴木一郎",30); //鈴木一郎は30歳
	
     }
    static void introduce (String name,int age) {
	 System.out.println( "田中太郎"+ age + "歳");
	 System.out.println("10年後は"+(age+ 10)+"歳です"); 
    }
 }
//田中太郎25歳です
//10年後は35歳です
//--------------
//田中太郎30歳です
//10年後は40歳です
