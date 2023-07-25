package chapter01;

public class test_02 {

	// 宿題
	// 引数に渡したint型配列を全て足し、その結果を返すメソッド「accumlate」を作成する
	// メソッド名：accumlate
	// 引数：int[] 計算対象の数値配列
	// 戻り値 int 計算結果の数値

//	int[] intArray = {1,2,3,4,5};
//	int ans = accumlate(intArray);
//	System.out.println("配列の総和は、" + ans + " です。");
	
	public static void main(String[] args) {
	
		int[] intArray = {1,2,3,4,5};
		System.out.println(intArray.length);
		int ans = accumlate(intArray);
	    System.out.println("配列の総和は、" + ans + " です。");
		
	    }

	public static int accumlate(int[] intArray) {
		int sum = 0;
		for(int i=0; i< intArray.length;i++) {
			sum +=intArray[i];
			//1週目　1 sum=1
			//2週目　1+2 sum=3
			//3週目　3+3 sum=6
			//4週目　6+4=10 sum=10
			//5週目　10+5=15 sum=15
		}		
		
		return sum;
	}

}
