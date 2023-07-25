package chapter10;

public class Hero {
	String name;
	int hp;
	
	public void attack() {
		System.out.println(this.name+"は攻撃した");
		
	}
	
	public Hero() {
		 hp=100;
	}

}
