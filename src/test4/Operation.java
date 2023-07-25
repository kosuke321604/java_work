package test4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter file = new FileWriter("/Users/ksrs3/java_work/java_new.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));
			
			pw.println("Hello");
			pw.println("world");
			
			List<String> contents = new ArrayList<String>();
			contents.add("リンゴ");
			contents.add("オレンジ");
			contents.add("メロン");
			
			for(String s:contents) {
				pw.println(s);
				}
					
			
			pw.close();
			
		} catch(IOException e){
			e.printStackTrace();			
			
		}
		
		
		try {
			File file = new File("/Users/ksrs3/java_work/java_new.txt");
			if(file.exists()) {
				
				FileReader filereader = new FileReader(file);
				
				int data;
                while((data = filereader.read()) != -1) {
                    System.out.print((char) data);
                }
				
			}else {
				 System.out.print("ファイルなし");
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
