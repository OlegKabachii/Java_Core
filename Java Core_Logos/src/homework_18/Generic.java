package homework_18;

import java.util.ArrayList;
import java.util.List;

public class Generic {
	static List<Integer> list = new ArrayList<>();

		public static void main(String[] args) {
			add(list);
			System.out.println(list);
		}

		public static <T> void add(List<T> list) {
			list.add((T) (Integer) 123);
			list.add((T) "Java");
		}  

	}


