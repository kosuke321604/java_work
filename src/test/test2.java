package test;

public class test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = randomHit();
		System.out.println(ans + "は7の倍数です");

	}

	public static int randomHit() {
		int a;

		//乱数生成で0をのぞく方法が不明

		while (true) {
			int numRandom = new java.util.Random().nextInt(51);

			if (numRandom % 7 == 0) {
				a = numRandom;
				break;
			}
		}
		return a;
	}
}

//１：乱数発生
//２：7の倍数かどうか
//３ー１：７の倍数であれば終わり
//３ー２：7の7倍数でない場合は再度
//
//
//
//
//
//