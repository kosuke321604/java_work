package chapter10;

public class PoisonMatango extends Matango {
	
	int poisonAttacktime = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
		
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ"+this.suffix+"の攻撃");
		System.out.println("10のダメージ");
		h.hp -=10;
		
		if(poisonAttacktime!=0) {
			System.out.println("さらに毒をはいた！");
			int poisondamage;
			poisondamage = h.hp*1/5;
			h.hp-=poisondamage;
			System.out.println(h.name+"に"+poisondamage+"ポイントのダメージ");
			poisonAttacktime-=1;
			
			
		}
	}
	

}
