package kadai4;

public class UserAction1 {

	public static void main(String[] args) {
       User user1, user2;
       
       user1 = new User();
       user2 = new User();
       
	   user1.name = "田中太郎";
	   user1.age = 20;
	   user2.name = "鈴木一郎";
	   user2.age = 25;

	   System.out.println("名前:" + user1.name);
	   System.out.println("年齢:" + user1.age );
	   System.out.println("名前:" + user2.name);
	   System.out.println("年齢:" + user2.age );
	}

}
