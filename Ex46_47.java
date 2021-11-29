package day11;

class Member {
	private String name;
	private int age;
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<0) return;
		this.age = age;
	}


	@Override
	public String toString() {
		return name + "(" + age + ")";     // ex."Tom(20)"
	}
}
public class Ex46_47 {
	public static void main(String[] args) {
		Member user1 = new Member("Tom", 20);
		Member user2 = new Member("Sally", 19);
		//user1.age = -999;
		user1.setAge(-999);
		System.out.println(user1);
		System.out.println(user2);
	}
}







