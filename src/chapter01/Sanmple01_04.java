package chapter01;

public class Sanmple01_04 {

	public static void main(String[] args) {
	int[] info = {2,10};
	
	int trians = calcTriangleArea(info);
	System.out.println(trians);	
	
	int[] circleinfo = {5,5};
	
	int circleans = calcCircleArea(circleinfo);
	System.out.println(circleans);	
	
	}
	
	public static int calcTriangleArea(int[] info) {
	int triangle;
	triangle = 1;
	for(int i=0;i<info.length;i++) {
		triangle *=info[i];		
	}

	return triangle*1/2;
	}
	
	public static int calcCircleArea(int[] circleinfo) {
		int circle;
		circle = 1;
		for(int i=0;i<circleinfo.length;i++) {
			circle +=circleinfo[i];		
	}

	return circle*(int)3.14;
	}
	
	
	
		// TODO 自動生成されたメソッド・スタブ
//		introduceOneself();
//		email("依頼","kosuke@gmail","仕事いらんな");
//		email("kosuke@gmail","仕事いらんな");
//		
//
//	}
//	
//	public static void email(String title,String adress,String text) {
//		
//	    System.out.println(adress+"に以下のメールを受信しました");
//	    System.out.println("件名："+title);
//	    System.out.println("本文："+text);	    
//	
//	
//	}   
//	    public static void email(String adress,String text) {
//		
//	    System.out.println(adress+"に以下のメールを受信しました");
//	    System.out.println("件名：無題");
//	    System.out.println("本文："+text);	    
//	
//	
//	}

	
//	public static void introduceOneself() {
//		String name = "すぎうら";
//		int age = 30;
//		float height = 173.5F;
//		char animal = '魚';
//		System.out.println("私の名前は"+name);
//		System.out.println("年齢は"+age);
//		System.out.println("身長は"+height);
//		System.out.println("干支は"+animal);
//				
//	}
	
	
	
}

