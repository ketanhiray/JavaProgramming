package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNoUsingCollection {

	public static void main(String[] args) {

		List<Integer> listN = new ArrayList<>();

		Collections.addAll(listN, 1, 2, 3, 4, 5, 6);

		Collections.sort(listN, Collections.reverseOrder());

		if (listN.size() < 2) {

			System.out.println("No Second Largest Element");
		} else {

			System.out.println("Second Largest Element is:  " + listN.get(1));
		}

	}

}
