package test5;

import java.util.ArrayList;
import java.util.List;

public class FileOperation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileUtil e =new FileUtil();
		
		String filePath = "/Users/ksrs3/java_work/java_new.txt";
		
		System.out.println("以下を入力してください");
		System.out.println("1:書き込み、2:表示、左記以外：終了" );
		int num = new java.util.Scanner(System.in).nextInt();
		
		switch(num) {
		case 1:
			System.out.println("書き込む文字列を入力してください" );
			List<String> texts = new ArrayList<String>();
			String textsContents = new java.util.Scanner(System.in).nextLine();
		
			texts.add(textsContents);
			
			e.write(filePath,texts);
			System.out.println("書き込みました" );
					
		break;
		
		case 2:
			e.read(filePath);
			
		
		break;
		default:
			System.out.println("終了しました");
			
		} 
			
		
		
		

	}

}
