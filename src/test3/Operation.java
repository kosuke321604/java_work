package test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Operation {

	public static void main(String[] args) {

		//	前回作成した、Humanクラスのインスタンスを５つ作成し、
		//	ArrayList、HashSet、HashMapに格納し、表示してください。
		//	HashMapについては、key値が必要ですが、１〜の連番にしてください。
		Human a = new Human("太郎", 15);
		Human b = new Human("次郎", 16);
		Human c = new Human("三郎", 17);
		Human d = new Human("四郎", 18);
		Human e = new Human("五郎", 19);

		List<Human> classname = new ArrayList<Human>();

		classname.add(a);
		classname.add(b);
		classname.add(c);
		classname.add(d);
		classname.add(e);

		//    classname.get(0);	
		//	classname.remove(3);

		for (Object i : classname)
			;
		{

			System.out.println();
		}

		Set<Human> classname1 = new HashSet<Human>();
		classname1.add(a);
		classname1.add(b);
		classname1.add(c);
		classname1.add(d);
		classname1.add(e);

		//	System.out.println("格納個数は"+classname1.size());	
		for (Human h : classname1)
			;
		{

			System.out.println();
		}

		Map<Integer, Human> classname2 = new HashMap<>();
		classname2.put(1, a);
		classname2.put(2, b);
		classname2.put(3, c);
		classname2.put(4, d);
		classname2.put(5, e);
		for (int key : classname2.keySet()) {
			Human value = classname2.get(key);

			System.out.println(key + "クラスは" + value);
		}

	}

}
