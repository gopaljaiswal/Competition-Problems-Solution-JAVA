package New_Code_Tym;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaSubset {
	static void subSet(Integer[] set) {
		int c = set.length;
		int count = 0;
		for (int i = 0; i < (1 << c); i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < c; j++) {
				if ((i & (1 << j)) > 0) {
					list.add(set[j]);
				}
			}

			if (list.size() > 1) {
				Integer a = set[list.get(0)];
				for (int k = 1; k < list.size(); k++) {
					a = a ^ set[list.get(k)];
					if (a == 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Integer c[] = { 2, 2, 3, 2, 1, 2 };
		subSet(c);
	}

}
