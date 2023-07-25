/**
 * 
 */
package chapter01;

/**
 * @author ksrs3
 *
 */
public class Sample01_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	 String a = "おやすみ";
	 System.out.println(a);
	 
	 /*int temp = 50;
	 while(temp<25) {
	   temp--;
	   System.out.println("温度下げました");
	 }*/
	 
	 for(int i = 0;i < 10; i++) {
		 System.out.print("こんにちは");
	 }
     for(int i= 0;i < 4;i++){
    	 System.out.print
    	 ("現在"+(i+1)+"週目→");
     }	 
    //3章練習問題
    /* 練習問題　3-1
     weight==60
    (age1+age2)*2 > 60
    age % 2 = 1
    name=="奏"
    */
    
    // 練習３ー３
    int isHungry = 0;
    isHungry++;
    String food = "お寿司";
    System.out.println("こんにちは");
    if (isHungry == 0) {
    	System.out.println("おなかいっぱい");
    	
    }else {
    	System.out.println("はらぺこです");
    	
    }
    if(isHungry>=1) {
    	System.out.println(food+"をいただきます");
    }else {
    	System.out.println("別に");
    	
    }
    System.out.println("ごちそうさまでした");
    /*練習３―４
    System.out.print("《メニュー》1:検索　2：登録　3：削除　4：変更");
    System.out.println(" ");
    String stringSekected = new java.util.Scanner(System.in).nextLine();
    int selected = Integer.parseInt(stringSekected);
    switch(selected) {
     case 1:
    	 System.out.println("検索します");
    	 break;
     case 2:
    	 System.out.println("登録します");
    	 break;
     case 3:
    	 System.out.println("削除します");
    	 break;
     case 4:
    	 System.out.println("変更します");
    	 break;      
    }*/
    
    System.out.println("数あてゲーム");
    int ans =new java.util.Random().nextInt(10);
    System.out.println(ans);
    for (int i=0;i<6;i++) {
    	System.out.println("数字入力");
    	String stringNum = new java.util.Scanner(System.in).nextLine();
        int num = Integer.parseInt(stringNum);
         if(num == ans) {
        	 System.out.println("あたり");
        	 break;
         }else {
        	 System.out.println("ちがう");
        	 
         }        
        
    }
    System.out.println("ゲーム終了");
    
    
	

	}
    
}