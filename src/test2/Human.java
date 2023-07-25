package test2;

public class Human {
	
	private String name;
	private int age;
	
	//コンストラクタ
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name.toString());
	}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name =name;}
	
	public int getAge() {return this.age;}
	public void setAge(int age) {this.age =age;}
	
	public String toString() {
		return "私の名前は"+this.name+"で、年齢は"+this.age;
		
	}	


}
