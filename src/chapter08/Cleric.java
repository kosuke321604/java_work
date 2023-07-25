package chapter08;

public class Cleric {
	
	String name;
	int hp;
	final int maxhp = 50;
	int mp;
	final int maxmp = 10;

	public void selfAid() {
		this.mp -=5;
		this.hp = this.maxhp;

	}

	
	public int pray(int sec) {
		
		int result = new java.util.Random().nextInt(3)+sec;
		if(result >this.maxmp)
			this.hp=this.maxmp;
		else {
			this.hp=result;
		}
			
	
		return result;
	}
	
	public Cleric() {
		this.hp = 200;
		
	}

}
