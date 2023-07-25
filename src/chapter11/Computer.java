package chapter11;

public class Computer extends TangibleAsset{
	String makerName;
	
	public Computer
	(String name,int price,String color,String makerName) {
		super(name,price,color);
		this.makerName=makerName;
	}
	
	
	public String getMakername() {return this.makerName;}


	@Override
	public void setweight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
