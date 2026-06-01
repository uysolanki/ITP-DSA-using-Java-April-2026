package day30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostRepeatedCharInAWordUsingStreamAPI {
	public static void main(String[] args) {
		String str = "mahendra";
		//String str = "my name is nitin";
		
		str=str.replaceAll("\\s+", "").toLowerCase();

		Entry<Character, Long> maxEntry = str.chars()
				.mapToObj(ch->(char)ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.orElse(null);

		System.out.println("Character with maximum occurance : " + maxEntry.getKey() + "->" + maxEntry.getValue());
	}
}
