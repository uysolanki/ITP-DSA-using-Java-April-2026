package day36;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownstreamDemo {
	public static void main(String[] args) {

		List<String> months = new ArrayList(Arrays.asList("January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"));

		Map<Integer, List<String>> hashmap = months.stream().collect(Collectors.groupingBy(String::length));

		System.out.println(hashmap);

		Map<Integer, List<String>> hashmap1 = months.stream().collect(
				Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));

		System.out.println(hashmap1);

		Map<Integer, String> hashmap2 = months.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.joining("-")));

		System.out.println(hashmap2);

		Map<Integer,String> hashmap3 = months.stream().collect(
				Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.joining("-"))));

		System.out.println(hashmap3);
	}
}

//[June-July]