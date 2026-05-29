package day30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostRepeatedWordInAStringUsingStreamAPI2 {
	public static void main(String[] args) {
		String str = "one one one two two one three three four";

		String arr[] = str.split(" "); // ["one", "one", "one", "two", "two", "one", "three", "three", "four"]

		Map<String, Long> hashmap = new HashMap();

		Entry<String, Long> maxEntry = Arrays
				.stream(arr)
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.orElse(null);

		System.out.println("Word with maximum occurance : " + maxEntry.getKey() + "->" + maxEntry.getValue());
	}
}
