package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumI {

	private int[] twoSum(int numbers[], int target) {

		Map<Integer, Integer> arrayIndexMap = new HashMap<>();

		for (int i = 0; i <= numbers.length - 1; i++) {
			if (arrayIndexMap.containsKey(target - numbers[i])) {
				return new int[] { arrayIndexMap.get(target - numbers[i]), i };
			}
			arrayIndexMap.put(numbers[i], i);
		}

		return new int[] { -1, -1 };

	}

	public static void main(String[] args) {

		int[] numbers = { 3, 2, 4 };
		int target = 6;
		TwoSumI t = new TwoSumI();
		int[] i = t.twoSum(numbers, target);
		System.out.println(i);
	}

}
