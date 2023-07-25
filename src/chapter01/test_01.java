package chapter01;

public class test_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		System.out.println("数を入力してください");
	    int num = new java.util.Scanner(System.in).nextInt();
	    while(num < 1 || num > 10 ) {
	    	System.out.println("入力された値は"+num+"でした");
	    	System.out.println("正しい数を入力してください");
	    	num = new java.util.Scanner(System.in).nextInt();
	    	
	    }
	     int total = 1;
		 for (int i = 1; i <= num; i++) {
		 total *= i;
		 
	     }
		
		 System.out.print(total);
		 
	  
	   
	    
		
//		System.out.println("数を入力してください");
//	    int num = new java.util.Scanner(System.in).nextInt();
//	    while(num >= 11) {
//	    	System.out.println("正しい数を入力してください");
//		     new java.util.Scanner(System.in).nextInt();
//	    }
//	     int total = 1;
//		 for (int i = 1; i < num; i++) {
//			 total = total * (i + 1);
//	     }
	}

}
////			
//		if(num<=10) {
//			
//		}else {
//			System.out.println("再度入力");
//			int num = new java.util.Scanner(System.in).nextInt();
//			
//		}
//			
	    
		
		
//		System.out.println("数を入力してください");
//		int num = new java.util.Scanner(System.in).nextInt();
//		if(num <= 10) {
//			int total = 1;
//			for (int i = 1; i <= num; i++) {
//				System.out.println(total *= i);
//			}
			
//		
//		do {
//			System.out.println("数を入力してください");
//			int num = new java.util.Scanner(System.in).nextInt();
//			if(num <= 10) {
//				int total = 1;
//				for (int i = 1; i <= num; i++) {
//					System.out.println(total *= i);
//				}
//			}
//			System.out.println("数を入力してください");
//			int num = new java.util.Scanner(System.in).nextInt();
//			
//		 } while(num<100); 



