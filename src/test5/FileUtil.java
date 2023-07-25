package test5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileUtil {

	public String read(String filePath) {
		String List = null;
		try {
			// ファイルのパスを指定する
			File file = new File(filePath);

			// ファイルが存在しない場合に例外が発生するので確認する
			if (!file.exists()) {
				System.out.print("ファイルが存在しません");
				return List;
			}

			// BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String data;
			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}

			// 最後にファイルを閉じてリソースを開放する
			bufferedReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return List;
	}

	public void write(String filePath, List<String> texts) {
		try {
			FileWriter file = new FileWriter(filePath,true);
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			for (String s : texts) {
				pw.println(s);
			}

			pw.close();
			

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
