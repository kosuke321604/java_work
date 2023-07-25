package chapter01;

public class Sample01_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	  System.out.println("おはよう");
	  System.out.println("Kousuke");
	  System.out.println("勉強してる？");
	  System.out.println("計算します～");
	  /*除法の計 */
	  System.out.println(8/4);
	  //変数による計算

	  int x;
	  x = -1;
	  System.out.println(x*x+3);
	  //練習問題１P58 
	  final int a = 3;
	  final int b = 5;
	  System.out.println(a*b);
	  //章巻末問題
	  System.out.println("ようこそ占いの館へ");
	  System.out.println("あなた名前を入力してください");
	  //年齢の入力
	  String name = new java.util.Scanner(System.in).nextLine();	  
	  String z = "年齢";
	  System.out.println("あなたの"+z+"を入力してください");
	  String ageString = new java.util.Scanner(System.in).nextLine();
	  int age = Integer.parseInt(ageString);
	  int fourtune =new java.util.Random().nextInt(4);
	  fourtune++;
	  System.out.println("占いの結果が出ました");
	  System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fourtune+"です");
	  String parameter = "1:大吉 2:中吉 3:吉 4:凶";
	  System.out.println(parameter);
      
	  int temp = 50;
	   temp--;
	   System.out.println(temp);
	   
	  
	  
	  
	}

}
