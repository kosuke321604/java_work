package chapter11;

public class book extends TangibleAsset{
	
	String isbn;
	//コンストラクタ
	public book(String name,int price,String color,String isbn) {
		super(name,price,color);
		this.isbn=isbn;
			
	}
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getcolor() {return this.color;}
	public String getIsbn() {return this.isbn;}
	@Override
	public void setweight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

}
